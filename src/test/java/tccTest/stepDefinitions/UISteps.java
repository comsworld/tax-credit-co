package tccTest.stepDefinitions;
import cucumber.api.java8.En;
import org.testng.asserts.SoftAssert;
import tccTest.Hooks;
import tccTest.pageObjects.HomePage;
import tccTest.pageObjects.ContactPage;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertEquals;

public class UISteps implements En {

    private static HomePage homePage;
    private static ContactPage contactPage;
    private static WebDriver driver;
    private Hooks hooks = new Hooks();

    public UISteps() {
        SoftAssert softAssert = new SoftAssert();

        Given("^User navigates to Home Page using (.*?)$", (String browser) -> {
            driver = hooks.getDriver(browser);
            contactPage = new ContactPage(driver);
            homePage = new HomePage(driver);
        });
        When("^User clicks on Contact button$", () -> {
            homePage.getBtnContact().click();
        });

        Then("^User is taken to Contact page$", () -> {
            assertEquals(driver.getCurrentUrl(), ("https://taxcreditco.com/contact/"));
            softAssert.assertTrue(driver.getTitle().contains("Contact TCC | TCC"));

        });

        When("^User enters name (.*?)$", (String name) -> {
            contactPage.getTxtName().sendKeys(name);

        });

        And("^User enters title (.*?)$", (String title) -> {
            contactPage.getTxtTitle().sendKeys(title);
        });

        And("^User enters email (.*?)$", (String email) -> {
            contactPage.getTxtEmail().sendKeys(email);
        });

        And("^User enters phone (.*?)$", (String phone) -> {
            contactPage.getTxtPhone().sendKeys(phone);
        });

        And("^User enters company name (.*?)$", (String company) -> {
            contactPage.getTxtCompany().sendKeys(company);
        });

        And("^User enters company size (.*?)$", (String size) -> {
            contactPage.getTxtCompanySize().sendKeys(size);
        });

        And("^User enters state (.*?)$", (String state) -> {
            contactPage.getTxtState().sendKeys(state);
        });

        And("^User enters industry (.*?)$", (String industry) -> {
            contactPage.getTxtIndustry().sendKeys(industry);
        });

        And("^User enters additional info (.*?)$", (String message) -> {
            contactPage.getTxtMessage().sendKeys(message);
        });

        When("^User click on Submit button$", () -> {
            contactPage.getBtnSubmit().click();
        });

        Then("^Message displayed (.*?)$", (String text) -> {
            softAssert.assertEquals(contactPage.getMessage().getText(), text);
            driver.close();
            softAssert.assertAll();
        });

    }

}
