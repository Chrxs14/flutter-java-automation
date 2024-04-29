package com.flutterautomation.stepdenitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static com.flutterautomation.views.CounterAppView.INCREMENT_BUTTON;
import static com.flutterautomation.views.CounterAppView.DECREMEMT_BUTTON;
import static com.flutterautomation.views.CounterAppView.RESET_BUTTON;
import static com.flutterautomation.views.CounterAppView.COUNTER_TEXT;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import net.serenitybdd.screenplay.ensure.Ensure;

import com.flutterautomation.interactions.ClickOnElement;
import com.flutterautomation.question.GetText;
import com.flutterautomation.task.IncrementOrDecrement;

public class AppTestStepDefinitions {

    @Before
    public void setup() {
        OnStage.setTheStage(new OnlineCast());
    }

    @When("^(.*) incrementa el contador a (.*)$")
    @Given("^que (.*) quiere incrementar el contador a (.*)$")
    public void invrementarContador(String actorName, int cantidadTaps) {
        theActorCalled(actorName).attemptsTo(
                IncrementOrDecrement.ofCounter(cantidadTaps, INCREMENT_BUTTON));
    }

    @When("^el disminuye el contador a (.*)$")
    public void disminuirContador(int disminuirCantidadTaps) {
        theActorInTheSpotlight().attemptsTo(
                IncrementOrDecrement.ofCounter(disminuirCantidadTaps, DECREMEMT_BUTTON));
    }

    @When("^el reinicia el contador$")
    public void reiniciarContador() {
        theActorInTheSpotlight().attemptsTo(
                ClickOnElement.on(RESET_BUTTON));
    }

    @SuppressWarnings("deprecation")
    @Entonces("^el debe observar el contador en (\\d+)$")
    public void verificarContador(int arg1) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.thatTheAnswerTo(GetText.delElementoFlutter(COUNTER_TEXT)).isEqualTo(String.valueOf(arg1)));
    }
}
