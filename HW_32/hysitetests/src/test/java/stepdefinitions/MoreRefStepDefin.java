package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.MainPageSteps;
import steps.SeeMoreReferencesSteps;

public class MoreRefStepDefin {

    @Steps
    SeeMoreReferencesSteps seeMoreRefSteps;

    @Given("^I access  https://www\\.hys-enterprise\\.com/$")
    public void i_access_https_www_hys_enterprise_com() {
       seeMoreRefSteps.openMainPage();
    }

    @Given("^I Scroll down to see ‘See more references’ button\\.$")
    public void i_Scroll_down_to_see_See_more_references_button() {
        seeMoreRefSteps.scrollToSeeMoreReferencesbutton();

    }

    @When("^I click on ‘See more references’ button\\.$")
    public void i_click_on_See_more_references_button() {
        seeMoreRefSteps.clickOnSeeMoreReferencesbutton();

    }

    @Then("^page  \"([^\"]*)\" is opened$")
    public void refPageIsOpened(String arg1) throws Throwable {
        seeMoreRefSteps.user_should_be_redirected(arg1);

    }

}
