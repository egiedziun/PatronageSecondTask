package com.patronage.intive.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class ButtonsSubPage extends BasePage {

    Actions actions = new Actions(driver);

    @FindBy(how = How.ID, using = "doubleClickBtn")
    WebElement doubleClickButton;

    @FindBy(how = How.ID, using = "doubleClickMessage")
    WebElement confirmDoubleButtonMessage;


    public void doubleClickButton() {
        actions.doubleClick(doubleClickButton).build().perform();
    }

    public String getDoubleClickButtonConfirmationMessage() {
        return confirmDoubleButtonMessage.getText();
    }


}
