package step_definitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.WordPressPage;
import utilities_package.ConfigurationReader;
import utilities_package.Driver;

public class WordPressLogin {

    WordPressPage wordPress = new WordPressPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("I landed on the my profile page")
    public void iLandedOnTheMyProfilePage()  {
        //Declare URL using configuration property file
        Driver.getDriver().get(ConfigurationReader.getProperty("ui-config.properties", "wordPressURL"));
        //Declare two string variables for username and password. Use configuration file for credentials
        String userName = ConfigurationReader.getProperty("ui-config.properties", "wordPress.username");
        String password = ConfigurationReader.getProperty("ui-config.properties", "wordPress.password");
        //Enter username
        wordPress.userName.sendKeys(userName);
        wordPress.continueButton.click();
        //Create wait for password field'
        wait.until(ExpectedConditions.visibilityOf(wordPress.password));
        //Enter password
        wordPress.password.sendKeys(password);
        //Click on login button
        wordPress.loginButton.click();




    }

}
