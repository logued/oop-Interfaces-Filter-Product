package org.example;

import java.util.Objects;

public class Product
{
	private String name;
	private double price;

	private int starRating; // rating 1 to 5
	
	public Product(String name, double price, int starRating)
	{
		this.name = name;
		this.price = price;
		this.starRating = starRating;
	}

	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStarRating() {
		return starRating;
	}

	public void setStarRating(int starRating) {
		this.starRating = starRating;
	}

	@Override
	public String toString() {
		return "Product{" +
				"name='" + name + '\'' +
				", price=" + price +
				", starRating=" + starRating +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Product product = (Product) o;
		return Double.compare(product.price, price) == 0
				&& starRating == product.starRating
				&& name.equals(product.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price, starRating);
	}

}














