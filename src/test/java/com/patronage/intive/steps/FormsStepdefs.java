package com.patronage.intive.steps;

import com.patronage.intive.pages.MainPage;
import com.patronage.intive.pages.PracticeFormPage;
import com.patronage.intive.pages.TabsSubPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FormsStepdefs {
    MainPage mainPage = new MainPage();

    PracticeFormPage practiceFormSubPage = new PracticeFormPage();

    @When("user select Forms category")
    public void selectForms() {
        mainPage.selectFormsSection();
    }

    @And("select Practice Form tab")
    public void selectPracticeFormTab() {
        mainPage.selectPracticeFormTab();
    }

    @And("fill out mobile field with 11 digits")
    public void inputDigits() {
        practiceFormSubPage.input11Digits();
    }

    @Then("field accepts 10 digits")
    public void checkMaxLengthOfField() {

        Assert.assertEquals(practiceFormSubPage.getInput(), "1234567891");
    }
}
