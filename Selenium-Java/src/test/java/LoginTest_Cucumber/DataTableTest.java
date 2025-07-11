package LoginTest_Cucumber;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class DataTableTest {
	
	@Before
	public void hooks() {
		System.out.println("I'm running always before");
	}
	
	@After
	public void hooks_last() {
		System.out.println("I'm running always last");
	}
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition(DataTable datatable) {
	    System.out.println("welcome");
	    //List<String> custlist = dataTable.asList(String.class);
	    
	    List<String> data = datatable.asList(String.class);
	    
	    System.out.println(data.get(0));
	    System.out.println(data.get(1));
	}

	@Given("some other precondition")
	public void some_other_precondition(DataTable datatable) {
		  List<List<String>> datas = datatable.asLists(String.class);
		  
		  for(int i = 0; i<datas.size(); i++) {
			  for(int j=0; j<datas.size(); j++) {
				  System.out.println(datas.get(i).get(j));
			  }
		  //System.out.println(datas.get(1).get(2));
		  }
	}
	
	@Given("some other precondition2")
	public void withHeader(DataTable datatable) {
		Map<String, String> mp = datatable.asMap(String.class,String.class);
		
		System.out.println(mp.get("name"));
		System.out.println(mp.get("name"));
	}
	
	@Given("some other precondition3")
	public void withHeader_2D(DataTable datatable) {
		List<Map<String, String>> mp = datatable.asMaps(String.class,String.class);
		
		System.out.println(mp.get(1).get("l_name"));

	}

	@When("I complete action")
	public void i_complete_action() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("some other action")
	public void some_other_action() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("yet another action")
	public void yet_another_action() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
