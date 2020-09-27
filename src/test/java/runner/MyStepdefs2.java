package runner;

import activity.contactManager.ContactManagerActivity;
import activity.contactManager.MainActivity;
import activity.contactManager.UpdateDialog;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.net.MalformedURLException;

public class MyStepdefs2 {

    UpdateDialog updateDialog= new UpdateDialog();
    MainActivity mainActivity= new MainActivity();
    ContactManagerActivity contactManagerActivity= new ContactManagerActivity();


    @Given("^I have open my contact manger app$")
    public void iHaveOpenMyContactMangerApp() {
    }

    /*@When("^I click \\[OK\\] button in update dialog$")
    public void iClickOKButtonInUpdateDialog() throws MalformedURLException {
        updateDialog.okButton.click();
    }*/

    @When("^I click \\[AddContact\\] button in main activity$")
    public void iClickAddContactButtonInMainActivity() throws MalformedURLException {
        mainActivity.addContactButton.click();
    }

    @And("^I type '(.*)' in \\[contact name\\] textbox in contact activity$")
    public void iTypeAAARemoveInContactNameTextboxInContactActivity(String value) throws MalformedURLException {
        contactManagerActivity.contactName.type(value);
    }

    @And("^I type '(.*)' in \\[contact number\\] textbox in contact activity$")
    public void iTypeInContactNumberTextboxInContactActivity(String value) throws MalformedURLException {
        contactManagerActivity.contactNumber.type(value);
    }

    @And("^I type '(.*)' in \\[contact email\\] textbox in contact activity$")
    public void iTypeRemoveRemoveComInContactEmailTextboxInContactActivity(String value) throws MalformedURLException {
        contactManagerActivity.contactEmail.type(value);
    }

    @And("^I click \\[save\\] button in  contact activity$")
    public void iClickSaveButtonInContactActivity() throws MalformedURLException {
        contactManagerActivity.saveButton.click();
    }

    @Then("^the cotact '(.*)' is displayed$")
    public void theCotactAAARemoveIsDisplayed(String expecteResult) {
        Assert.assertTrue("ERROR, el contacto no esta creado",mainActivity.isDisplayedContact(expecteResult));
    }
}