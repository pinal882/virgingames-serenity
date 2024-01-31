package com.virgingames.cucmber.steps;

import com.virgingames.virgingamesinfo.CurrencySteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;

import java.util.HashMap;
import java.util.List;

public class MyStepDef {
    @Steps
    CurrencySteps steps;

    @When("I send a get request to bingo endPoint with currency as a {string}")
    public void iSendAGetRequestToBingoEndPointWithCurrencyAsA(String currency) {
        steps.getAllData(currency);
    }

    @Then("I verify currency as a {string}")
    public void iVerifyCurrencyAsA(String currency) {
        List<HashMap<String,Object>> expectedCurrency = steps.getAllData(currency);
        Assert.assertTrue(expectedCurrency.contains(currency));
    }
}
