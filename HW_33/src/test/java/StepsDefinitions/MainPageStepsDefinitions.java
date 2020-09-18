package StepsDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.MainPageSteps;

public class MainPageStepsDefinitions {

    @Steps
    MainPageSteps mainPageSteps;

    @Given("^I access main page \"([^\"]*)\"$")
    public void i_access_main_page(String arg1) {

    }

    @When("^I click on the login button on page$")
    public void i_click_on_the_login_button_on_page() {

    }

    @When("^I enter a valid username \"([^\"]*)\"$")
    public void i_enter_a_valid_username(String arg1) {

    }

    @When("^I enter a valid password \"([^\"]*)\"$")
    public void i_enter_a_valid_password(String arg1) {

    }

    @When("^I click on the log in button$")
    public void i_click_on_the_log_in_button() {

    }

    @Then("^I should be successfully logged in \"([^\"]*)\"$")
    public void i_should_be_successfully_logged_in(String arg1) {

    }

    @When("^I click Search field$")
    public void i_click_Search_field() {

    }

    @When("^I enter \"([^\"]*)\" in the Search field$")
    public void i_enter_in_the_Search_field(String arg1) {

    }

    @When("^I click search button$")
    public void i_click_search_button() {

    }

    @When("^I click on necessary music artist in the list$")
    public void i_click_on_necessary_music_artist_in_the_list() {

    }

    @When("^I chose necessary song in list$")
    public void i_chose_necessary_song_in_list() {

    }

    @When("^I click on play button$")
    public void i_click_on_play_button() {

    }

    @Then("^I should be able to hear a favorite song$")
    public void i_should_be_able_to_hear_a_favorite_song() {

    }

}
