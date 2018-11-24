package org.salestaxes.items;

public class Food extends NoTaxArticle {

	private int grams;
	private String description;

	public Food(String universalCode, float price, String title, int grams, String description) {
		super(universalCode, price, title);
		this.grams = grams;
		this.description = description;
	}

	public int getGrams() {
		return grams;
	}

	public void setGrams(int grams) {
		this.grams = grams;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
