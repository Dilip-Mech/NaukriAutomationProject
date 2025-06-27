package com.stepDefinitionFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NaukriLoginTest {
	public WebDriver driver;
	@Given("User should landed into Naukri login page")
	public void user_should_landed_into_naukri_login_page() {

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");


	}
	@When("User should click Login Icon")
	public void user_should_click_login_icon() {

	}
	@When("User should fill the UserName and Password")
	public void user_should_fill_the_user_name_and_password() {

	}
	@When("User should click the Login Button")
	public void user_should_click_the_login_button() {

	}
	@Then("User can navigated into Home Page")
	public void user_can_navigated_into_home_page() {
		driver.close();  
	}


}
