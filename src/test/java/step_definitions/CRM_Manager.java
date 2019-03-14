package step_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CRM_Page;
import utilities.ConfigurationReader;
import utilities.Driver;

public class CRM_Manager {


    @Then("the manager goes to the activity type page")
    public void the_manager_goes_to_the_activity_type_page() {
        CRM_Page crm = new CRM_Page();
        crm.CRMheader.click();
        crm.activityType.click();
    }


    @Then("I query database with sql:{string}")
    public void i_query_database_with_sql(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


    @Then("UI data and Database data must match")
    public void ui_data_and_Database_data_must_match() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}
