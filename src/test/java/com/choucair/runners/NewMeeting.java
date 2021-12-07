package com.choucair.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com/choucair/stepdefinitions",
        features = "src/test/resources/com.choucair/feature/new_meeting.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class NewMeeting {
}
