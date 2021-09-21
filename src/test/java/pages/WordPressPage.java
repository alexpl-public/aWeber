package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities_package.Driver;

public class WordPressPage {


    public WordPressPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //Create locators for our elements
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

    @FindBy(id = "inspector-toggle-control-0")
    public WebElement himeGravProfileBtn;







}