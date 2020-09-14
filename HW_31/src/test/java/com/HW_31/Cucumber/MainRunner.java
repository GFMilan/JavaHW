package com.HW_31.Cucumber;
import org.junit.runner.RunWith;
import com.HW_31.testbase.TestBase;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/")

public class MainRunner extends TestBase {



}
