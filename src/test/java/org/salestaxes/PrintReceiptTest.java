package org.salestaxes;

import java.util.UUID;

import org.junit.Test;
import org.salestaxes.items.Article;
import org.salestaxes.items.Book;
import org.salestaxes.items.Drug;
import org.salestaxes.items.Food;
import org.salestaxes.items.ImportedArticle;
import org.salestaxes.items.Music;
import org.salestaxes.items.Perfume;
import org.salestaxes.items.category.AudioFormat;
import org.salestaxes.order.ArticleOrder;
import org.salestaxes.order.ShoppingCart;
import org.salestaxes.utility.Printer;

public class PrintReceiptTest {

	/*
	 * 1 book at 12.49 1 music CD at 14.99 1 chocolate bar at 0.85
	 */
	@Test
	public void test1() {

		ShoppingCart cart = new ShoppingCart();

		Article article = new Book(UUID.randomUUID().toString(), 12.49f, "The Lord of the Rings", "EditorX", 2013,
				"J. R. R. Tolkien");
		cart.addOrder(new ArticleOrder(1, article));

		article = new Music(UUID.randomUUID().toString(), 14.99f, "In the Court of the Crimson King", "Crimson King",
				44, "prog rock", AudioFormat.CD);
		cart.addOrder(new ArticleOrder(1, article));

		article = new Food(UUID.randomUUID().toString(), 0.85f, "Milka Chocolate bar", 80, "Chocolate bar");
		cart.addOrder(new ArticleOrder(1, article));

		Printer.printReceipt(cart);
	}

	/*
	 * 1 imported box of chocolates at 10.00 1 imported bottle of perfume at 47.50
	 */
	@Test
	public void test2() {
		ShoppingCart cart = new ShoppingCart();

		Article article = new ImportedArticle(
				new Food(UUID.randomUUID().toString(), 10f, "Milka Chocolate Box", 80, "Box of chocolates"));
		cart.addOrder(new ArticleOrder(1, article));

		article = new ImportedArticle(new Perfume(UUID.randomUUID().toString(), 47.5f, "Chanel Bottle Perfume", 250));
		cart.addOrder(new ArticleOrder(1, article));

		Printer.printReceipt(cart);
	}

	/*
	 * 1 imported bottle of perfume at 27.99 1 bottle of perfume at 18.99 1 packet
	 * of headache pills at 9.75 1 box of imported chocolates at 11.25
	 */
	@Test
	public void test3() {
		ShoppingCart cart = new ShoppingCart();

		Article article = new ImportedArticle(
				new Perfume(UUID.randomUUID().toString(), 27.99f, "Dior Bottle Perfume", 250));
		cart.addOrder(new ArticleOrder(1, article));

		article = new Perfume(UUID.randomUUID().toString(), 18.99f, "Boss Bottle Perfume", 250);
		cart.addOrder(new ArticleOrder(1, article));

		article = new Drug(UUID.randomUUID().toString(), 9.75f, "Bayer Headache Pills Nova", "Bayer", "Headache pills");
		cart.addOrder(new ArticleOrder(1, article));

		article = new ImportedArticle(
				new Food(UUID.randomUUID().toString(), 11.25f, "Nestle Chocolate Box", 80, "Box of chocolates"));
		cart.addOrder(new ArticleOrder(1, article));

		Printer.printReceipt(cart);
	}

}
