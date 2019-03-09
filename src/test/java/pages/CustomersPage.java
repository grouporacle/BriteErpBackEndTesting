package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CustomersPage {
    public CustomersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[2]/div[1]/div/button[1]")
    public WebElement customerCardCreateButton;

    @FindBy(xpath ="/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/h1[1]/input[1]")
    public WebElement nameField;

    @FindBy(xpath ="(//input[@class='o_radio_input'])[1]")
    public WebElement individRadioButton;

    @FindBy(xpath="(//input[@class='o_radio_input'])[2]")
    public WebElement companyRadioButton;

    @FindBy(xpath = "//body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]")
    public WebElement saveButton;

    @FindBy(xpath = "(//li[@class='active'])[2]")
    public WebElement createdCardName;

    @FindBy(xpath = "(//input[@class='o_field_char o_field_widget o_input o_address_street'])[1]")
    public WebElement streetField1;

    @FindBy(xpath = "(//input[@class='o_field_char o_field_widget o_input o_address_street'])[2]")
    public WebElement streetField2;

    @FindBy(xpath = "//*[@id=\"o_field_input_259\"]")
    public WebElement state;

    @FindBy(xpath = "//*[@id=\"o_field_input_258\"]")
    public WebElement city;

    @FindBy(xpath = "//*[@id=\"o_field_input_261\"]")
    public WebElement country;

    @FindBy(xpath = "//td[@class='o_data_cell o_readonly_modifier']")
    public List<WebElement> tagsList;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/table[2]/tbody[1]/tr[2]/td[2]/div[1]/input[1]")
    public WebElement phoneField;

    @FindBy(xpath = "//*[@id=\"o_field_input_266\"]")
    public WebElement mobilePhone;

    @FindBy(xpath = "//*[@id=\"o_field_input_269\"]")
    public WebElement website;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/table[2]/tbody[1]/tr[5]/td[2]/input[1]")
    public WebElement emailField;

    @FindBy(xpath = "//*[@id=\"o_field_input_260\"]")
    public WebElement zip;

    @FindBy(xpath = "//*[@id=\"o_field_input_262\"]")
    public WebElement tin_field;

    @FindBy(xpath = "//*[@id=\"o_field_input_264\"]")
    public WebElement job_position;

    @FindBy(xpath = "//*[@id=\"o_field_input_270\"]")
    public WebElement title_field;
}
