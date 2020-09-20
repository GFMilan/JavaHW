package stepsDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.MainPageSteps;

public class MainPageStepDefinitions {

    @Steps
    MainPageSteps mainPageSteps;

    @Given("^I access main page auto\\.ria\\.com$")
    public void i_access_main_page_auto_ria_com() {mainPageSteps.openMainPage();}

    @When("^I click advanced search button$")
    public void i_click_advanced_search_button() {mainPageSteps.clickAdvancedSearchButton();}

    @When("^I click on the used cars button on page$")
    public void i_click_on_the_used_cars_button_on_page() {mainPageSteps.clickOnUsedCarsButton();}

    @When("^I check that search page is opened$")
    public void i_check_that_search_page_is_opened() {mainPageSteps.checkSearchPage();}

    @When("^I mark twenty parameters for choosing a car$")
    public void i_mark_twenty_parameters_for_choosing_a_car() {mainPageSteps.markParametersAuto();}

    @When("^I click show button$")
    public void i_click_show_button() {mainPageSteps.clickShowButton();}

    @When("^I check that page of search result is opened$")
    public void i_check_that_page_of_search_is_result_opened() {mainPageSteps.checkResultPage();}

    @Then("^I click on first car in list$")
    public void i_click_on_first_car_in_list() throws Throwable {mainPageSteps.clickOnFirstCar();}

    @Then("^I chek that car page is opened$")
    public void i_check_that_car_page_is_result_opened() {mainPageSteps.checkCarPage();}

}
