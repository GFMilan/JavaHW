package StepsDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import Steps.MainPageSteps;


public class MainPageStepsDefinitions {

    @Steps
    MainPageSteps mainPageSteps;

    @Given("^I access main page music\\.i\\.ua$")
    public void i_access_main_page_music_i_ua() {
        mainPageSteps.openMainPage();

    }

    @When("^I click on the login button on page$")
    public void i_click_on_the_login_button_on_page() { mainPageSteps.clickOnLoginButton();

    }

    @When("^I enter a valid username \"([^\"]*)\"$")
    public void i_enter_a_valid_username(String username) { mainPageSteps.enterUserName(username);

    }

    @When("^I enter a valid password \"([^\"]*)\"$")
    public void i_enter_a_valid_password(String password) { mainPageSteps.enterPassword(password);

    }

    @When("^I click on the log in button$")
    public void i_click_on_the_log_in_button() { mainPageSteps.clickSubmitButton();

    }

    @Then("^I should be successfully logged in$")
    public void i_should_be_successfully_logged_in() {mainPageSteps.verifyUserName();

    }

    @When("^I enter \"([^\"]*)\" in the Search field$")
    public void i_enter_in_the_Search_field(String songname) { mainPageSteps.enterSongName(songname);

    }

    @When("^I click search button$")
    public void i_click_search_button() {mainPageSteps.clickSearchButton();

    }


    @Then("^I click on play button in necessary song row$")
    public void i_click_on_play_button_in_necessary_song_row() throws Throwable {mainPageSteps.clickPlayButton();

    }


}
