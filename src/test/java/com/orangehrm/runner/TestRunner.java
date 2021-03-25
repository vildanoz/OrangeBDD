package com.orangehrm.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue={"com/orangehrm/stepdefinitions"},tags="@login",monochrome = true,
        plugin = {"pretty","html:target/site/cucumber-pretty.html","json:target/cucumber.json"}
)
public class TestRunner {

}
