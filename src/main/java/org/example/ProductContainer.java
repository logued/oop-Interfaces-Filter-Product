package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * ProductContainer stores a list of Products.
 * It has two methods findProductByName() and findProductsByStarRating() which will
 * return a product or a list of products copied from the main product list that have been
 * matched or filtered by some criteria (e.g. by name).
 *
 * The filterBy()  method shows how we can generalise the filtering function, by
 * passing in an object that contains a function (a "Function Object") called matches().
 * Only filter objects that have implemented the IFilter_Product interface will be accepted
 * as valid filters, and that interface specifies a matches() method - that all
 * filter objects must implement.
 */

public class ProductContainer
{
	private final List<Product> productList;
	
	public ProductContainer() {
		this.productList = new ArrayList<>();
	}

	public void add(Product p) {
		this.productList.add(p);
	}

	// Two filter methods "hard coded" into the ProductContainer class.
	// findProductByName() - finds the first Product that is matched
	//
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

	// Should the container programmer have to anticipate all the various
	// types of "findBy" filter methods that a client of the container might need ??
	// This would be difficult - so we need a more flexible way of filtering - one
	// that does not involve adding a new filter method each time we need one.
	//
	// It would be better if the filtering logic could generalized and that
	// logic required for filtering be passed in as a function object.

	/**
	 *
	 * @param filter - an IFilter_Product type object
	 * @return list of matching objects - could be empty list
	 */
	public List<Product> filterBy(IFilter_Product filter)
	{
		List<Product> list = new ArrayList<Product>();	// list of matched objects
		for(Product p : this.productList)
		{
			if(filter.matches(p))  // does this Product match the criteria coded stored in the filter.
				list.add(p);
		}
		
		return list;
	}
}
