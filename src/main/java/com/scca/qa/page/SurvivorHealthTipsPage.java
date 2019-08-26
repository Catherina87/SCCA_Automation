package com.scca.qa.page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SurvivorHealthTipsPage {

    private WebDriver driver;
    private By afterTreatment = By.linkText("AFTER TREATMENT");
    private By survivorHealthTips = By.linkText("Survivor Health Tips");
    private By survivorHealthTipsTitle = By.xpath("//h1[@class='page-header']/span");

    public SurvivorHealthTipsPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement getAfterTreatment() {
        return driver.findElement(afterTreatment);
    }

    private WebElement getSurvivorHealthTips() {
        return driver.findElement(survivorHealthTips);
    }

    private WebElement getSurvivorHealthTipsTitle() {
        return driver.findElement(survivorHealthTipsTitle);
    }

    public void goToPageLocation() {
        getAfterTreatment().click();
        getSurvivorHealthTips().click();
    }

    public String getPageTitle() {
        return getSurvivorHealthTipsTitle().getText();
    }

}
