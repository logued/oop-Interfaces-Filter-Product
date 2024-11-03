package org.example;

// IFilter_Product - an interface that must be implemented by any Filter object
// that is to be passed into the filterBy() method of the ProductContainer.
// The filterBy() method provides the service of filtering Products as long as
// each object meets the contract requirement that it implements a matches() method.
//
// The matches() method matches a Product against some criteria
// defined in the Filter object. ( returns 'true' if they match, false otherwise)
// filterBy() receives a filter object that implements the IFilter_Product interface,
// and thus has a matches() method.
// Because of this setup, we can create a filter that implements IFilter_Product
// and pass it into the filterBy() method of the ProductContainer class.

// Later we can generalize this interface to deal with objects of any type. (using Generics)

// Note the "I" means "Interface", and is sometimes used to help identify Interface types,
// however, it is not a requirement.

public interface IFilter_Product
{
	boolean matches(Product product);
}
