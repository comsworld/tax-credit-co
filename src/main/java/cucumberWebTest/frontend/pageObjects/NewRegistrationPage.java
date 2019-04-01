package cucumberWebTest.frontend.pageObjects;
import cucumberWebTest.frontend.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewRegistrationPage extends BasePage {

    public NewRegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "REAL_NAME")
    private WebElement boxName;

    @FindBy(name="CITIZENSHIP")
    private WebElement dropBoxNationality;

    @FindBy(name = "EGN")
    private WebElement boxEGN;

    @FindBy(name = "NAME")
    private WebElement boxUsername;

    @FindBy(name = "EMAIL")
    private WebElement boxEmail;

    @FindBy(name = "PASS")
    private WebElement boxPassword;

    @FindBy(name = "PASS2")
    private WebElement boxPassword2;

    @FindBy(name = "TERM")
    private WebElement chkBoxTerms;

    @FindBy(name = "PERSONAL_DATA")
    private WebElement chkBoxPersonalData;

    @FindBy(linkText = "https://www.epay.bg/v3main/")
    private WebElement btnCancel;

    public WebElement getBoxName() {
        return boxName;
    }

    public WebElement getDropBoxNationality() {
        return dropBoxNationality;
    }

    public WebElement getBoxEGN() {
        return boxEGN;
    }

    public WebElement getBoxUsername() {
        return boxUsername;
    }

    public WebElement getBoxEmail() {
        return boxEmail;
    }

    public WebElement getBoxPassword() {
        return boxPassword;
    }

    public WebElement getBoxPassword2() {
        return boxPassword2;
    }

    public WebElement getChkBoxTerms() {
        return chkBoxTerms;
    }

    public WebElement getChkBoxPersonalData() {
        return chkBoxPersonalData;
    }

    public WebElement getBtnCancel() {
        return btnCancel;
    }
}
