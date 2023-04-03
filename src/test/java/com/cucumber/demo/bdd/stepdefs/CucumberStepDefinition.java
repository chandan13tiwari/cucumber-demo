package com.cucumber.demo.bdd.stepdefs;

import com.cucumber.demo.CucumberDemoApplication;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.jupiter.api.Assertions;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = CucumberDemoApplication.class)
public class CucumberStepDefinition {

    private static int A = 0;
    private static int B = 0;
    private int result = 0;

    @Given("^You have already added pom file$")
    public void youHaveAlreadyAddedPomFile() {

    }

    @When("variable A initialized with value {int}")
    public void variableAInitializedWithValue(int value) {
        A = value;
    }

    @When("variable B initialized with value {int}")
    public void variableBInitializedWithValue(int value) {
        B = value;
    }

    @And("operation is {word}")
    public void operationIsADDITION(String operation) {
        if (operation.equals("ADDITION")) {
            result = A + B;
        } else if (operation.equals("SUBTRACTION")) {
            result = A - B;
        }
    }

    @Then("Output will be {int}")
    public void outputWillBe(int result) {
        Assertions.assertEquals(result, this.result);
    }
}
