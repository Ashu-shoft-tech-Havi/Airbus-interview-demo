package com.airbus.steps;
/*
Created by Ashish Mor
 */

import com.airbus.pages.AirBus;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.Set;

import static com.airbus.broswerfactory.ManageBrowser.driver;

public class AirBusSteps {
    String parentWindow = null;

    @Given("^I am on  Careers Homepage$")
    public void asAUserIAmOnCareersHomepage() {
        new AirBus().clickCareerHome();

    }

    @When("^I accept all the cookies$")
    public void asAUserIClickOnCookies() {
        new AirBus().clickOnCookies();
    }

    @And("^I click On jobPage And and navigate to the Airbus Careers Website.$")
    public void iClickOnJobPage() {
        WebElement ele = driver.findElement(By.xpath("//a[@class='ds-button ds-button--xlarge ds-button--primary ext']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click()", ele);

    }


    @And("^I enter job id  \"([^\"]*)\"$")
    public void asAUserIAmWriting(String enterId) {
        Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);
        for (String handle : handles) {
            if (!handle.equals(parentWindow)) {
                driver.switchTo().window(handle);
            }
        }
        new AirBus().writeId(enterId);


    }

    @And("^I click On Weeks from Posting Date$")
    public void iClickOnWeeksFromPOstingDate() {
        new AirBus().clickpostingDateThenWeeks();
    }

    @And("^I click On Engineering from Job Category$")
    public void iClickOnEngeneeringFromJobCategory() {
        new AirBus().clickEngineeringFromJobCategory();
    }


    @And("^I click On search button$")
    public void iClockOnSearchbutton() {

        new AirBus().clickOnSearchButton();
    }

    @And("^I click On Job Title$")
    public void iClickOnSoftwareTestEngineer() {
        new AirBus().clickOnJobTittle();
    }

    @Then("^I click On Apply$")
    public void iClickOnApply() {
        new AirBus().clickApplyButton();
    }


    @And("^I verify Text \"([^\"]*)\"$")
    public void iVerifyText(String expectedMessage)  {

        Assert.assertEquals("Txt is not display",expectedMessage,new AirBus().iverifyText());
    }




}


