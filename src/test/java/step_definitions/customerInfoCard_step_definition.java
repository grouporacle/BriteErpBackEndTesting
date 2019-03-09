package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import pages.LoginPage;
import utilities.*;

import java.util.List;
import java.util.Map;

import static utilities.ExcelPath.PATH_PHASE_V;
import static utilities.ExcelPath.SHEET_CUSTOMERINFOCARD;

public class customerInfoCard_step_definition extends BrowserUtils {

    Pages pages = new Pages();

    ExcelUtil excelTestData = new ExcelUtil(PATH_PHASE_V, SHEET_CUSTOMERINFOCARD);

    List<Map<String,String >> listInfoCard =excelTestData.getDataList();



    @Then("{string} clicks on {string} module")
    public void clicks_on_module(String string, String string2) {
        BrowserUtils.explicitWaitTitleIs(15, ApplicationConstants.INBOX);
        pages.homePage().CRMheader.click();


    }

    @Then("{string} clicks on {string} page")
    public void clicks_on_page(String string, String string2) {
        pages.homePage().customersHeader.click();
        BrowserUtils.explicitWaitTitleIs(10, ApplicationConstants.CUSTOMERSTITLE);
        System.out.println("A user is going to create a new customer information card");
    }

    @When("{string} clicks on {string} button")
    public void clicks_on_button(String string, String string2) {
        pages.getCustomersPage().customerCardCreateButton.click();
        BrowserUtils.explicitWaitTitleIs(10, ApplicationConstants.NEWTITLE);
        System.out.println("A user is going to create a new customer information card");
    }


    @When("{string} sendKeys {string} from excel {string}, {string} sheet")
    public void sendkeys_from_excel_sheet(String actualUser, Integer i, String excelName, String sheetName) {
        pages.getCustomersPage().nameField.clear();
        pages.getCustomersPage().nameField.sendKeys(listInfoCard.get(i).get("Name_field")+ Keys.ENTER);
        pages.getCustomersPage().streetField1.sendKeys(listInfoCard.get(i).get("Street_1"));
        pages.getCustomersPage().streetField2.sendKeys(listInfoCard.get(i).get("Street_2"));
        pages.getCustomersPage().city.sendKeys(listInfoCard.get(i).get("City"));
        pages.getCustomersPage().state.sendKeys(listInfoCard.get(i).get("State"));
        pages.getCustomersPage().zip.sendKeys(listInfoCard.get(i).get("ZIP"));
        pages.getCustomersPage().tin_field.sendKeys(listInfoCard.get(i).get("TIN"));
        pages.getCustomersPage().emailField.sendKeys(listInfoCard.get(i).get("email"));
        pages.getCustomersPage().phoneField.sendKeys(listInfoCard.get(i).get("Phone"));
        pages.getCustomersPage().mobilePhone.sendKeys(listInfoCard.get(i).get("Mobile"));
        pages.getCustomersPage().job_position.sendKeys(listInfoCard.get(i).get("Job_position"));
        pages.getCustomersPage().phoneField.sendKeys(listInfoCard.get(i).get("Phone"));
        pages.getCustomersPage().mobilePhone.sendKeys(listInfoCard.get(i).get("Mobile"));
        pages.getCustomersPage().emailField.sendKeys(listInfoCard.get(i).get("Email"));
        pages.getCustomersPage().website.sendKeys(listInfoCard.get(i).get("Website"));
        pages.getCustomersPage().title_field.sendKeys(listInfoCard.get(i).get("Title"));


    }

    @When("{string} clicks {string} button")
    public void clicks_button(String string, String string2) {
        pages.getCustomersPage().saveButton.click();
    }

    @Then("{string} should be able to see {string} on page from excel {string}, {string} sheet")
    public void should_be_able_to_see_on_page_from_excel_sheet(String actualUser, Integer i, String excelName, String sheetName) {
            System.out.println( pages.getCustomersPage().nameField.getText());
        System.out.println(pages.getCustomersPage().streetField1.getText());
        System.out.println(pages.getCustomersPage().streetField2.getText());
        System.out.println(pages.getCustomersPage().city.getText());

    }

    @Then("{string} should be able to see {string} in Database from excel {string}, {string} sheet")
    public void should_be_able_to_see_in_Database_from_excel_sheet(String string, String string2, String string3, String string4) {

    }
    public static void main(String[] args)  {
        System.out.println("Excel test");

        ExcelUtil excelTestData = new ExcelUtil(PATH_PHASE_V, SHEET_CUSTOMERINFOCARD);

       List<Map<String, String>> listInfoCard = excelTestData.getDataList();

        for (int i=0; i<listInfoCard.size(); i++){
          System.out.println(" getting " +(i)+" ========= "+listInfoCard.get(i).get("Name_field"));
     }

      System.out.println(listInfoCard.size());
       System.out.println(excelTestData.rowCount());
       System.out.println(excelTestData.columnCount());
        System.out.println(excelTestData.getCellData(1,0));

    }
}

