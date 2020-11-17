package com.automician.talks.gribletest.widgets;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.Find;

import static com.codeborne.selenide.Selenide.$;

public class ConfirmationDialog {
    private SelenideElement container = $(".noty_type_confirm");

    public void Confirm() {
        this.container.find(".btn-primary").shouldBe(Condition.exist).shouldBe(Condition.enabled).click();
    }

    public void decline() {
        this.container.find(".btn-danger").click();
    }
}
