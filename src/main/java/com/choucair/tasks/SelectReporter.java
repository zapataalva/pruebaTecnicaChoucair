package com.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.choucair.userinterfaces.MeetingPage.*;

public class SelectReporter implements Task {

    private String reporter;

    public SelectReporter(String reporter) {
        this.reporter = reporter;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LIST_REPORTERS),
                Click.on(REPORTER.of(reporter))
        );
    }

    public static SelectReporter with(String reporter){
        return Tasks.instrumented(SelectReporter.class, reporter);
    }
}
