package step_definitions;

import io.cucumber.java.en.Given;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.WordPressPage;
import utilities_package.ConfigurationReader;
import utilities_package.Driver;
import utilities_package.SelectHelper;

public class WordPressLogin {

    //Create instance of wordPressPage class in order to share element locators
    WordPressPage wordPress = new WordPressPage();
    //Declare implicit wait
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    //Install Log4J
    static final Logger log = LogManager.getLogger(SelectHelper.class);

    @Given("I landed on the my profile page")
    public void iLandedOnTheMyProfilePage()  {
        //Declare URL using configuration property file
        Driver.getDriver().get(ConfigurationReader.getProperty("ui-config.properties", "wordPressURL"));
        //Declare two string variables for username and password. Use configuration file for credentials
        String userName = ConfigurationReader.getProperty("ui-config.properties", "wordPress.username");
        String password = ConfigurationReader.getProperty("ui-config.properties", "wordPress.password");
        //Enter username
        wordPress.userName.sendKeys(userName);
        log.info("Enter userName");
        wordPress.continueButton.click();
        log.info("Click continue button");
        //Create wait for password field'
        wait.until(ExpectedConditions.visibilityOf(wordPress.password));
        //Enter password
        wordPress.password.sendKeys(password);
        log.info("Enter password");
        //Click on login button
        wordPress.loginButton.click();
        log.info("Click log in button");




    }

}
