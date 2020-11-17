package com.automician.talks.gribletest.widgets;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.awt.*;
import java.lang.module.ModuleFinder;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Products {
    public void open() {
        Selenide.open("/");
    }

    public void add(String name) {
        $("#btn-add-product").shouldBe(Condition.exist).shouldBe(Condition.enabled).click();
        DialogWindow dialogWindow = new DialogWindow();

        new DialogWindow()
                .setfor("Name:", name)
                .setfor("Path:", name)
                .submit();

        new ConfirmationDialog().Confirm();
    }


}
