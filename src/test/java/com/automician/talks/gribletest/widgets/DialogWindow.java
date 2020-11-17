package com.automician.talks.gribletest.widgets;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class DialogWindow {
    private SelenideElement container = $(".ui-dialog");

    public DialogWindow setfor(String label, String value) {
        container.$(withText(label)).find(byXpath("./following-sibling::*/input")).setValue(value);
        return this;
    }

    public void submit() {
        container.$(".dialog-buttons .ui-button").shouldBe(Condition.exist).shouldBe(Condition.enabled).click();
    }
}
