package step_definations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Employee_Login_Functioality extends Base {
	@Given("I am in landing page")
	public void i_am_in_landing_page() {
		navigateURL("http://it.microtechlimited.com");	   
	}

	@When("I click on Login menu")
	public void i_click_on_login_menu() {
		click(By.xpath("//a[@href='elogin.php']"));
	   
	}

	@Then("Click on Employee Login Menu")
	public void click_on_employee_login_menu() {
		click(By.xpath("//a[@href='elogin.php']"));
	   
	}

	@Then("Enter User Id testpilot@gmail.com")
	public void enter_user_id_testpilot_gmail_com() {
	    sendkeys(By.name("mailuid"), "testpilot@gmail.com");
	}

	@Then("Enter Passworf as {int}")
	public void enter_passworf_as(Integer int1) {
	    sendkeys(By.name("pwd"), "1234");
	}

	@Then("I click on Login Button")
	public void i_click_on_login_button() {
		 click(By.name("login-submit"));
	}

	@Then("Verify I am in my Home page")
	public void verify_i_am_in_my_home_page() {
	    String s = getElementText(By.xpath("//h2[2]"));
	    assertEquals("Welcome Test", s);
	}

}
