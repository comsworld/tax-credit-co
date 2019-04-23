package tccTest.pageObjects;
import tccTest.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"menu-item-369\"]/div/a")
    private WebElement btnContact;

    public WebElement getBtnContact() {
        return btnContact;
    }
}
