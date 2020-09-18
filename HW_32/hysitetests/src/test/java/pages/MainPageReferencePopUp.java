package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPageReferencePopUp  extends HysBasePageObject {

    @FindBy(id = "full_name")
    public WebElement referenceFormNameTextField;

    @FindBy(id = "email")
    public WebElement referenceFormEmaileTextField;

    @FindBy(xpath = "//label[@for='ch1']")
    public WebElement termsAndAgreementsCheckBox;


 ////button[contains(text(),'Submit')]
    @FindBy(xpath = "//button[@id='ref-inquiry-submit-btn']")
    public WebElement referenceFormSubmitButton;

    @FindBy(xpath = "//div[contains(text(),'Sorry, your message has not been sent. Please, try')]")
    public WebElement referenceFormModalDialogThanksMessage;

    public void scrollDownToReferenceFormSubmitButton(){
        Actions builder = new Actions(getDriver());
        Action mouseOverHome = builder
                .moveToElement(referenceFormNameTextField).click().sendKeys(Keys.PAGE_DOWN)
                .build();

        mouseOverHome.perform();
        scrollDown("100");
    }
}
