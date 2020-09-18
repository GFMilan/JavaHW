package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("/career/")
public class CareerPage extends HysBasePageObject {

    @FindBy(linkText = "Join Us")
    public WebElement joinUsButton;

    @FindBy(xpath = "//*[contains(text(),\"Let's network\")]")
    public WebElement letsNetworkBlock;

    @FindBy(partialLinkText = "events")
    public WebElement seeMoreEventsButton;

}
