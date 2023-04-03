package com.cucumber.demo.bdd;

import com.cucumber.demo.CucumberDemoApplication;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "junit:target/cucumber-reports/cucumber.xml",
        "html:target/cucumber-reports/cucumber.html",
        "json:target/cucumber-reports/cucumber.json"}, tags = "", glue =
        "com.cucumber.demo.bdd.stepdefs", features = "classpath:features")
public class CucumberIT {
}
