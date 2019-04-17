package cucumberWebTest.frontend.pageObjects;
import cucumberWebTest.frontend.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserProfilePage extends BasePage {
    public UserProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"hidden-exit\"]/span/a")
    private WebElement btnLogout;

    @FindBy(linkText = "https://www.epay.bg/v3main/reg/card")
    private WebElement lnkAddCard;

    @FindBy (xpath = "//*[@id=\"userdata_header\"]/div")
    private WebElement usernameDisplayed;

    public WebElement getLnkAddCard() { return lnkAddCard; }

    public WebElement getBtnLogout() {
        return btnLogout;
    }

    public WebElement getUsernameDisplayed() { return usernameDisplayed; }
}



