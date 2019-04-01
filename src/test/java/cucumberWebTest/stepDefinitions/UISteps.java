package cucumberWebTest.stepDefinitions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.af.En;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberWebTest.Hooks;
import cucumberWebTest.config.SpringConfig;
import cucumberWebTest.frontend.pageObjects.HomePage;
import cucumberWebTest.frontend.pageObjects.NewRegistrationPage;
import cucumberWebTest.frontend.pageObjects.UserProfilePage;
import org.openqa.selenium.WebDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.concurrent.TimeUnit;


@SpringBootTest(classes = SpringBootTest.class)
@ContextConfiguration(classes = SpringConfig.class)
public class UISteps {

    private static HomePage homePage;
    private static NewRegistrationPage newRegistrationPage;
    private static UserProfilePage userProfilePage;
    private static WebDriver driver;
    private static Hooks hooks = new Hooks();


    @Before
    public void before(Scenario scenario){
        System.out.println("\n-------------------------------");
        System.out.println("Staring - " + scenario.getName());
        System.out.println("-------------------------------\n");
    }

    @Given("^User navigates to Home Page using (.*?)$")
    public void User_is_on_Home_Page(String browser) throws Exception {
        driver = Hooks.getDriver(browser);
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        homePage = new HomePage(driver);
        userProfilePage = new UserProfilePage(driver);

        driver.get("https://www.epay.bg");
    }

//    Given("^User navigates to Home Page using (.*?)$", (String browser) -> {
//
//        driver = Hooks.getDriver(browser);
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        homePage = new HomePage(driver);
//        userProfilePage = new UserProfilePage(driver);
//
//        driver.get("https://www.epay.bg");
//
//        });

    @When("^User enters UserName$")
    public void User_enters_UserName() throws Throwable {

        homePage.getTxtUsername().sendKeys("comsworld");
        //driver.findElement(By.id("login_user")).sendKeys("comsworld");
    }

    @And("^User enters Password$")
    public void User_enters_Password() throws Throwable {

        homePage.getTxtPassword().sendKeys("Yoana2007");
        //driver.findElement(By.id("login_pass")).sendKeys("Yoana2007");

        homePage.getBtnLogin().click();
        //driver.findElement(By.name("submit")).click();
    }

    @Then("^Message displayed Login Successfully$")
    public void Message_displayed_Login_Successfully() throws Throwable {
        System.out.println("Login Successful\n");
    }

    @Given("^User is logged in$")
    public void User_is_logged_in() throws Throwable {
        //driver.getTitle();
    }

    @When("^User LogOut from the Application$")
    public void User_LogOut_from_the_Application() throws Throwable {
       // hooks.getWait(driver).until(ExpectedConditions.visibilityOf(userProfilePage.getBtnLogout()));
        //userProfilePage.getLnkAddCard().click();
        userProfilePage.getBtnLogout().click();
        //driver.findElement(By.id("hidden-exit")).click();
    }

    @Then("^Message displayed LogOut Successfully$")
    public void Message_displayed_LogOut_Successfully() throws Throwable {
        System.out.println("LogOut Successful\n");
        driver.close();
    }


    @When("^User clicks on new registration link$")
    public void User_clicks_on_new_registration_link(){
        //homePage = new HomePage(driver);
        homePage.getLinkRegister().click();
    }

    @And("^User is taken to New Registration page$")
    public void User_is_taken_to_New_Registration_page(){
        newRegistrationPage = new NewRegistrationPage(driver);

        newRegistrationPage.getBoxName().sendKeys("name");
    }


    //    Given("^The user is on the new registration page$", () -> {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    });
//
//    When("^User enters Name$", () -> {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    });
//
//    When("^User selects nationality from dropdown$", () -> {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    });
//
//    When("^User enters Personal ID Number$", () -> {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    });
//
//    When("^User enters User Name$", () -> {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    });
//
//    When("^User enters email$", () -> {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    });
//
//    When("^User enters new password$", () -> {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    });
//
//    When("^User confirms password$", () -> {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    });
//
//    When("^User check Terms and Conditions box$", () -> {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    });
//
//    When("^User checks the privacy policy box$", () -> {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    });
//
//    When("^User click on cancel button$", () -> {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    });
//
//    Then("^User is taken to home page$", () -> {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    });



    @After
    public void after(Scenario scenario){
        System.out.println("\n-------------------------------");
        System.out.println(scenario.getName() + " Status - " + scenario.getStatus());
        System.out.println("-------------------------------\n");
    }

}
