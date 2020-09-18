package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.HysBasePageObject;
import pages.VacanciesPage;

import java.util.concurrent.TimeUnit;

public class VacanciesPageSteps extends HysBasePageObject {

    VacanciesPage vacanciesPage;

    @Step
    public boolean isPageOpened(){
        return vacanciesPage.getDriver().getCurrentUrl().contains("career/vacancies/");
    }

    @Step
    public void clickOnFirstVacancyInList(){
        vacanciesPage.scrollDown("100");
        vacanciesPage.firsVacancyInList.click();
    }

    @Step
    public void enterName(String name){
        vacanciesPage.nameField.sendKeys(name);
    }

    @Step
    public void enterEmail(String email){
        vacanciesPage.emailField.sendKeys(email);
    }

    @Step
    public void enterPhone(String phone){vacanciesPage.phoneField.sendKeys(phone);}

    @Step
    public void enterCV(String cv){
       WebElement uploadElement = getDriver().findElement(By.xpath("//*[@id=\"file\"]"));
       ((JavascriptExecutor) getDriver()).executeScript("arguments[0].removeAttribute('style')", uploadElement);
        uploadElement.sendKeys(cv);


    }

    @Step
    public void clickOnPrivacyPolicyCheckbox(){
        vacanciesPage.checkBox.click();
    }

    @Step
    public void clickOnSubmitButton(){

        WebElement submitElement = getDriver().findElement(By.xpath("//button[text()='Submit']"));
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].removeAttribute('disabled')", submitElement);
        submitElement.click();

    }

    @Step
    public boolean isSuccessMessageDisplayed(){

        try {
            return vacanciesPage.succeedMessage.isDisplayed();
        }
       catch (Exception e)
        {
            System.out.println("Кнопка не нажимается, сообщение ны выдается");
            return false;
        }

    }
}
