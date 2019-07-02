package stepdef;

import java.util.List;

import cucumber.api.java.en.When;

public class listtest {

	@When("user searches for different products")
	public void user_searches_for_different_products(io.cucumber.datatable.DataTable dataTable) {
	   List<String> p1=dataTable.asList();
	   for(String products:p1)
	   {
		   System.out.println(products);
	   }
	}

	@When("displays the product")
	public void displays_the_product() {
	    System.out.println("products verified");
	}

	@When("close the app")
	public void close_the_app() {
	   System.out.println("close app");
	}


}
