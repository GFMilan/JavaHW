package Pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends PageObject {



    @Managed WebDriver driver;

    @FindBy(css = "ul.ho_menu:nth-child(4) > li:nth-child(1) > a:nth-child(1)")
    public WebElement loginButton;

    @FindBy(name = "login")
    public WebElement inputUserName;

    @FindBy(name = "pass")
    public WebElement inputPassword;

    @FindBy(css = "div.form:nth-child(3) > form:nth-child(1) > input:nth-child(7)")
    public WebElement submitButton;

    @FindBy(css = ".user_name")
    public WebElement uNameField;

    @FindBy(css = "div.block_gamma_dark:nth-child(3) > div:nth-child(3) > span:nth-child(2) > form:nth-child(1) > input:nth-child(3)")
    public WebElement searchField;

    @FindBy(css = "div.block_gamma_dark:nth-child(3) > div:nth-child(3) > span:nth-child(2) > form:nth-child(1) > input:nth-child(8)")
    public WebElement searchButton;


    @FindBy(css = ".table_list > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(1) > a:nth-child(1) > span:nth-child(1) > i:nth-child(1)")
    public WebElement playButton;

}
