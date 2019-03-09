package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.CustomersPage;
import utilities.ApplicationConstants;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.ExcelUtil;

import java.util.List;
import java.util.Map;


public class customerInfoCard_step_definition {
    Actions action = new Actions(Driver.getDriver());
    CustomersPage customersPage = new CustomersPage();
    String file =".\\src\\test\\resources\\test_data\\Phase5project.xlsx";
    String sheet ="CustomerInfoCard1";
    ExcelUtil excelTestData = new ExcelUtil(file, sheet);
    List<Map<String , String >> listInfoCard =excelTestData.getDataList();
    List<String> columnKey = excelTestData.getColumnsNames();

    @Given("the user is on Customers page")
    public void the_user_is_on_Customers_page() {
        //my suggestion is title check here to understand where are we

    }

    @When("{string} sendKeys {string} from excel {string}, {string} sheet")
    public void sendkeys_from_excel_sheet(String string, String string2, String string3, String string4) {
        System.out.println("A user is going to create a new customer information card");
        System.out.println(listInfoCard.get(0).get(columnKey.get(0)));
        BrowserUtils.explicitWaitTitleIs(15, ApplicationConstants.CUSTOMERSTITLE);
        customersPage.customerCardCreateButton.click();
        for(int i=0;i<columnKey.size();i++) {
            int j=0;
            BrowserUtils.explicitWaitTitleIs(20, ApplicationConstants.NEWTITLE);
            //create 11 users at same time.

                customersPage.nameField.sendKeys(listInfoCard.get(i).get(columnKey.get(j++)));
                customersPage.company_field.sendKeys(listInfoCard.get(i).get(columnKey.get(j++)));
                customersPage.company_select.click();
                BrowserUtils.waitForVisibility(customersPage.addressType,5);
                new Select(customersPage.addressType).selectByVisibleText("Other address");


                customersPage.streetField1.sendKeys(listInfoCard.get(i).get(columnKey.get(j++)));
                customersPage.streetField2.sendKeys(listInfoCard.get(i).get(columnKey.get(j++)));
                customersPage.city.sendKeys(listInfoCard.get(i).get(columnKey.get(j++)));
                customersPage.state.clear();
                customersPage.state.sendKeys(listInfoCard.get(i).get(columnKey.get(j++)));
            //trigger
            action.moveToElement(customersPage.trigger);
            action.click().build().perform();
            //trigger ends

                customersPage.zip.sendKeys(listInfoCard.get(i).get(columnKey.get(j++)));
                customersPage.tag_field.sendKeys(listInfoCard.get(i).get(columnKey.get(j++)));
            //trigger
            action.moveToElement(customersPage.trigger);
            action.click().build().perform();
            if(customersPage.companyCreationCreateButton.isDisplayed()){
                BrowserUtils.waitForVisibility(Driver.getDriver().findElement(By.className("modal-content")),15);
                customersPage.companyCreationCreateButton.click();}
            customersPage.job_position.click();
            //trigger ends

                customersPage.job_position.click();
                customersPage.job_position.sendKeys(listInfoCard.get(i).get(columnKey.get(j++)));
                customersPage.mobilePhone.sendKeys(listInfoCard.get(i).get(columnKey.get(j++)));
                customersPage.emailField.sendKeys(listInfoCard.get(i).get(columnKey.get(j++)));
                customersPage.website.sendKeys(listInfoCard.get(i).get(columnKey.get(j++)));
                customersPage.title_field.sendKeys(listInfoCard.get(i).get(columnKey.get(j++)));
           //trigger
            action.moveToElement(customersPage.trigger);
            action.click().build().perform();
            if(Driver.getDriver().findElement(By.className("modal-content")).isDisplayed()){
            BrowserUtils.waitForVisibility(Driver.getDriver().findElement(By.className("modal-content")),15);
            customersPage.companyCreationCreateButton.click();}
            action.moveToElement(customersPage.trigger);
            action.click().build().perform();
           // trigger end


            String expectedTitle = listInfoCard.get(i).get(columnKey.get(1))+", "+listInfoCard.get(i).get(columnKey.get(0));

            System.out.println(listInfoCard.get(i).get(columnKey.get(1))+", "+listInfoCard.get(i).get(columnKey.get(0)+" - Odoo"));
            System.out.println("at the end"+i);
            customersPage.saveButton.click();

            BrowserUtils.wait(5);       //change this
            customersPage.secondCreateButton.click();


        }
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
