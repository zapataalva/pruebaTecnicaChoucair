package com.choucair.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MeetingPage extends PageObject {

    public static final Target MEETING_LIST = Target.the("Lista de opciones Meeting")
            .locatedBy("//*[@class='nav-icon fa fa-comments premium-feature']");

    public static final Target MEETING_OPTION = Target.the("Opcion Meeting")
            .locatedBy("//span[contains(text(),'Meetings')]");

    public static final Target BTN_NEW_MEETING = Target.the("Boton para crear nueva reunion")
            .locatedBy("//i[@class='fa fa-plus-circle text-green']");

    public static final Target INPUT_NAME = Target.the("Campo para nombre de la reunion")
            .locatedBy("//*[@id='StartSharp_Meeting_MeetingDialog14_MeetingName']");

    public static final Target INPUT_NUMBER = Target.the("Campo para numero de la reunion")
            .locatedBy("//*[@id='StartSharp_Meeting_MeetingDialog14_MeetingNumber']");

    public static final Target LIST_TYPE = Target.the("lista para tipo de la reunion")
            .locatedBy("//*[@id='select2-chosen-6']");

    public static final Target INPUT_TYPE = Target.the("Campo para tipo de la reunion")
            .locatedBy("//*[@id='s2id_autogen6_search']");

    public static final Target TYPE = Target.the("Tipo de la reunion")
            .locatedBy("//span[contains(@class,'select2-match')]");

    public static final Target INPUT_STAR_DATE = Target.the("Campo para fecha de inicio de la reunion")
            .locatedBy("//*[@id='StartSharp_Meeting_MeetingDialog14_StartDate']");

    public static final Target INPUT_END_DATE = Target.the("Campo para fecha de fin de la reunion")
            .locatedBy("//*[@id='StartSharp_Meeting_MeetingDialog14_EndDate']");

    public static final Target BTN_CREATE_LOCATION = Target.the("Boton para crear una nueva locacion")
            .locatedBy("//*[@id=\"StartSharp_Meeting_MeetingDialog14_PropertyGrid\"]/div/div/div[6]/a/b");

    public static final Target INPUT_NAME_LOCATION = Target.the("Input para el nombre de la locacion")
            .locatedBy("//*[@id='StartSharp_Meeting_MeetingLocationDialog37_Name']");

    public static final Target INPUT_ADDRESS_LOCATION = Target.the("Input para la direccion de la locacion")
            .locatedBy("//*[@id='StartSharp_Meeting_MeetingLocationDialog37_Address']");

    public static final Target INPUT_LATITUDE_LOCATION = Target.the("Input para la latitud de la locacion")
            .locatedBy("//*[@id='StartSharp_Meeting_MeetingLocationDialog37_Latitude']");

    public static final Target INPUT_LONGITUDE_LOCATION = Target.the("Input para la longitud de la locacion")
            .locatedBy("//*[@id='StartSharp_Meeting_MeetingLocationDialog37_Longitude']");

    public static final Target BTN_SAVE_LOCATION = Target.the("Boton para guardar la locacion")
            .locatedBy("/html/body/div[8]/div[2]/div/div[1]/div/div/div/div[1]/div/span");

    public static final Target BTN_NEW_ORGANIZED = Target.the("Boton para crear el organizador")
            .locatedBy("//*[@id=\"StartSharp_Meeting_MeetingDialog14_PropertyGrid\"]/div/div/div[8]/a/b");

    public static final Target INPUT_TITLE_ORGANIZED = Target.the("Input para ingresar titulo")
            .locatedBy("//*[@class='field Title']//*[@class='editor s-StringEditor']");

    public static final Target INPUT_FIRST_NAME_ORGANIZED = Target.the("Input para ingresar primer nombre")
            .locatedBy("//*[@class='field FirstName']//*[@class='editor s-StringEditor required']");

    public static final Target INPUT_LAST_NAME_ORGANIZED = Target.the("Input para ingresar apellido")
            .locatedBy("//*[@class='field LastName']//*[@class='editor s-StringEditor required']");

    public static final Target INPUT_EMAIL_ORGANIZED = Target.the("Input para ingresar email")
            .locatedBy("//*[@class='field Email']//*[@class='editor s-EmailEditor emailuser required']");

    public static final Target INPUT_DOMINIO_ORGANIZED = Target.the("Input para ingresar dominio")
            .locatedBy("//*[@class='field Email']//*[@class='emaildomain']");

    public static final Target INPUT_IDENTITY_ORGANIZED = Target.the("Input para ingresar identificacion")
            .locatedBy("//*[@class='field IdentityNo']//*[@class='editor s-StringEditor']");

    public static final Target LIST_USER_ORGANIZED = Target.the("Lista para escoger usuario")
            .locatedBy("//*[@class='field UserId']//a[@class='select2-choice select2-default']//*[@class='select2-chosen' and contains(text(), '--select--')]");

    public static final Target USER_ORGANIZED = Target.the("Escoger usuario")
            .locatedBy("//*[@class='select2-result-label' and contains(text(), 'admin')]");

    public static final Target BTN_SAVE_ORGANIZED = Target.the("Boton guardar cambios")
            .locatedBy("/html/body/div[7]/div[2]/div/div[1]/div/div/div/div[1]/div/span");

    public static final Target LIST_REPORTERS = Target.the("Listado de reportes")
            .locatedBy("//*[@class='field ReporterContactId col-sm-6']//*[@class='select2-container editor s-LookupEditor has-inplace-button']//*[@class = 'select2-chosen' and contains(text(),'--select--')]");

    public static final Target REPORTER = Target.the("Opcion de reporter")
            .locatedBy("//*[@class = 'select2-drop select2-display-none select2-with-searchbox select2-drop-active']//*[@class = 'select2-results']//*[@class='select2-result-label' and contains(text(), '{0}')]");

    public static final Target LIST_UNIT = Target.the("Listado de unidades de negocio")
            .locatedBy("//*[@class='field UnitId col-sm-6']//*[@class='select2-chosen']");

    public static final Target UNIT = Target.the("Opcion de unidades de negocio")
            .locatedBy("//*[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active']//*[@class='select2-results']//*[@class='select2-result-label' and contains(text(),'{0}')]");

    public static final Target SAVE_MEETING = Target.the("Opcion de unidades de negocio")
            .locatedBy("//*[@class='button-inner']//*[@class='fa fa-floppy-o text-purple']");

    public static final Target NAME_MEETING = Target.the("Nombre de la reunion")
            .locatedBy("//*[contains(text(), '{0}')]");

    public static final Target BTN_NEW_ATTENDEE = Target.the("Botón para crear nuevo attendee")
            .locatedBy("//*[@class='field AttendeeList']//*[@class='inplace-button inplace-create']");

    public static final Target INPUT_TITLE_ATTENDEE = Target.the("Campo para el titulo del attendee")
            .locatedBy("//*[@class='fieldset']//*[@class='field Title']//*[@class='editor s-StringEditor']");

    public static final Target INPUT_FIRST_NAME_ATTENDEE = Target.the("Campo para el first name del attendee")
            .locatedBy("//*[@class='fieldset']//*[@class='field FirstName']//*[@class='editor s-StringEditor required']");

    public static final Target INPUT_LAST_NAME_ATTENDEE = Target.the("Campo para el last name del attendee")
            .locatedBy("//*[@class='fieldset']//*[@class='field LastName']//*[@class='editor s-StringEditor required']");

    public static final Target INPUT_EMAIL_ATTENDEE = Target.the("Campo para el email del attendee")
            .locatedBy("//*[@class='fieldset']//*[@class='field Email']//*[@class='editor s-EmailEditor emailuser required']");

    public static final Target INPUT_DOMINIO_ATTENDEE = Target.the("Campo para el dominio del attendee")
            .locatedBy("//*[@class='fieldset']//*[@class='field Email']//*[@class='emaildomain']");

    public static final Target INPUT_IDENTITY_ATTENDEE = Target.the("Campo para la identificacion del attendee")
            .locatedBy("//*[@class='fieldset']//*[@class='field IdentityNo']//*[@class='editor s-StringEditor']");

    public static final Target BTN_SAVE_ATTENDEE = Target.the("Boton para guardar el attendee")
            .locatedBy("//*[@class='s-TemplatedDialog ui-dialog-content ui-widget-content']//*[@class='tool-buttons']//*[@class='tool-button save-and-close-button icon-tool-button']//*[@class='button-inner']");
}
