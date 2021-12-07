package com.choucair.tasks;

import com.choucair.models.User;
import com.choucair.userinterfaces.MeetingPage;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static com.choucair.userinterfaces.MeetingPage.*;

public class CreateAttendee implements Task {

    private DataTable data;
    private Map<String, String> information;
    private User reporter;

    public CreateAttendee(DataTable data) {
        this.data = data;
        information = data.asMap(String.class, String.class);
        reporter = new User(information.get("title"), information.get("first_name"), information.get("last_name"),
                information.get("email"), information.get("dominio"),information.get("identity"), information.get("user"));
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(BTN_NEW_ATTENDEE),
                Enter.keyValues(reporter.getTitle()).into(INPUT_TITLE_ATTENDEE),
                Enter.keyValues(reporter.getFirst_name()).into(INPUT_FIRST_NAME_ATTENDEE),
                Enter.keyValues(reporter.getLast_name()).into(INPUT_LAST_NAME_ATTENDEE),
                Enter.keyValues(reporter.getEmail()).into(INPUT_EMAIL_ATTENDEE),
                Enter.keyValues(reporter.getDominio()).into(INPUT_DOMINIO_ATTENDEE),
                Enter.keyValues(reporter.getIdentity()).into(INPUT_IDENTITY_ATTENDEE),
                Click.on(BTN_SAVE_ATTENDEE)
        );
    }

    public static CreateAttendee with(DataTable data){
        return Tasks.instrumented(CreateAttendee.class, data);
    }

}
