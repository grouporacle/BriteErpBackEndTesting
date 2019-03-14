package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CRM_Page {

    public CRM_Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[5]/a")
    public WebElement CRMheader;

    @FindBy(xpath = "//ul[@class='oe_secondary_submenu nav nav-pills nav-stacked'][3]//li[2]//span")
    public WebElement activityType;

    @FindBy(xpath = "//tbody//tr[1]//td[3]")
    public WebElement activityName;




}
