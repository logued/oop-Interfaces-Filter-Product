package org.example;

// The matches() method matches two Products, and returns 'true' if they match.
// filterBy() receives a filter object that implements the IFilter_Product interface, and
// thus has a filterBy() method.
// Because of this setup, we can create a filter that implements IFilter_Product
// and pass it into the filterBy() method of the ProductContainer class.

// Later we can generalize this interface to deal with objects of any type.

// Note the "I" means "Interface", and is sometimes used to help identify Interface types,
// however, it is not a requirement.

public interface IFilter_Product
{
	boolean matches(Product product);
}
