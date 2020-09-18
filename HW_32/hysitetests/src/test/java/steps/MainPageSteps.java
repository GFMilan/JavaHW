package steps;

import data.RandomDataGenerator;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pages.MainPage;
import pages.MainPageReferencePopUp;

public class MainPageSteps {
    MainPage mainPage;
    MainPageReferencePopUp mainPageReferencePopUp;
    @Step
    public void openMainPage(){
        mainPage.open();
    }

    @Step
    public void scrollDownToAskReferenceButton(){
        mainPage.scrollToReferenceButton();
    }

    @Step
    public void clickOnReferenceButton(){
        mainPage.askForReferenceButton.click();
    }

    @Step
    public void verifyThatModelFormIsDisplayed(){
        Assert.assertTrue(mainPageReferencePopUp.referenceFormNameTextField.isDisplayed());
    }

    @Step
    public void enterRandomReferenceFormName(){
        mainPageReferencePopUp.referenceFormEmaileTextField
                .sendKeys(RandomDataGenerator.getRandomEmail("gregbtfdsnbgf","gmail.com"));
    }

    @Step
    public void enterRandomReferenceFormEmail(){
        mainPageReferencePopUp.referenceFormNameTextField
                .sendKeys(RandomDataGenerator.getRandomName());
    }

    @Step
    public void clickOnTermsAndAgreementsCheckbox(){
        mainPageReferencePopUp.termsAndAgreementsCheckBox.click();
        //mainPageReferencePopUp.termsAndAgreementsCheckBox.submit();
        //mainPageReferencePopUp.scrollDownToreferenceFormSubmitButton();
    }

    @Step
    public void clickOnReferenceFormSubmitButton(){
        mainPageReferencePopUp.scrollDownToReferenceFormSubmitButton();
        mainPageReferencePopUp.referenceFormSubmitButton.submit();
    }



    public void checkThatThanksMessageIsDisplayedOnReferenceForm(){
        Assert.assertTrue(mainPageReferencePopUp.referenceFormModalDialogThanksMessage.isDisplayed());
    }

    public void scrollToLetsNetworkBlock(){
        mainPage.scrollToLetsNetworkBlock();
    }

    public void clickOnSeeMoreEvents(){
        mainPage.clickOnSeeMoreEvents();
    }
}
