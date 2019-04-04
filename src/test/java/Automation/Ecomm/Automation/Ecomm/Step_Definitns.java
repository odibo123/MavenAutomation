package Automation.Ecomm.Automation.Ecomm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

  public class Step_Definitns {
	
	
	
/*	public WebDriver driver;
	public int random;
	@Given("^I go to Home Page$")
	public void i_go_to_Home_Page() throws Throwable {
	   
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.navigate().to("http://automationpractice.com/index.php?");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@And("^I click on Sign in link$")
	public void i_click_on_Sign_in_link() throws Throwable {
		 driver.findElement(By.linkText("Sign in")).click();
	    
	}

	
	@Given("^I enter my \"([^\"]*)\" in the email  address field$")
	public void i_enter_my_in_the_email_address_field(String email) throws Throwable {
	   driver.findElement(By.id("email")).sendKeys(email);
	}
	
	@And("^I enter my email in the email  address field$")
	public void i_enter_my_email_in_the_email_address_field() throws Throwable {
	  driver.findElement(By.id("email")).sendKeys("");
		//random = 100 + (int)(Math.random() * ((1000 - 1) + 1));
		// driver.findElement(By.id("email")).sendKeys("mike" + random + "@yahoomail.com");
		// JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//	jse.executeScript("window.scrollBy(0,250)", "");
		 
		 Thread.sleep(5000);
		
	}   

	@And("^I enter my password \"([^\"]*)\"$")
		public void i_enter_a(String password) throws Throwable {
			   driver.findElement(By.name("passwd")).sendKeys(password);
			   Thread.sleep(1000);
	}

	@When("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {
		driver.findElement(By.xpath("//button[@id='SubmitLogin']//span[1]")).click();
		 Thread.sleep(3000);
	}

	
	@Then("^I verify that  I am logged in successfully$")
	public void i_verify_that_I_am_logged_in_successfully() throws Throwable {
		String expectedUser = "Davin Riches";
	String actualUser =  driver.findElement(By.linkText("Davin Riches")).getText();
	//Assert.assertEquals("Davin Riches",driver.findElement(By.linkText("Davin Riches")).getText() );
	//OR
	Assert.assertEquals(expectedUser, actualUser);
//	System.out.println("Davin Riches" );
	Thread.sleep(2000);
	}
	@And("^I sign out$")
	public void i_sign_out() throws Throwable {
		driver.findElement(By.linkText("Sign out")).click();
		driver.close();  
	}


@Given("^I enters \"([^\"]*)\" email address$")
public void i_enters_email_address(String myEmail) throws Throwable {
	 driver.findElement(By.id("email_create")).sendKeys(myEmail);
}

@Given("^user click on create account button$")
public void user_click_on_create_account_button() throws Throwable {
	driver.findElement(By.xpath("//button[@id='SubmitCreate']//span")).click();
}

@And("^user click on female radio button$")
public void user_click_on_female_radio_button() throws Throwable {
driver.findElement(By.id("id_gender2")).click();
Thread.sleep(2000);
}

@And("^user types  firstname \"([^\"]*)\"$")
public void user_types_firstname(String firstname) throws Throwable {
	driver.findElement(By.xpath("//input[@name='customer_firstname']")).sendKeys(firstname);
	
}

@And("^user enters lastname \"([^\"]*)\"$")
public void user_enters_lastname(String lastname) throws Throwable {
	driver.findElement(By.id("customer_lastname")).sendKeys(lastname); 
}

@And("^user enter a \"([^\"]*)\"$")
public void user_enter_a(String password) throws Throwable {
	 driver.findElement(By.name("passwd")).sendKeys(password);
}

@Given("^user select my date of Birth$")
public void user_select_my_date_of_Birth() throws Throwable {
  ;
}

@When("^user enter address$")
public void user_enter_address() throws Throwable {
    
}

@And("^user enter city$")
public void user_enter_city() throws Throwable {
  
}

@And("^user enters state$")
public void user_enters_state() throws Throwable {

}

@And("^user types postal code$")
public void user_types_postal_code() throws Throwable {
   ;
}

@And("^user enters country$")
public void user_enters_country() throws Throwable {
    
}

@And("^user enters mobile number$")
public void user_enters_mobile_number() throws Throwable {
 
}
	@Then("^user enter an address$")
	public void user_enter_an_address() throws Throwable {
	   
		
}
@When("^user click on Register button$")
public void user_click_on_Register_button() throws Throwable {
    ;
}

@Then("^I should see my name as proof I am registered successfully$")
public void i_should_see_my_name_as_proof_I_am_registered_successfully() throws Throwable {

}

@Then("^I close the browser$")
public void i_close_the_browser() throws Throwable {
    
}	
	
	
	*/
}
