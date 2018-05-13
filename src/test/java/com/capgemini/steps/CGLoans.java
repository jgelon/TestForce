package com.capgemini.steps;

import com.capgemini.ourWebdriver.BrowserFactory;
import com.capgemini.utils.FileHelper;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.net.MalformedURLException;

public class CGLoans {
    private WebDriver browser;

    public CGLoans() throws MalformedURLException {
        this.browser = BrowserFactory.getWebDriver();
    }

    @Given("^de klant wil informatie over een lening$")
    public void deKlantWilInformatieOverEenLening() throws Throwable {
            String myPage = "file://"+ FileHelper.getRootPath() + File.separator + "src/main/resources/leningaanvraag.html";
            this.browser.navigate().to(myPage);
    }
}
