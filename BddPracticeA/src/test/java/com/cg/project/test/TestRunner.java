package com.cg.project.test;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = {"Features"} , glue = {"com.cg.project.stepdefs"}, plugin = "html:Reports//Github.html",//the path of the step definition files
			//format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
			monochrome = true //display the console output in a proper readable format
			//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
			//dryRun = false //to check the mapping is proper between feature file and step def file
			//tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}			
			)
public class TestRunner {

}
