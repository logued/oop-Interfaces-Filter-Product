package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductContainer
{
	private final List<Product> productList;
	
	public ProductContainer()
	{
		this.productList = new ArrayList<>();
	}

	public void add(Product p)
	{
		this.productList.add(p);
	}

	// Two filter methods "hard coded" into the ProductContainer class.
	// findProductByName() and findProductsByStarRating()
	//
	// Should the container programmer have to anticipate all the various
	// types of "findBy" filter methods that a client of the container might need ??
	// Discuss!
	public Product findProductByName(String name)
	{
		for(Product product : this.productList)
		{
			if(product.getName().equalsIgnoreCase(name))
				return product;
		}
		return null; 	// return null if not found. Must check for this case in caller.
	}

	public List<Product> findProductsByStarRating(int rating)
	{
		List<Product> returnList = new ArrayList<>();
		for(Product product : this.productList)
		{
			if(product.getStarRating() == rating)
				returnList.add(product);
		}
		return returnList;
	}

	/**
	 *
	 * @param filter - an IProductFilter type object
	 * @return list of matching objects - could be empty list
	 */
	public List<Product> filterBy(IFilter_Product filter)
	{
		List<Product> returnList = new ArrayList<Product>();
		for(Product p : this.productList)
		{
			if(filter.matches(p))
				returnList.add(p);
		}
		
		return returnList;
	}
	
	
	
	
	
	
	
	
	
	
	

}
