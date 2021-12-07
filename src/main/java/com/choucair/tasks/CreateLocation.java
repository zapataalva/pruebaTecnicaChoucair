package com.choucair.tasks;

import com.choucair.models.Location;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Map;

import static com.choucair.userinterfaces.MeetingPage.*;

public class CreateLocation implements Task {

    private DataTable data;
    private Map<String,String> information;
    private Location location;

    public CreateLocation(DataTable data) {
        this.data = data;
        information = this.data.asMap(String.class, String.class);
        location = new Location(information.get("name"),information.get("address"), information.get("longitude"), information.get("latitude"));
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CREATE_LOCATION),
                Enter.theValue(location.getName()).into(INPUT_NAME_LOCATION),
                Enter.theValue(location.getAddress()).into(INPUT_ADDRESS_LOCATION),
                Enter.theValue(location.getLatitude()).into(INPUT_LATITUDE_LOCATION),
                Enter.theValue(location.getLongitude()).into(INPUT_LONGITUDE_LOCATION),
                 Click.on(BTN_SAVE_LOCATION)
        );
    }

    public static CreateLocation with(DataTable data){
        return Tasks.instrumented(CreateLocation.class,data);
    }
}
