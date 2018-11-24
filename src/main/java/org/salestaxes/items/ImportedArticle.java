package org.salestaxes.items;

import org.salestaxes.utility.Constants;

// Decorator
public class ImportedArticle implements Article {

	private AbstractArticle article;

	public ImportedArticle(AbstractArticle article) {
		this.article = article;
	}

	@Override
	public String getUniversalCode() {
		return article.getUniversalCode();
	}

	@Override
	public float getPrice() {
		return article.getPrice();
	}

	@Override
	public void setPrice(float price) {
		article.setPrice(price);
	}

	@Override
	public String getTitle() {
		return article.getTitle();
	}

	@Override
	public void setTitle(String title) {
		article.setTitle(title);
	}

	@Override
	public float getSalesTax() {
		return article.getSalesTax() + Constants.DUTY_TAX;
	}

	@Override
	public int hashCode() {
		return article.hashCode();
	}

	@Override
	public boolean equals(Object article) {
		return article.equals(article);
	}

}
