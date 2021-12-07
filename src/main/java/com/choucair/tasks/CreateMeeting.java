package com.choucair.tasks;

import com.choucair.models.Meeting;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.interactions.ClickAndHoldAction;

import java.util.Map;

import static com.choucair.userinterfaces.MeetingPage.*;

public class CreateMeeting implements Task {

    private DataTable data;
    private Map<String, String> information;
    private Meeting meeting;

    public CreateMeeting(DataTable data) {
        this.data = data;
        information = this.data.asMap(String.class, String.class);
        meeting = new Meeting(information.get("meeting_name"), information.get("meeting_type"), information.get("meeting_number"),
                information.get("start_date"), information.get("time_start"), information.get("end_date"), information.get("time_end")
        );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MEETING_LIST),
                Click.on(MEETING_OPTION),
                Click.on(BTN_NEW_MEETING),
                Enter.theValue(meeting.getMeeting_name()).into(INPUT_NAME),
                Click.on(LIST_TYPE),
                Enter.theValue(meeting.getMeeting_type()).into(INPUT_TYPE),
                Click.on(TYPE),
                Enter.theValue(meeting.getMeeting_number()).into(INPUT_NUMBER),
                Enter.theValue(meeting.getStart_date()).into(INPUT_STAR_DATE),
                Enter.theValue(meeting.getEnd_date()).into(INPUT_END_DATE)
        );
    }

    public static CreateMeeting with(DataTable data) {
        return Tasks.instrumented(CreateMeeting.class, data);
    }

}
