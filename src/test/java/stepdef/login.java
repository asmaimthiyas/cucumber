package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class login {
	WebDriver driver;
	
	@Given("user opens the newtours app")
	public void user_opens_the_newtours_app() {
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		
	}

	@When("user enters uname and pwd")
	public void user_enters_uname_and_pwd() {
		PageObject p1=PageFactory.initElements(driver, PageObject.class);
		p1.un.sendKeys("mercury");
	     p1.pwd.sendKeys("mercury");
	    
	}

	@When("user clicks on login")
	public void user_clicks_on_login() {
		PageObject p1=PageFactory.initElements(driver, PageObject.class);
		p1.submit.click();
	    
	}

	@Then("verify the login process")
	public void verify_the_login_process() {
	   WebElement t1=driver.findElement(By.linkText("SIGN-OFF"));
	   WebElement t2=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"));
	
	   Assert.assertEquals(t1, t2);
	}



}
