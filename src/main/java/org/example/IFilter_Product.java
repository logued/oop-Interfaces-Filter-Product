package org.example;

// The matches() method matches two Products.
// filterBy() is passed in an IProductFilter object that implements the IProductFilter interface, and
// thus has a filterBy() method.
// Because of this setup, we can create a filter and apply the filter to the ProductContainer
// without having to add code in the ProductContainer class.

// Later we can generalize this interface to deal with objects of any type.

public interface IProductFilter
{
	boolean matches(Product product);
}
