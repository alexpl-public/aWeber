package step_definitions;

import io.cucumber.java.en.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.WordPressPage;
import utilities_package.ConfigurationReader;
import utilities_package.Driver;
import utilities_package.SelectHelper;
public class WordPressProfile {

    //Log4J installation
    static final Logger log = LogManager.getLogger(SelectHelper.class);
    //Create instances
    WordPressPage wordPress = new WordPressPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    String link = ConfigurationReader.getProperty("ui-config.properties", "wordPress.link");


    @When("I change my first name")
    public void i_change_my_first_name() {
        wait.until(ExpectedConditions.visibilityOf(wordPress.firstName));
        String firstNAme_value = wordPress.firstName.getAttribute("value");
        //check if field is empty
        if (firstNAme_value.isEmpty()) {
            wordPress.firstName.sendKeys("Alex");
        } else {
            wordPress.firstName.clear();
            wordPress.firstName.sendKeys("Alex");
        }
        log.info("Enter First Name::::");


    }

    @Then("I change my last name")
    public void i_change_my_last_name() {
        //Create string variable with the attribute of web element
        String lastName_value = wordPress.LastName.getAttribute("value");
        //Check if field is empty. If yes - enter value, if not - clear field and enter the value
        if (lastName_value.isEmpty()) {
            wordPress.LastName.sendKeys("Plotnitsky");
        } else {
            wordPress.LastName.clear();
            wordPress.LastName.sendKeys("Plotnitsky");
        }
        log.info("Enter Last Name:::::::::");

    }

    @Then("I change public display name")
    public void i_change_public_display_name() {
        //Create string variable with the attribute of web element
        String publicName_value = wordPress.publicDisplayName.getAttribute("value");
        //Check if field is empty. If yes - enter value, if not - clear field and enter the value
        if (publicName_value.isEmpty()) {
            wordPress.publicDisplayName.sendKeys("Aleksandr Pl");
        } else {
            wordPress.publicDisplayName.clear();
            wordPress.publicDisplayName.sendKeys("Aleksandr Pl");
        }
        log.info("Enter public display name::::::::::::");


    }

    @When("I add about me section")
    public void i_add_about_me_section() {
        String aboutMe_value = wordPress.aboutMe.getAttribute("value");
        if (aboutMe_value.isEmpty()) {
            wordPress.aboutMe.sendKeys("Hello! My name is Aleksandr, friends calls me Alex. This is my profile page");
            log.info("Enter about section");
        } else {
            wordPress.aboutMe.clear();
            wordPress.aboutMe.sendKeys("Hello! My name is Aleksandr, friends calls me Alex. This is my profile page");
        }
        log.info("Enter about section::::::::::::");


    }

    @When("I press Save Profile Details button")
    public void i_press_Save_Profile_Details_button() {
        //Before click submit button create wait for visibility of element.
        wait.until(ExpectedConditions.visibilityOf(wordPress.submitButton));
        wordPress.submitButton.click();
        log.info("Press submit button:::::::");

    }

    @Then("I verify that my personal data saved successfully")
    public void i_verify_that_my_personal_data_saved_successfully() throws InterruptedException {
        String alert_text = "Settings saved successfully!";
        log.info("Verifying data saved correctly:::::::::::::");
        Assert.assertEquals(wordPress.alertText.getText(), alert_text);


    }


    @When("I press Add button on profile link section")
    public void i_press_Add_button_on_profile_link_section() {
        wait.until(ExpectedConditions.visibilityOf(wordPress.addButton));
        wordPress.addButton.click();
        log.info("Click on Add link to the profile:::::::::::::::::");

    }


    @Then("I enter URL together with description")
    public void i_enter_URL_together_with_description() {
        wait.until(ExpectedConditions.visibilityOf(wordPress.addButton));
        wordPress.addURL.click();
        wordPress.enterURL.sendKeys(link);
        wordPress.urlDescription.sendKeys("My personal page");


    }

    @Then("I press add site button")
    public void i_press_add_site_button() {
        wordPress.addSite.click();
        log.info("Add page to the profile::::::::::");

    }

    @Then("I verify url saved successfully")
    public void i_verify_url_saved_successfully() {
        Assert.assertEquals(wordPress.addedLink.getText(), link);
        log.info("Verify added URL saved successfully");


    }

    @Then("I press on hide my Gravatar profile button")
    public void iPressOnHideMyGravatarProfileButton() {
        wordPress.himeGravProfileBtn.click();
        log.info("Click on Hide My Gravatar profile button::::::");
    }
}



