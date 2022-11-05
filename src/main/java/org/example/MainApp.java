import java.util.List;

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
		ProductList pList = new ProductList();
		pList.add(new Product("fallout 4", 64.99));
		pList.add(new Product("MGS", 45.99));
		pList.add(new Product("The witcher III", 70.59));
		pList.add(new Product("Sims 5", 35.50));
		pList.add(new Product("MGS", 65.99)); //deliberate duplicate
		
		System.out.println("Search by name...");
		List<Product> nameList = pList.searchBy(new ProductNameFilter("mGs"));
		System.out.println(nameList);
		
		System.out.println("Search by less than price...");
		List<Product> costList = pList.searchBy(new ProductPriceLessThanFilter(65));
		System.out.println(costList);
	}

}
