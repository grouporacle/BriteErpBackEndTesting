package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;

public class CustomersPage {
    public Actions action = new Actions(Driver.getDriver());

    public CustomersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
    public WebElement customerCardCreateButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/h1[1]/input[1]")
    public WebElement nameField;

    @FindBy(xpath = "(//input[@class='o_radio_input'])[1]")
    public WebElement individRadioButton;

    @FindBy(xpath = "(//input[@class='o_radio_input'])[2]")
    public WebElement companyRadioButton;

    @FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]")
    public WebElement saveButton;

    @FindBy(xpath = "(//li[@class='active'])[2]")
    public WebElement createdCardName;

    @FindBy(xpath = "(//input[@class='o_field_char o_field_widget o_input o_address_street'])[1]")
    public WebElement streetField1;

    @FindBy(xpath = "(//input[@class='o_field_char o_field_widget o_input o_address_street'])[2]")
    public WebElement streetField2;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[2]/div[1]/input[1]")
    public WebElement state;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/input[3]")
    public WebElement city;

    @FindBy(xpath = "//*[@id=\"o_field_input_261\"]")
    public WebElement country;

    @FindBy(xpath = "//td[@class='o_data_cell o_readonly_modifier']")
    public List<WebElement> tagsList;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/table[2]/tbody[1]/tr[2]/td[2]/div[1]/input[1]")
    public WebElement phoneField;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/table[2]/tbody[1]/tr[3]/td[2]/div[1]/input[1]")
    public WebElement mobilePhone;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/table[2]/tbody[1]/tr[6]/td[2]/input[1]")
    public WebElement website;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/table[2]/tbody[1]/tr[5]/td[2]/input[1]")
    public WebElement emailField;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/input[4]")
    public WebElement zip;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[4]/td[2]/div[1]/div[1]/div[1]/input[1]")
    public WebElement tag_field;

    @FindBy(xpath = "/html[1]/body[1]/ul[9]/li[1]")
    public WebElement tag_list;

    @FindBy(xpath = "//input[contains(@placeholder,'e.g. Sales Director')]")
    public WebElement job_position;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/table[2]/tbody[1]/tr[7]/td[2]/div[1]/div[1]/input[1]")
    public WebElement title_field;

    @FindBy(xpath = "/html[1]/body[1]/ul[2]/li[1]")
    public WebElement title_list;


    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/div[1]/input[1]")
    public WebElement company_field;

    @FindBy(xpath = "/html[1]/body[1]/ul[1]")
    public WebElement company_select;

    @FindBy(css = "//body[@class='o_web_client']/ul[2]/li[1]")
    public WebElement stateList;


    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[1]")
    public WebElement companyCreationCreateButton;

    @FindBy(xpath = "//label[@class='o_form_label'][contains(text(),'Address')]")
    public WebElement trigger;

    @FindBy(xpath = "//select[contains(@name,'type')]")
    public WebElement addressType;

    @FindBy(xpath = "//input[@name='code']")
    public WebElement stateCode;

    @FindBy(xpath = "//li[@class='ui-menu-item'][1]")
    public WebElement stateCreationCountrySelect;


    @FindBy(xpath = "//table[@class='o_group o_inner_group']//div[@name='country_id']//input[@type='text']")
    public WebElement stateCreationCountryInput;

    @FindBy(xpath = "/html[1]/body[1]/div[7]/div[1]/div[1]/div[3]/button[1]")
    public WebElement stateCretionSave;

    @FindBy(xpath = "//span[@css='1']")
    public WebElement countryCreationCreateButton;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement secondCreateButton;



    //wip
    //public void trigger(){
    //    ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
    //        public Boolean apply(WebDriver driver) {

    //            return true;
    //       }
    //     };
    //      try {
    //          WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
    //          wait.until(expectation);
    //      } catch (Exception error) {
    //          error.printStackTrace();
    //      }
// }


}


