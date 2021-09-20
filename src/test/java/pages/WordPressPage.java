package pages;

import okhttp3.WebSocketListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities_package.Driver;

public class WordPressPage {

    WebDriver driver;

    public WordPressPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="usernameOrEmail")
    public WebElement userName;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement continueButton;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(id = "first_name")
    public WebElement firstName;


    @FindBy(id = "last_name")
    public WebElement LastName;



    @FindBy(id = "display_name")
    public WebElement publicDisplayName;


    @FindBy(id = "description")
    public WebElement aboutMe;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(id = "notices")
    public WebElement alertText;

    @FindBy(css = "main .button.is-compact")
    public WebElement addButton;

    @FindBy(xpath = "//*[contains(text(), 'Add URL')]")
    public WebElement addURL;

    @FindBy(name = "value")
    public WebElement enterURL;

    @FindBy(name = "title")
    public WebElement urlDescription;

    @FindBy(xpath = "//*[contains(text(), 'Add Site')]")
    public WebElement addSite;

    @FindBy(xpath = "//*[@class='profile-link__url']")
    public WebElement addedLink;





}
