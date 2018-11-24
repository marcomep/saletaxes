package org.salestaxes.items;

public abstract class NoTaxArticle extends AbstractArticle {

	public NoTaxArticle(String universalCode, float price, String title) {
		super(universalCode, price, title);
	}

	@Override
	public float getSalesTax() {
		return 0;
	};

}
