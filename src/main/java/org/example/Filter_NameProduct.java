package org.example;						// Nov 2022

// Concrete implementation of the IProductFilter interface
//
// Here we create an IProductFilter object that implements
// the matches() method with the logic we want to use for
// the filter.  We simply make an instance of this object
// and pass it into the filterBy() method of the ProductContainer
// where it is applied to filter objects.
// Big advantage is that it decouples the filter logic from the container logic,
// meaning that, we don't have to write code in the ProductContainer
// each time we need to add a new filter - we simply create a separate
// filter class, instantiate it, and pass it into the container.
// We can create as many filters as we like.

public class Filter_ProductName implements IProductFilter
{
	private final String name;
	public Filter_ProductName(String name)
	{
		this.name = name;
	}
	public boolean matches(Product product)
	{
		return product.getName().equalsIgnoreCase(name);
	}
}
