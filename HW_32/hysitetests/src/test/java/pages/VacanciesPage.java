package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/career/vacancies/")
public class VacanciesPage extends HysBasePageObject {
    @FindBy(xpath = "//div[@class='vacancies-list']/div/div[1]//span/span[1]")
    public WebElement firsVacancyInList;

    @FindBy(id = "full_name")
    public WebElement nameField;

    @FindBy(id = "email")
    public WebElement emailField;

    @FindBy(id = "phone")
    public WebElement phoneField;

    @FindBy(xpath = "//div[@class='form-group checkbox-wrap']")
    public WebElement checkBox;

    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='form-message success-message']")
    public WebElement succeedMessage;

    @FindBy(xpath = "//*[@id=\"file\"]")
    public WebElement uploadCV;

//    @FindBy(id = "file")
//    public WebElement uploadCV;

//    @FindBy(css = "#file")
//    public WebElement uploadCV;

}
