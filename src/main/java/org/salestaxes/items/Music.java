package org.salestaxes.items;

import org.salestaxes.items.category.AudioFormat;

public class Music extends AbstractArticle {

	private String artist;
	private int lengthMinute;
	private String genre;
	private AudioFormat format;

	public Music(String universalCode, float price, String title, String artist, int lengthMinute, String genre,
			AudioFormat format) {
		super(universalCode, price, title);
		this.artist = artist;
		this.lengthMinute = lengthMinute;
		this.genre = genre;
		this.format = format;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getLengthMinute() {
		return lengthMinute;
	}

	public void setLengthMinute(int lengthMinute) {
		this.lengthMinute = lengthMinute;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public AudioFormat getFormat() {
		return format;
	}

	public void setFormat(AudioFormat format) {
		this.format = format;
	}

}
