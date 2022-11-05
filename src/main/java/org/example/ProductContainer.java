import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ProductList 
{
	private List<Product> list;
	
	public ProductList()
	{
		this.list = new ArrayList<Product>();
	}
	
	public void add(Product p)
	{
		this.list.add(p);
	}
	
	public List<Product> searchBy(String name)
	{
		List<Product> returnList = new ArrayList<Product>();
		for(Product p : this.list)
		{
			if(p.getName().equalsIgnoreCase(name))
				returnList.add(p);
		}
		
		return returnList;
	}
	
	public List<Product> searchBy(IFilter filter)
	{
		List<Product> returnList = new ArrayList<Product>();
		for(Product p : this.list)
		{
			if(filter.matches(p))
				returnList.add(p);
		}
		
		return returnList;
	}
	
	
	
	
	
	
	
	
	
	
	

}
