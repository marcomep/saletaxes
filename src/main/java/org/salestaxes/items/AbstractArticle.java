package org.salestaxes.items;

import org.salestaxes.utility.Constants;

public abstract class AbstractArticle implements Article {

	private float price;
	private String title;
	// Universal code for all articles. It cannot be changed.
	private String universalCode;

	public AbstractArticle(String universalCode, float price, String title) {
		super();
		this.price = price;
		this.title = title;
		this.universalCode = universalCode;
	}

	@Override
	public String getUniversalCode() {
		return universalCode;
	}

	@Override
	public float getPrice() {
		return price;
	}

	@Override
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * This do not consider import duty
	 * 
	 * @return
	 */
	@Override
	public float getSalesTax() {
		return Constants.SALE_TAX;
	}

	@Override
	public int hashCode() {
		return universalCode.hashCode();
	}

	@Override
	public boolean equals(Object article) {
		if (!(article instanceof AbstractArticle)) {
			return false;
		}
		return universalCode.equals(((AbstractArticle) article).universalCode);
	}

}
