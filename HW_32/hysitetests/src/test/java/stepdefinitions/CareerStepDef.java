package stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import steps.CareerPageSteps;
import steps.VacanciesPageSteps;

import java.sql.SQLOutput;

public class CareerStepDef {


    @Steps
    CareerPageSteps careerPageSteps;

    @Steps
    VacanciesPageSteps vacanciesPageSteps;

    @Given("^I go \"([^\"]*)\"$")
    public void iGo(String arg0) throws Throwable {
        careerPageSteps.openCareerPage();
    }

    @When("^I click on ‘Join Us’ button$")
    public void iClickOnJoinUsButton() {
        careerPageSteps.clickOnJoinUsButton();
    }

    @And("^I click on any available vacancy in the list$")
    public void iClickOnAnyAvailableVacancyInTheList() {
        vacanciesPageSteps.clickOnFirstVacancyInList();
    }

    @And("^I fill CV form with valid data$")
    public void iFillCVFormWithValidData() {
        vacanciesPageSteps.enterEmail("test@test.com");
        vacanciesPageSteps.enterName("Vladimir");
        vacanciesPageSteps.enterPhone("0971413967");
        vacanciesPageSteps.clickOnPrivacyPolicyCheckbox();    }

    @And("^I click on Drag&Drop button an attach CV file$")
    public void iClickOnDragDropButtonAnAttachCVFile() {
        String path=(System.getProperty("user.dir")+"\\cv.txt");
        vacanciesPageSteps.enterCV(path);
            }

    @When("^I click on Send button$")
    public void iClickOnSendButton() {

        vacanciesPageSteps.clickOnSubmitButton();

    }

    @Then("^message \"([^\"]*)\" is displsyed$")
    public void messageIsDisplsyed(String arg0) throws Throwable {
        Assert.assertFalse(vacanciesPageSteps.isSuccessMessageDisplayed());

    }


    @Then("^career page \"([^\"]*)\" is opened$")
    public void careerPageIsOpened(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(vacanciesPageSteps.isPageOpened());
    }
}
