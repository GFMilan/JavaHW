package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject {

    @Managed
    WebDriver driver;

    @FindBy(id = "custom-used")
    public WebElement usedCarsButton;

    @FindBy(xpath = "//a[@class='ext-end']")
    public WebElement advancedSearchButton;

    @FindBy(xpath = "//h1[contains(text(), \"Розширений пошук вживаних авто\")]")
    public WebElement advancedSearchPage;

    @FindBy(id = "body.id[3]")
    public WebElement bodyTypeCheckBox;

    @FindBy(xpath = "//div[@id='autocomplete-brand-0']//label[@class='text']")
    public WebElement brandSearchList;

    @FindBy(xpath = "//a[contains(text(),'Toyota')]")
    public WebElement brandListSelect;

    @FindBy(xpath = "//div[@id='autocomplete-model-0']//label[@class='text']")
    public WebElement modelSearchList;

    @FindBy(xpath = "//a[contains(text(),'Avalon')]")
    public WebElement modelListSelect;

    @FindBy(id = "at_year-from")
    public WebElement yearFromSearchList;

    @FindBy(xpath = "//select[@id='at_year-from']/option[contains(text(),'2016')]")
    public WebElement yearFromListSelect;

    @FindBy(id = "at_year-to")
    public WebElement yearToSearchList;

    @FindBy(xpath = "//select[@id='at_year-to']/option[contains(text(),'2019')]")
    public WebElement yearToListSelect;

    @FindBy(id = "at_price-from")
    public WebElement priceFromImput;

    @FindBy(id = "at_price-to")
    public WebElement priceToImput;

    @FindBy(xpath = "//label[contains(text(),'Одеська')]")
    public WebElement regionCheckBox;

    @FindBy(xpath = "//label[contains(text(),'Бензин')]")
    public WebElement petrolCheckBox;

    @FindBy(xpath = "//label[contains(text(),'Гібрид')]")
    public WebElement hybridCheckBox;


    @FindBy(xpath = "//label[contains(text(),'Передній')]")
    public WebElement frontwdCheckBox;

    @FindBy(xpath = "//div[@id='volumeBlock']//input[@placeholder='Від']")
    public WebElement volumeImput;

    @FindBy(xpath = "//div[7]//div[1]//div[1]//div[1]//input[1]")
    public WebElement mileageImput;

    @FindBy(xpath = "//label[contains(text(),'Рік випуску, за спаданням')]")
    public WebElement sortYearCheckBox;

    @FindBy(xpath = "//i[@class='icon-search']")
    public WebElement showButton;

    @FindBy(id = "topFilterLinkToAdvancedSearch")
    public WebElement showSearchList;

    @FindBy(xpath = "//*[@id=\"searchResults\"]/section[1]/div[4]/div[1]/a")
    public WebElement showCarButton;

    @FindBy(xpath = "//aside[@id='showLeftBarView']//a[@id='leftBarCheckGeneral']")
    public WebElement showCarPage;

}
