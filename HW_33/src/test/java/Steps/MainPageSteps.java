package Steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import Pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class MainPageSteps {

    MainPage mainPage;
    @Step
    public void openMainPage(){
        mainPage.open();
    }

    @Step
    public void clickOnLoginButton(){
        mainPage.loginButton.click();
  }

    @Step
    public void enterUserName(String uname){
        mainPage.inputUserName.sendKeys(uname);
    }

    @Step
    public void enterPassword(String upass){
        mainPage.inputPassword.sendKeys(upass);
    }

    @Step
    public void clickSubmitButton(){
        mainPage.submitButton.click();
    }

    @Step
    public void verifyUserName(){
        Assert.assertEquals(true,  mainPage.uNameField.isDisplayed());;
    }

    @Step
    public void enterSongName(String sname){
        mainPage.searchField.sendKeys(sname);
    }

    @Step
    public void clickSearchButton(){
        mainPage.searchButton.click();
    }

    @Step
    public void clickPlayButton() throws InterruptedException {
        mainPage.playButton.click();
        Thread.sleep(15000);
    }
}
