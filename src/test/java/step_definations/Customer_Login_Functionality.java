package step_definations;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Customer_Login_Functionality extends Base {


@Given("My landing page")
public void my_landing_page() {
    navigateURL("http://it.microtechlimited.com");
}

@When("click on the Login menu")
public void click_on_the_login_menu() {
    click(By.xpath("//a[@href='elogin.php']"));
}

@Then("Click on the Customer Login Menu")
public void click_on_the_customer_login_menu() {
	click(By.xpath("//a[@href='clogin.php']"));
   
}

@Then("I Enter User Id david@gmail.com")
public void i_enter_user_id_david_gmail_com() {
  sendkeys(By.name("mailuid"), "david@gmail.com");
}

@Then("I Enter the Password as {int}")
public void i_enter_the_password_as(Integer int1) {
    sendkeys(By.name("pwd"), "1234");
}

@Then("We click on the Login Button")
public void we_click_on_the_login_button() {
   click(By.name("login-submit"));
}

@Then("We Verify the my Home page")
public void we_verify_the_my_home_page() {
	String s = getElementText(By.xpath("//h2[2]"));
	assertEquals("Welcome David", s);
   
}

	
	
}
