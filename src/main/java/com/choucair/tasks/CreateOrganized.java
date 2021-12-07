package com.choucair.tasks;

import com.choucair.models.User;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static com.choucair.userinterfaces.MeetingPage.*;

public class CreateOrganized implements Task {

    private DataTable data;
    private Map<String,String> information;
    private User organized;

    public CreateOrganized(DataTable data) {
        this.data = data;
        information = this.data.asMap(String.class, String.class);
        organized = new User(information.get("title"), information.get("first_name"), information.get("last_name"),
                information.get("email"), information.get("dominio"),information.get("identity"), information.get("user"));
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_NEW_ORGANIZED),
                Enter.theValue(organized.getTitle()).into(INPUT_TITLE_ORGANIZED),
                Enter.theValue(organized.getFirst_name()).into(INPUT_FIRST_NAME_ORGANIZED),
                Enter.theValue(organized.getLast_name()).into(INPUT_LAST_NAME_ORGANIZED),
                Enter.theValue(organized.getEmail()).into(INPUT_EMAIL_ORGANIZED),
                Enter.theValue(organized.getDominio()).into(INPUT_DOMINIO_ORGANIZED),
                Enter.theValue(organized.getIdentity()).into(INPUT_IDENTITY_ORGANIZED),
                Click.on(LIST_USER_ORGANIZED), Click.on(USER_ORGANIZED),
                Click.on(BTN_SAVE_ORGANIZED)
        );
    }

    public static CreateOrganized with(DataTable data){
        return Tasks.instrumented(CreateOrganized.class,data);
    }
}
