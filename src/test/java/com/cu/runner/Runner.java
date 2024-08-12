package com.cu.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(glue="com.cucu.stepdefinition",features="C:\\Users\\LEN0VO\\eclipse-workspace\\Cocumber\\src\\test\\resources\\Features\\cucumber.feature"
	,plugin={"preety","junit:target\\file.xml","html:target\\index.html"})
	public class Runner {	

}
