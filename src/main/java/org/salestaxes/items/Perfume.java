package org.salestaxes.items;

public class Perfume extends AbstractArticle {

	private float ml;

	public Perfume(String universalCode, float price, String title, float ml) {
		super(universalCode, price, title);
		this.ml = ml;
	}

	public float getMl() {
		return ml;
	}

	public void setMl(float ml) {
		this.ml = ml;
	}

}
