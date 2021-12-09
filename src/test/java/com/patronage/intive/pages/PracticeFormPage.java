package com.patronage.intive.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PracticeFormPage extends BasePage {
    @FindBy(how = How.ID,using = "userNumber")
    WebElement mobileField;

    public void input11Digits() {
        mobileField.sendKeys("12345678910");
    }
    public String getInput(){
        return mobileField.getAttribute("value");
    }

}
