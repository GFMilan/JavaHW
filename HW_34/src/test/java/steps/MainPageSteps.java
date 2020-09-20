package steps;

import javafx.scene.control.Alert;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class MainPageSteps {

    MainPage mainPage;
    @Step
    public void openMainPage(){mainPage.open();}

    @Step
    public void clickAdvancedSearchButton(){mainPage.advancedSearchButton.click();}

    @Step
    public void clickOnUsedCarsButton(){
        JavascriptExecutor jse = (JavascriptExecutor)getDriver();
        jse.executeScript("arguments[0].click()", mainPage.usedCarsButton);
         }

    @Step
    public void checkSearchPage(){
        Assert.assertEquals(true,  mainPage.advancedSearchPage.isDisplayed());}

    @Step
    public void markParametersAuto()  {
        JavascriptExecutor jse = (JavascriptExecutor)getDriver();
        jse.executeScript("arguments[0].click()", mainPage.bodyTypeCheckBox);

        jse.executeScript("arguments[0].click()", mainPage.brandSearchList);
        jse.executeScript("arguments[0].click()", mainPage.brandListSelect);

        jse.executeScript("arguments[0].click()", mainPage.modelSearchList);
        jse.executeScript("arguments[0].click()", mainPage.modelListSelect);

        mainPage.yearFromSearchList.click();
        mainPage.yearFromListSelect.click();

        mainPage.yearToSearchList.click();
        mainPage.yearToListSelect.click();

        mainPage.priceFromImput.sendKeys("15000");
        mainPage.priceToImput.sendKeys("30000");

        jse.executeScript("arguments[0].click()", mainPage.regionCheckBox);

        jse.executeScript("arguments[0].click()", mainPage.petrolCheckBox);
        jse.executeScript("arguments[0].click()", mainPage.hybridCheckBox);
        jse.executeScript("arguments[0].click()", mainPage.frontwdCheckBox);

        jse.executeScript("arguments[0].click()", mainPage.volumeImput);
        mainPage.volumeImput.sendKeys("2.0");
        jse.executeScript("arguments[0].click()", mainPage.mileageImput);
        mainPage.mileageImput.sendKeys("20");

        jse.executeScript("arguments[0].click()", mainPage.sortYearCheckBox);
    }

    @Step
    public void clickShowButton(){mainPage.showButton.click();}

    @Step
    public void checkResultPage(){
        Assert.assertEquals(true,  mainPage.showSearchList.isDisplayed());
    }

    @Step
    public void clickOnFirstCar() {
        JavascriptExecutor jse = (JavascriptExecutor)getDriver();
        jse.executeScript("arguments[0].click()", mainPage.showCarButton);
//        mainPage.showCarButton.click();
    }

    @Step
    public void checkCarPage(){
        Assert.assertEquals(true,  mainPage.showCarPage.isDisplayed());
    }
}
