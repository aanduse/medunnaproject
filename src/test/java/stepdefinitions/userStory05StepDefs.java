package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.makeAnAppointmentPage;
import utilities.ConfigReader;
import utilities.Driver;

public class userStory05StepDefs {

    makeAnAppointmentPage makeAnAppointmentPage=new makeAnAppointmentPage();
    @Given("User Go to Medunna home page")
    public void user_go_to_medunna_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("medunna_url"));
    }
    @Then("User verifies if the Make an appointment button exits.")
    public void user_verifies_if_the_make_an_appointment_button_exits() {
    System.out.println(makeAnAppointmentPage.makeAnAppointmentButton.getText());
    Assert.assertTrue(makeAnAppointmentPage.makeAnAppointmentButton.isDisplayed());
    }
    @When("User clicks on the Make an Appointment button.")
    public void user_clicks_on_the_make_an_appointment_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User fill the {string} with correct credential")
    public void user_fill_the_with_correct_credential(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
