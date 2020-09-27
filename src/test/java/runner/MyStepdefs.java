package runner;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("^I have a admin user$")
    public void iHaveAAdminUser() {
        System.out.println("Admin User");
    }

    @When("^I set the (login|pwd) textbox with(.*)$")
    public void iSetTheLoginTextboxWithAdmin(String typeControl,String value) {
        System.out.println(typeControl+" textbox , value :"+value);
    }

    @And("^I click login button$")
    public void iClickLoginButton() {
        System.out.println("click login");
    }

    @Then("^I enter to the application$")
    public void iEnterToTheApplication() {
        System.out.println("verificar");
    }
}
