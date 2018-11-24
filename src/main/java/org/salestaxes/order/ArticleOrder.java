package org.salestaxes.order;

import static org.salestaxes.utility.Constants.TAX_ROUND_FACTOR;

import org.salestaxes.items.Article;
import org.salestaxes.utility.Utilities;

public class ArticleOrder {

	private int quantity;
	private Article article;

	public ArticleOrder(int quantity, Article article) {
		super();
		this.quantity = quantity;
		this.article = article;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public double computePriceWithNoTax() {
		double value = article.getPrice() * quantity;
		return Math.round(value * 100) / 100.0;
	}

	public double computeSalesTaxValue() {
		double value = article.getPrice() * quantity * article.getSalesTax();
		return Math.ceil(value * TAX_ROUND_FACTOR) / TAX_ROUND_FACTOR;
	}

	public double computeArticleOrderPrice() {
		return article.getPrice() * quantity + computeSalesTaxValue();
	}

	@Override
	public String toString() {
		return quantity + " " + article.getTitle() + ": "
				+ Utilities.getDecimalFormatter().format(computeArticleOrderPrice());
	}

}
