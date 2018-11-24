package org.salestaxes.order;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<ArticleOrder> orders;

	public ShoppingCart() {
		orders = new ArrayList<>();
	}

	public void addOrder(ArticleOrder order) {
		orders.add(order);
	}

	public void removeOrder(ArticleOrder order) {
		orders.removeIf(i -> i.equals(order));
	}

	public List<ArticleOrder> getOrders() {
		return orders;
	}

	public double computeTotalTax() {
		return orders.stream().mapToDouble(o -> o.computeSalesTaxValue()).sum();
	}

	public double computeTotalPrice() {
		return orders.stream().mapToDouble(o -> o.computePriceWithNoTax()).sum() + computeTotalTax();
	}

}
