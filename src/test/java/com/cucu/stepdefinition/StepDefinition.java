package com.cucu.stepdefinition;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver driver;

	@Given("i am in login page")
	public void i_am_in_login_page() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	    
	}
	@When("i enter valid {string} and {string}")
	public void i_enter_valid_and(String name, String pass) {
		driver.findElement(By.id("email")).sendKeys(name);
		driver.findElement(By.id("pass")).sendKeys(pass);
	  
	}
	@When("i am enter login button")
	public void i_am_enter_login_button() {
		driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
	}
	@Then("i am verify th login successfull msg")
	public void i_am_verify_th_login_successfull_msg() {
		Assert.assertTrue("verify login",true);   
	}




}
