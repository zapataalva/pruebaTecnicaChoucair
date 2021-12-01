package com.choucair.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {

    public static final Target USER = Target.the("Usuario del login")
            .locatedBy("//*[@id='StartSharp_Membership_LoginPanel0_Username']");

    public static final Target PASSWORD = Target.the("Password del login")
            .locatedBy("//*[@id='StartSharp_Membership_LoginPanel0_Password']");

    public static final Target BTN_LOGIN = Target.the("Boton para logearse")
            .locatedBy("//*[@id='StartSharp_Membership_LoginPanel0_LoginButton']");

}
