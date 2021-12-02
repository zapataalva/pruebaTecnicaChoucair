package com.choucair.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BusinessUnitPage extends PageObject {

    public static final Target OPTION_ORGANIZATION = Target.the("Opcion de organizacion")
            .locatedBy("//span[contains(text(),'Organization')]");

    public static final Target OPTION_BUSINESS = Target.the("Opcion de unidad de negocio")
            .locatedBy("//span[contains(text(),'Business Units')]");

    public static final Target BTN_NEW_BUSINESS = Target.the("Boton para crear nueva unidad de negocio")
            .locatedBy("//i[@class='fa fa-plus-circle text-green']");

    public static final Target INPUT_NAME = Target.the("Input para digitar el nombre")
            .locatedBy("//input[@id='StartSharp_Organization_BusinessUnitDialog7_Name']");

    public static final Target BTN_APPLY_CHANGES = Target.the("Boton para aplicar cambios")
            .locatedBy("//i[@class='fa fa-check-circle text-purple']");

    public static final Target BTN_CLOSE = Target.the("Boton para cerrar ventana de creacion de unidad")
            .locatedBy("//i[@class='fa fa-times']");

    public static final Target NAME_BUSINESS = Target.the("Nombre del negocio")
            .locatedBy("//*[contains(text(), '{0}')]");

}
