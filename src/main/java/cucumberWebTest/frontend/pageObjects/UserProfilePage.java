package cucumberWebTest.frontend.pageObjects;
import cucumberWebTest.frontend.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserProfilePage extends BasePage {
    public UserProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "hidden-exit")
    private WebElement btnLogout;

    @FindBy(linkText = "https://www.epay.bg/v3main/reg/card")
    private WebElement lnkAddCard;

    public WebElement getLnkAddCard() { return lnkAddCard; }

    public WebElement getBtnLogout() {
        return btnLogout;
    }
}



