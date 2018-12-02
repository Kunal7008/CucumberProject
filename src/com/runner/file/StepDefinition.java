package com.runner.file;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="Common",glue={"com.cucumber.project"})
public class StepDefinition {

}
