package com.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.choucair.userinterfaces.MeetingPage.*;

public class SelectUnit implements Task {

    private String unit;

    public SelectUnit(String unit){
        this.unit = unit;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LIST_UNIT),
                Click.on(UNIT.of(unit)),
                Click.on(SAVE_MEETING)
        );
    }

    public static SelectUnit with(String unit){
        return Tasks.instrumented(SelectUnit.class, unit);
    }
}
