package org.example;
import java.util.List;

// The Filter Pattern

// We can generalize this filter by using type-parameters and generics. See later.

public class MainApp {

	public static void main(String[] args) 
	{
		MainApp theApp = new MainApp();
		theApp.start();
	}
	
	public void start()
	{
		demoFilter();
	}
	
	private void demoFilter()
	{
		ProductContainer productContainer = new ProductContainer();

		productContainer.add(new Product("Fallout 4", 64.99, 4));
		productContainer.add(new Product("MGS", 45.99,3));
		productContainer.add(new Product("The Witcher III", 70.59,4));
		productContainer.add(new Product("Sims 5", 35.50,5));
		productContainer.add(new Product("Call of Duty", 65.99,3));

		System.out.println("Find a product by name:");
		Product product = productContainer.findProductByName("MGS"); // assume unique names
		if(product==null)
			System.out.println("No product was found with that name");
		else
			System.out.println("Found product: " + product);

		System.out.println("Find products by star rating...");
		List<Product> list = productContainer.findProductsByStarRating(4);
		if( list.isEmpty())
			System.out.println("No Products have that star rating");
		else
			System.out.println("Products with star rating of 4 :" + list);


		// Retrieve Products from ProductContainer by passing a IFilter_Product type
		// object into the container's filterBy() method.
		// Note that the filters that we use are created outside the ProductContainer class.
		// This is a good, as we are decoupling (separating) the filter logic from the container logic.
		// The container depends on the interface IFilter_Product types.
		// This class is said to be a "client" of the ProductContainer, because it
		// uses the services provided by the container.
		// This setup allows any client to create any type and number of filters it needs
		// without having to modify the ProductContainer class codebase.

		System.out.println("Filter by name...");
		List<Product> nameList = productContainer.filterBy(new Filter_NameProduct("mGs"));
		System.out.println(nameList);
		
		System.out.println("Filter by less than price...");
		List<Product> priceList = productContainer.filterBy(new Filter_PriceLessThanProduct(65));
		System.out.println(priceList);

		//TODO
		// Write a filter class called Filter_ProductStarRating that can be initialized with a star rating value 1-5,
		// and will match products that have that have that star rating.
		// Use your filter by passing an instance of it into the container's filterBy() method, and store
		// and output the results.  (Set star rating to 3)

		//TODO
		// Write a filter class called Filter_ProductMinRating that can be initialized with a star rating,
		// and will match any product that has that star rating or a greater star rating.

	}

}
