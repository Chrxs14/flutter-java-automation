package com.flutterautomation.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.flutterautomation.interactions.ClickOnElement;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class IncrementOrDecrement implements Task {
    private int taps;
    private String element;

    public IncrementOrDecrement(String element, int taps) {
        this.taps = taps;
        this.element = element;
    }

    public static IncrementOrDecrement ofCounter(int taps, String element) {
        return instrumented(IncrementOrDecrement.class, element, taps);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < taps; i++) {
            actor.attemptsTo(
                    ClickOnElement.on(element));
        }
    }
}
