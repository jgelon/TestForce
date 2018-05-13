package com.capgemini.steps;

import com.capgemini.ourWebdriver.BrowserFactory;
import com.capgemini.utils.FileHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.net.MalformedURLException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CGLoans {
    private WebDriver browser;

    public CGLoans() throws MalformedURLException {
        this.browser = BrowserFactory.getWebDriver();
    }

    @Given("^the customer wants information about a loan$")
    public void deKlantWilInformatieOverEenLening() throws Throwable {
        String myPage = "file://" + FileHelper.getRootPath() + File.separator + "src/main/resources/leningaanvraag.html";
        this.browser.navigate().to(myPage);
    }

    @When("^the customer wants a loan for \"([^\"]*)\"$")
    public void theCustomerWantsALoanFor(String loanType) throws Throwable {
        browser.findElement(By.cssSelector("button[id*='" + loanType.toLowerCase() + "']")).click();
    }

    @Then("^the customer receives the information text \"([^\"]*)\"$")
    public void theCustomerReceivesTheInformationText(String expectedText) throws Throwable {
        Thread.sleep(1000); // <-- BAD PRACTICE (use ourDriver for a nice waitForVisible)
        final WebElement returnText = browser.findElement(By.cssSelector("#tiptekst"));
        assertThat(returnText.getText(), is(expectedText));
    }
}
