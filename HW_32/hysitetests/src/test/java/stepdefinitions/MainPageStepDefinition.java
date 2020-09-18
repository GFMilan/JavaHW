package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.MainPageSteps;

public class MainPageStepDefinition {

    @Steps
    MainPageSteps mainPageSteps;

    @Given("^I access main page Hys Site$")
    public void iAccessMainPageHysSite() {
        mainPageSteps.openMainPage();
    }


    @And("^I Scroll down to see Ask for reference button$")
    public void iScrollDownToSeeAskForReferenceButton() {
        mainPageSteps.scrollDownToAskReferenceButton();
    }
    
    @When("^I click on ‘Ask for reference’ button$")
    public void iClickOnAskForReferenceButton() {
        mainPageSteps.clickOnReferenceButton();
    }

    @Then("^reference form is opened$")
    public void referenceFormIsOpened() {
        mainPageSteps.verifyThatModelFormIsDisplayed();
    }

    @And("^I fill in all the required fields  and check-boxes in  a reference form with valid data$")
    public void iFillInAllTheRequiredFieldsAndCheckBoxesInAReferenceFormWithValidData() {
        mainPageSteps.enterRandomReferenceFormName();
        mainPageSteps.enterRandomReferenceFormEmail();
        mainPageSteps.clickOnTermsAndAgreementsCheckbox();
    }

    @When("^I click ‘Submit’ button$")
    public void iClickSubmitButton() {
        mainPageSteps.clickOnReferenceFormSubmitButton();
    }

    @Then("^‘Thanks for your request’ pop-up is displayed, request is sent$")
    public void thanksForYourRequestPopUpIsDisplayedRequestIsSent() {
        mainPageSteps.checkThatThanksMessageIsDisplayedOnReferenceForm();
    }

    @And("^I Scroll down to see ‘Let’s network’ block$")
    public void iScrollDownToSeeLetSNetworkBlock() {
        mainPageSteps.scrollToLetsNetworkBlock();
    }

    @When("^I click on ‘See more events’ button$")
    public void iClickOnSeeMoreEventsButton() {
        mainPageSteps.clickOnSeeMoreEvents();
    }

    @Then("^page \"([^\"]*)\" is opened$")
    public void pageIsOpened(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
