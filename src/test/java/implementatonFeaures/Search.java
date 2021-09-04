package implementatonFeaures;

public class Search {
	
	public String displayProduct(Product product)
	{
		if(product.getprodcutlist().contains(product.getProductname())) {
			return product.getProductname();
			
		}
		return null;
	}

}
