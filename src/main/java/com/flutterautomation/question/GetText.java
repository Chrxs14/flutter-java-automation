package com.flutterautomation.question;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

import com.flutterautomation.utils.flutter.FlutterFinder;

import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class GetText implements Question<String> {

    private String elementFlutter;

    public GetText(String elementFlutter) {
        this.elementFlutter = elementFlutter;
    }

    public static GetText delElementoFlutter(String elementFlutter) {
        return new GetText(elementFlutter);
    }

    public String answeredBy(Actor actor) {
        AppiumDriver driver = getProxiedDriver();
        FlutterFinder flutterFinder = new FlutterFinder(driver);
        return flutterFinder.byValueKey(elementFlutter).getText();
    }
}
