package org.salestaxes;

import java.util.List;

import org.salestaxes.order.ArticleOrder;
import org.salestaxes.order.ShoppingCart;
import org.salestaxes.utility.Utilities;

public class Printer {

	private Printer() {

	}

	public static void printReceipt(ShoppingCart cart) {

		System.out.println("-------- RECEIPT ------------");

		List<ArticleOrder> orders = cart.getOrders();

		// print articles
		orders.stream().forEach(System.out::println);

		// print taxes
		System.out.println("Sales taxes: " + Utilities.getDecimalFormatter().format(cart.computeTotalTax()));

		// print total
		System.out.println("Total: " + Utilities.getDecimalFormatter().format(cart.computeTotalPrice()));

		System.out.println("-----------------------------");
	}

}
