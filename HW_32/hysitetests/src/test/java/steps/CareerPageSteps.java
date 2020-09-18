package steps;

import net.thucydides.core.annotations.Step;
import pages.CareerPage;

public class CareerPageSteps {

    CareerPage careerPage;

    @Step
    public void openCareerPage(){
        careerPage.open();
    }

    @Step
    public void clickOnJoinUsButton(){
        careerPage.joinUsButton.click();
    }
}
