package com.patronage.intive.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TabsSubPage extends BasePage {
    @FindBy(how = How.ID,using = "demo-tab-origin")
    WebElement originTab;

    @FindBy(how = How.XPATH, using = "//*[@id=\"demo-tabpane-origin\"]/p[1]")
    WebElement originText;

    Actions actions = new Actions(driver);

    public void selectOriginTab() {
        originTab.click();
    }

    public String getOriginText() {
        actions.moveToElement(originText).perform();

        return originText.getText();
    }
}