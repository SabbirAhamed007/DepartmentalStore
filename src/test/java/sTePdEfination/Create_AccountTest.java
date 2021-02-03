package sTePdEfination;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Create_AccountTest {
	
	public static WebDriver driver;
	
	@Given("^I open Macys page$")
	public void i_open_Macys_page() throws Throwable {
     
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ubox0\\Desktop\\Driver(Chrome+Mozilla+ internet)\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.macys.com");

		
	}

	@Given("^Mouse Hover on Sign In$")
	public void mouse_Hover_on_Sign_In() throws Throwable {
		
		
		WebElement ele = driver.findElement(By.xpath(".//*[@id='myRewardsLabel-status']/span[2]"));
		Actions mouse_hover = new Actions(driver);   
		
		mouse_hover.moveToElement(ele).perform();

    

		
	}

	@Given("^Click on SignIn link$")
	public void click_on_SignIn_link() throws Throwable {
		
		
		driver.findElement(By.id("drop-down-sign-in")).click();


		
		
	}

	@Given("^click on create account button$")
	public void click_on_create_account_button() throws Throwable {


		driver.findElement(By.id("standard-sign-up")).click();
		
	}

	@When("^I fillup the createaccount form$")
	public void i_fillup_the_createaccount_form() throws Throwable {


		
	}

	@Then("^I click on create account button$")
	public void i_click_on_create_account_button() throws Throwable {


		
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {


		
		
	}



}
