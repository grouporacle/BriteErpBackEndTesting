package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class customerInfoCard_step_definition {

    @Given("the user is on Customers page")
    public void the_user_is_on_Customers_page() {

    }

    @When("{string} sendKeys {string} from excel {string}, {string} sheet")
    public void sendkeys_from_excel_sheet(String string, String string2, String string3, String string4) {

    }

    @When("{string} clicks {string} button")
    public void clicks_button(String string, String string2) {

    }

    @Then("{string} should be able to see {string} on page from excel {string}, {string} sheet")
    public void should_be_able_to_see_on_page_from_excel_sheet(String string, String string2, String string3, String string4) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("{string} should be able to see {string} in Database from excel {string}, {string} sheet")
    public void should_be_able_to_see_in_Database_from_excel_sheet(String string, String string2, String string3, String string4) {

    }
}
