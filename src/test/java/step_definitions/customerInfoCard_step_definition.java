package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import pages.CustomersPage;
import utilities.ApplicationConstants;
import utilities.BrowserUtils;
import utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

public class customerInfoCard_step_definition {
    CustomersPage customersPage = new CustomersPage();
    String file =".\\src\\test\\resources\\test_data\\Phase 5 project.xlsx";
    String sheet ="CustomerInfoCard1";
    ExcelUtil excelTestData = new ExcelUtil(file, sheet);
    List<Map<String , String >> listInfoCard =excelTestData.getDataList();

    @Given("the user is on Customers page")
    public void the_user_is_on_Customers_page() {
        customersPage.customerCardCreateButton.click();
        BrowserUtils.explicitWaitTitleIs(10, ApplicationConstants.NEWTITLE);
        System.out.println("A user is going to create a new customer information card");
    }

    @When("{string} sendKeys {string} from excel {string}, {string} sheet")
    public void sendkeys_from_excel_sheet(String actualUser, Integer i, String excelName, String sheetName) {
        customersPage.nameField.clear();
        customersPage.nameField.sendKeys(listInfoCard.get(i).get("Name_field")+ Keys.ENTER);
        customersPage.streetField1.sendKeys(listInfoCard.get(i).get("Street_1"));
        customersPage.streetField2.sendKeys(listInfoCard.get(i).get("Street_2"));
        customersPage.city.sendKeys(listInfoCard.get(i).get("City"));
        customersPage.state.sendKeys(listInfoCard.get(i).get("State"));
        customersPage.zip.sendKeys(listInfoCard.get(i).get("ZIP"));
        customersPage.tin_field.sendKeys(listInfoCard.get(i).get("TIN"));
        customersPage.emailField.sendKeys(listInfoCard.get(i).get("email"));
        customersPage.phoneField.sendKeys(listInfoCard.get(i).get("Phone"));
        customersPage.mobilePhone.sendKeys(listInfoCard.get(i).get("Mobile"));
        customersPage.job_position.sendKeys(listInfoCard.get(i).get("Job_position"));
        customersPage.phoneField.sendKeys(listInfoCard.get(i).get("Phone"));
        customersPage.mobilePhone.sendKeys(listInfoCard.get(i).get("Mobile"));
        customersPage.emailField.sendKeys(listInfoCard.get(i).get("Email"));
        customersPage.website.sendKeys(listInfoCard.get(i).get("Website"));
        customersPage.title_field.sendKeys(listInfoCard.get(i).get("Title"));

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
    public static void main(String[] args) throws Exception {
        System.out.println("Excel test");
        String file =".\\src\\test\\resources\\test_data\\Phase5project.xlsx";
        String sheet ="CustomerInfoCard1";
        ExcelUtil excelTestData = new ExcelUtil(file, sheet);
        List<String> columns = excelTestData.getColumnsNames();
        System.out.println(columns);

        System.out.println(excelTestData.columnCount());
        System.out.println(excelTestData.rowCount());
        List<Map<String, String>> listInfoCard = excelTestData.getDataList();

        for (int i=0; i<listInfoCard.size(); i++){
            System.out.println(" getting " +(i)+" ========= "+listInfoCard.get(i).get("Name_field"));
        }
        System.out.println(listInfoCard.size());
        System.out.println(excelTestData.rowCount());
        System.out.println(excelTestData.columnCount());
        excelTestData.getCellData(0,1);
    }
}
