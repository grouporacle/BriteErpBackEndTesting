package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import utilities.ApplicationConstants;
import utilities.BrowserUtils;
import utilities.Pages;

public class UIandDataBaseVerification_step_definition {


    Pages pages = new Pages();

    @Given("user is on Create Customer Info Card")
    public void user_is_on_Create_Customer_Info_Card() {
        BrowserUtils.explicitWaitTitleIs(10, ApplicationConstants.NEWTITLE);
        Assert.assertTrue(pages.getCustomersPage().customerCardCreateButton.isDisplayed());
    }

    @When("user fills out required fields")
    public void user_fills_out_required_fields() {

    }

    @Then("the same data should be stored in Database")
    public void the_same_data_should_be_stored_in_Database() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}
