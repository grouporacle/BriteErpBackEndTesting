package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(id = "login")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[@id=\"wrapwrap\"]/main/div/form/div[3]/button")
    public WebElement loginButton;


    public void login(String email ,String password){

        this.username.sendKeys(email);
        this.password.sendKeys(password);
    }
}