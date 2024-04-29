package com.flutterautomation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import io.appium.java_client.AppiumDriver;
import net.thucydides.core.annotations.Step;

import com.flutterautomation.utils.flutter.FlutterFinder;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class ClickOnElement implements Interaction {

    private String key;

    public ClickOnElement(String key) {
        this.key = key;
    }

    public static ClickOnElement on(String key) {
        return instrumented(ClickOnElement.class, key);
    }

    @Step("{0} da Click en #key")
    public <T extends Actor> void performAs(T actor) {
        AppiumDriver driver = getProxiedDriver();
        FlutterFinder finder = new FlutterFinder(driver);
        finder.byValueKey(key).click();
    }

}