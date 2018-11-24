package org.salestaxes.items;

public interface Article {

	String getUniversalCode();

	float getPrice();

	void setPrice(float price);

	String getTitle();

	void setTitle(String title);

	/**
	 * This do not consider import duty
	 * 
	 * @return
	 */
	float getSalesTax();

}
