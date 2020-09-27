package testClean;

import activity.contactManager.ContactManagerActivity;
import activity.contactManager.MainActivity;
import activity.contactManager.UpdateDialog;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

/**
 * @autor : eynar.pari
 * @date : 19/09/2020.
 **/
public class ContactManagerTest {

    UpdateDialog updateDialog= new UpdateDialog();
    MainActivity mainActivity= new MainActivity();
    ContactManagerActivity contactManagerActivity= new ContactManagerActivity();


    @Test
    public void verifyCreateContact() throws MalformedURLException {
        String nameContact="AAAAAARemove";

        //updateDialog.okButton.click();
        mainActivity.addContactButton.click();
        contactManagerActivity.contactName.type(nameContact);
        contactManagerActivity.contactNumber.type("22222222");
        contactManagerActivity.contactEmail.type("remove@remove.com");
        contactManagerActivity.saveButton.click();

        // Verificacion

        Assert.assertTrue("ERROR, el contacto no esta creado",mainActivity.isDisplayedContact(nameContact));

    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
