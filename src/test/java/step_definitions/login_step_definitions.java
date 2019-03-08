package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CustomersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ApplicationConstants;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class login_step_definitions {
    LoginPage loginPage = new LoginPage();
    HomePage crmModule = new HomePage();
    CustomersPage customersPage = new CustomersPage();


    @Given("the user goes to url")
    public void the_user_goes_to_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @When("the {string} enters valid email and password")
    public void the_enters_valid_email_and_password(String username) {
        if (username.equalsIgnoreCase("user")) {
            loginPage.login(ConfigurationReader.getProperty("loginUser"), ConfigurationReader.getProperty("passwordUser"));
        } else if (username.equalsIgnoreCase("manager")) {
            loginPage.login(ConfigurationReader.getProperty("loginManager"), ConfigurationReader.getProperty("passwordManager"));
        }
        loginPage.loginButton.click();

    }

    @When("the user clicks on CRM module")
    public void the_user_clicks_on_CRM_module() {
        BrowserUtils.explicitWaitTitleIs(20, ApplicationConstants.INBOX);
        crmModule.CRMheader.click();
        System.out.println("I am clicking on CRM module");
    }

    @When("the user clicks on Customers page")
    public void the_user_clicks_on_Customers_page() {
        BrowserUtils.explicitWaitTitleIs(15, ApplicationConstants.PIPELINETITLE);
        crmModule.customersHeader.click();
        System.out.println("I am clicking on Customers feature");
}

    @Then("the user clicks on Create button -Customers")
    public void the_user_clicks_on_Create_button_Customers() {
       BrowserUtils.explicitWaitTitleIs(15, ApplicationConstants.CUSTOMERSTITLE);
        customersPage.customerCardCreateButton.click();
        BrowserUtils.explicitWaitTitleIs(15, ApplicationConstants.NEWTITLE);
        System.out.println("I am going to create Customer Info Card");
    }


}