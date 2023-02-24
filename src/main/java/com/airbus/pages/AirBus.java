package com.airbus.pages;

/*
Created by Ashish Mor
 */

import com.airbus.reporting.logs.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AirBus extends Utility {
    private static final Logger log = LogManager.getLogger(AirBus.class.getName());

    public AirBus() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//button[@id=\"onetrust-accept-btn-handler\"]")
    WebElement acceptCookies;

    @CacheLookup
    @FindBy(xpath = "//a[@id='btn1_1']")
    WebElement careerHome;

    @CacheLookup
    @FindBy(xpath = "//a[@class='ds-button ds-button--xlarge ds-button--primary ext']")
    WebElement openPosition;

    @CacheLookup
    @FindBy(xpath = "//input[@class='css-15xm6qs']")
    WebElement Id;

    @CacheLookup
    @FindBy(xpath = "//button [@data-automation-id='dateType']")
    WebElement postingDate;

    @CacheLookup
    @FindBy(xpath = "//input[@id='29d7affdc34a10001f8fca5d314100fc']")
    WebElement Weeks;

    @CacheLookup
    @FindBy(xpath = "//button [@data-automation-id='jobFamilyGroup']")
    WebElement jobCategoty;

    @CacheLookup
    @FindBy(xpath = "//input[@id='f5811cef9cb5018463377f3f550a1bf2']")
    WebElement engineering;


    @CacheLookup
    @FindBy(xpath = "//button[@class='css-1guf05z']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Software Test Engineer')]")
    WebElement jobTittle;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Apply')]")
    WebElement apply;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Start Your Application')]")
    WebElement verifyText;


    public void clickCareerHome() {
        log.info("I click on CareerHome" + careerHome);
        clickOnElement(careerHome);
    }

    public void clickOnCookies() {
        log.info("I click on cookies" + acceptCookies);
        clickOnElement(acceptCookies);
    }

    public void clickOnOpenPosition() {
        log.info("I click On Open Position " + openPosition);
        clickOnElement(openPosition);
    }


    public void writeId(String enterId) {
        log.info("I enter Text" + Id);
        sendTextToElement(Id, enterId);

    }
    public void clickpostingDateThenWeeks(){
        log.info ("I click on"+postingDate);
        clickOnElement(postingDate);
       clickOnElement(Weeks);

    }


    public void clickEngineeringFromJobCategory() {
       log.info ("I select JOb Catagory" + jobCategoty);
        clickOnElement(jobCategoty);
        clickOnElement(engineering);
    }

    public void clickOnSearchButton() {
        log.info("I click On search Button" + searchButton);
        clickOnElement(searchButton);
    }

    public void clickOnJobTittle() {
        log.info("I click On search Button" + jobTittle);
        clickOnElement(jobTittle);

    }

    public void clickApplyButton() {
        log.info("I click On Apply" + apply);
        clickOnElement(apply);
    }
    public String iverifyText(){
        String actualMessage=getTextFromElement(verifyText);
        return actualMessage;
    }


}










