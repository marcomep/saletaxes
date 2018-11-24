package org.salestaxes.items;

public class Drug extends NoTaxArticle {

	private String brand;
	private String description;

	public Drug(String universalCode, float price, String title, String brand, String description) {
		super(universalCode, price, title);
		this.brand = brand;
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
