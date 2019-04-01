package cucumberWebTest.frontend.pageObjects;
import cucumberWebTest.frontend.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "login_user")
    private WebElement txtUsername;

    @FindBy(id = "login_pass")
    private WebElement txtPassword;

    @FindBy(name = "submit")
    private WebElement btnLogin;

    @FindBy(linkText = "Нова регистрация")
    private WebElement linkRegister;

    public WebElement getLinkRegister() {
        return linkRegister;
    }

    public WebElement getTxtUsername() {
        return txtUsername;
    }

    public WebElement getTxtPassword() {
        return txtPassword;
    }

    public WebElement getBtnLogin() {
        return btnLogin;
    }
}
