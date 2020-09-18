package steps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HysBasePageObject;
import pages.MainPage;

public class SeeMoreReferencesSteps extends HysBasePageObject {
    @Managed
    WebDriver driver;

    MainPage seeMoreReferences;


    @Step
    public void openMainPage() {
        seeMoreReferences.open();
    }

    @Step
    public void scrollToSeeMoreReferencesbutton() {
        seeMoreReferences.scrollDown("100");

    }

    @Step
    public void clickOnSeeMoreReferencesbutton() {
        clickInVis(seeMoreReferences.seeMoreReferencesbutton);
//         seeMoreReferences.seeMoreReferencesbutton.click();
    }


    @Then("^User should be redirected$")
    public void user_should_be_redirected(String refURL) throws Throwable {
        Thread.sleep(5000);
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, refURL);
    }
}
