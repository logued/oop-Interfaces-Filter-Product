package org.example;						// Nov 2024

// Concrete implementation of the IFilter_Product interface
//
// Here we create an IFilter_Product function object that implements
// the matches() method with the logic we want to use for
// the filter.  We simply construct an instance of this object
// and pass it into the filterBy() method of the ProductContainer
// where it is applied to filter products in teh container.
// Big advantage is that it decouples the filter logic from the container logic,
// meaning that, we don't have to write code in the ProductContainer
// each time we need to add a new filter - we simply create a separate
// filter class, instantiate it, and pass it into the container.
// We can create as many filters as we like.
// (Note similarity to Comparators)

public class Filter_NameProduct implements IFilter_Product
{
	private final String name;

	public Filter_NameProduct(String name)
	{
		this.name = name;
	}

	// Match the name set on initialization with one from the Product argument.
	public boolean matches(Product product)
	{
		return product.getName().equalsIgnoreCase(name);
	}
}
