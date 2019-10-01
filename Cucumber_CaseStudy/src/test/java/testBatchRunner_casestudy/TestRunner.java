package testBatchRunner_casestudy;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue="stepDef_casestudy",plugin= {"json:target/cucumber-json-report.json"})
public class TestRunner {

}
