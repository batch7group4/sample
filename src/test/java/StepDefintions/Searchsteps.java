package StepDefintions;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import implementatonFeaures.Product;
import implementatonFeaures.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Searchsteps {
		Product product;
		
		Search search;
	
	@Given("I have a search field on Amazon page")
	public void i_have_a_search_field_on_amazon_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Step 1: I am on search page");
	}

	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String Productname, Integer price) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Step 2: Serach the product name  " +Productname+"   "+"price is " + price );
	    product=new Product(Productname, price);
	}

	@Then("Product with {string} should be displayed")
	public void product_with_should_be_displayed(String Productname) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Step 3: Product name "+Productname+ " is displayed");
	
	search=new Search();
	String name=search.displayProduct(product);
	System.out.println("search prodcut is"+ name);
	Assert.assertEquals(product.getProductname(), name);
	}

}
