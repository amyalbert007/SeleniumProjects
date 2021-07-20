package com.cg.project.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"FeatureFiles"}, 
//tags={"@Register"} , 
glue = {"com.cg.project.stepdefs"},
//monochrome=true,
//plugin = "html:Reports//Github.html"
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class TestRunner {

}
