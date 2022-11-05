package org.example;

public class Filter_PriceLessThanProduct implements IFilter_Product {

	private final double priceLimit;
	public Filter_PriceLessThanProduct(double priceLimit)
	{
		this.priceLimit = priceLimit;
	}
	
	public boolean matches(Product product)
	{
		return product.getPrice() < priceLimit;
	}

}
