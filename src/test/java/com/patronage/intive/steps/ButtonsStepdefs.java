package com.patronage.intive.steps;

import com.patronage.intive.pages.ButtonsSubPage;
import com.patronage.intive.pages.MainPage;
import com.patronage.intive.pages.RadioButtonSubPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ButtonsStepdefs {

    MainPage mainPage = new MainPage();
    ButtonsSubPage buttonsSubPage = new ButtonsSubPage();


    @And("select Buttons tab")
    public void selectDoubleClickButtonTab() {
        mainPage.selectButtonsMenuItem();
    }

    @And("double click on \"Double Click Me\"")
    public void selectRadioButtonYes() {
        buttonsSubPage.doubleClickButton();
    }

    @Then("{string} message should be visible in Buttons tab")
    public void messageShouldBeVisible(String textMessage) {
        Assert.assertEquals(buttonsSubPage.getDoubleClickButtonConfirmationMessage(), textMessage);
    }
}
