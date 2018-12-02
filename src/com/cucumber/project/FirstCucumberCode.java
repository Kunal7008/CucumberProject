package com.cucumber.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FirstCucumberCode {
	WebDriver driver;
	@Given("^user in login page$")
	public void user_in_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KUNAL BHATTA\\Downloads\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://facebook.com");   
	}

	@When("^i enter username and password$")
	public void i_enter_username_and_password() throws Throwable {
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Sujeet");
	
	}

	@Then("^login should be sucessful$")
	public void login_should_be_sucessful() throws Throwable {
	   System.out.println("Then login should be sucessful"); 
	}


}
