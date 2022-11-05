package org.example;

public class Filter_ProductPriceLessThan implements IProductFilter {

	private final double priceLimit;
	public Filter_ProductPriceLessThan(double priceLimit)
	{
		this.priceLimit = priceLimit;
	}
	
	public boolean matches(Product product)
	{
		return product.getPrice() < priceLimit;
	}

}
