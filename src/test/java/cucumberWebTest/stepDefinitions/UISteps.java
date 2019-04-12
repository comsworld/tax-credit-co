package cucumberWebTest.stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java8.En;
import cucumberWebTest.Hooks;
import cucumberWebTest.config.SpringConfig;
import cucumberWebTest.frontend.pageObjects.HomePage;
import cucumberWebTest.frontend.pageObjects.NewRegistrationPage;
import cucumberWebTest.frontend.pageObjects.UserProfilePage;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import sun.security.util.PendingException;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


@SpringBootTest(classes = SpringBootTest.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UISteps implements En {

    private static HomePage homePage;
    private static NewRegistrationPage newRegistrationPage;
    private static UserProfilePage userProfilePage;
    private static WebDriver driver;
    private static Hooks hooks = new Hooks();

    //    @Before
//    public void before(Scenario scenario) {
//        System.out.println("\n-------------------------------");
//        System.out.println("Staring - " + scenario.getName());
//        System.out.println("-------------------------------\n");
//    }
    public UISteps() {

        Given("^User navigates to Home Page using (.*?)$", (String browser) -> {
            driver = Hooks.getDriver(browser);
            newRegistrationPage = new NewRegistrationPage(driver);
            homePage = new HomePage(driver);
            userProfilePage = new UserProfilePage(driver);


            driver.get("https://www.epay.bg");
        });

        When("^User enters UserName$", () -> {

            homePage.getTxtUsername().sendKeys("comsworld");
            //driver.findElement(By.id("login_user")).sendKeys("comsworld");
        });

        And("^User enters Password$", () -> {

            homePage.getTxtPassword().sendKeys("Yoana2007");
            //driver.findElement(By.id("login_pass")).sendKeys("Yoana2007");

            homePage.getBtnLogin().click();
            //driver.findElement(By.name("submit")).click();
        });

        Then("^Validate username (.*?) is displayed$", (String name) -> {
            assertEquals(userProfilePage.getUsernameDisplayed().getText(),name);
        });

        Given("^User is logged in as (.*?)$", (String name) -> {
            assertEquals(userProfilePage.getUsernameDisplayed().getText(),name);

        });

        When("^User LogOut from the Application$", () -> {
            userProfilePage.getBtnLogout().click();
        });

        Then("^Message displayed LogOut Successfully$", () -> {
            System.out.println("LogOut Successful\n");
            driver.close();
        });


//    @After
//    public void after(Scenario scenario) {
//        System.out.println("\n-------------------------------");
//        System.out.println(scenario.getName() + " Status - " + scenario.getStatus());
//        System.out.println("-------------------------------\n");
//    }


        When("^User clicks on new registration link$", () -> {
            homePage.getLinkRegister().click();
        });

        Then("^User is taken to New Registration page$", () -> {
            assertEquals(driver.getCurrentUrl(), ("https://www.epay.bg/v3main/registration"));
        });

        And("^The user is on the new registration page$", () -> {
            assertTrue(driver.getTitle().contains("Регистрация"));
        });

        And("^User enters Name$", () -> {
            newRegistrationPage.getBoxName().sendKeys("Rumple Stilskin");

        });

        And("^User selects (.*?) nationality from dropdown$", (String country) -> {
            Select drpCountry = new Select(newRegistrationPage.getDropBoxNationality());
            drpCountry.selectByVisibleText(country);
        });

        And("^User enters Personal ID Number (.*?)$", (String egnNumber) -> {
            newRegistrationPage.getBoxEGN().sendKeys(egnNumber);
        });

        When("^User enters User Name (.*?)$", (String username) -> {
            newRegistrationPage.getBoxUsername().sendKeys(username);
        });

        When("^User enters email (.*?)$", (String email) -> {
            newRegistrationPage.getBoxEmail().sendKeys(email);
        });

        When("^User enters new password (.*?)$", (String passwordOne) -> {
            newRegistrationPage.getBoxPassword().sendKeys(passwordOne);
        });

        When("^User confirms password (.*?)$", (String passwordTwo) -> {
            newRegistrationPage.getBoxPassword2().sendKeys(passwordTwo);
        });

        When("^User check Terms and Conditions box$", () -> {
            newRegistrationPage.getChkBoxTerms().click();
            assertTrue(newRegistrationPage.getChkBoxTerms().isSelected());
        });

        When("^User checks the privacy policy box$", () -> {
            newRegistrationPage.getChkBoxPersonalData().click();
            assertTrue(newRegistrationPage.getChkBoxPersonalData().isSelected());
        });

        When("^User click on cancel button$", () -> {
            newRegistrationPage.getBtnCancel().click();
        });

        Then("^User is taken to home page$", () -> {
            assertEquals(driver.getTitle(), "ePay.bg");
            driver.close();
        });

    }

}
