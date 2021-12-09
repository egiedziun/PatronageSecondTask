package com.patronage.intive.steps;

import com.patronage.intive.pages.MainPage;
import com.patronage.intive.pages.TabsSubPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WidgetsStepdefs {
    private static final String EXPECTED_MESSAGE = "Contrary to popular belief, Lorem Ipsum is not";
    MainPage mainPage = new MainPage();

    TabsSubPage tabsSubPage = new TabsSubPage();

    @When("user select Widgets category")
    public void selectWidegts() {
        mainPage.selectWidgetsSection();
    }

    @And("select Tabs tab")
    public void selectTabs() {
        mainPage.selectTabsTab();
    }

    @And("Select \"Origin\" tab")
    public void selectOrigin() {
        tabsSubPage.selectOriginTab();
    }

    @Then("Text in \"Origin\" is valid")
    public void checkMessage() {
        Assert.assertTrue(tabsSubPage.getOriginText().startsWith(EXPECTED_MESSAGE));
    }
}
