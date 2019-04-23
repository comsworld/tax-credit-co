package tccTest.pageObjects;
import tccTest.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends BasePage {

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "firstname-3a877d85-0e59-43b4-9079-9eb8b5306c04")
    private WebElement txtName;

    @FindBy(id="jobtitle-3a877d85-0e59-43b4-9079-9eb8b5306c04")
    private WebElement txtTitle;

    @FindBy(id = "email-3a877d85-0e59-43b4-9079-9eb8b5306c04")
    private WebElement txtEmail;

    @FindBy(id = "phone-3a877d85-0e59-43b4-9079-9eb8b5306c04")
    private WebElement txtPhone;

    @FindBy(id = "company-3a877d85-0e59-43b4-9079-9eb8b5306c04")
    private WebElement txtCompany;

    @FindBy(id = "company_size-3a877d85-0e59-43b4-9079-9eb8b5306c04")
    private WebElement txtCompanySize;

    @FindBy(id = "state-3a877d85-0e59-43b4-9079-9eb8b5306c04")
    private WebElement txtState;

    @FindBy(id = "industry-3a877d85-0e59-43b4-9079-9eb8b5306c04")
    private WebElement txtIndustry;

    @FindBy(id = "message-3a877d85-0e59-43b4-9079-9eb8b5306c04")
    private WebElement txtMessage;

    @FindBy(xpath = "//*[@id=\"hsForm_3a877d85-0e59-43b4-9079-9eb8b5306c04\"]/div[10]/div[2]/input")
    private WebElement btnSubmit;

    @FindBy(className = "hbspt-form")
//    @FindBy(xpath = "//*[@id=\"hbspt-form-1555985815051-3940663286\"]")
    private WebElement message;

    public WebElement getTxtName() {
        return txtName;
    }

    public WebElement getTxtTitle() {
        return txtTitle;
    }

    public WebElement getTxtEmail() {
        return txtEmail;
    }

    public WebElement getTxtPhone() {
        return txtPhone;
    }

    public WebElement getTxtCompany() {
        return txtCompany;
    }

    public WebElement getTxtCompanySize() {
        return txtCompanySize;
    }

    public WebElement getTxtState() {
        return txtState;
    }

    public WebElement getTxtIndustry() {
        return txtIndustry;
    }

    public WebElement getTxtMessage() {
        return txtMessage;
    }

    public WebElement getBtnSubmit() {
        return btnSubmit;
    }

    public WebElement getMessage() { return message; }
}
