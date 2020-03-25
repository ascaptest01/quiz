package page.about;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.AbstractPage;

public class Leadership extends AbstractPage {

    /**
     * Selectors/webelements
     * - please use the @findby annotation
     * - any lookup strategy can be used here
     */

    @FindBy(xpath = "//div[@class='subpage-header-content-inner']/h1")
    private WebElement subPageHeader;


    public Leadership(WebDriver driver) {
        super(driver);
    }

    /**
     * Interactions
     */

    public boolean isOnLeadershipPage(){
        return subPageHeader.isDisplayed();
    }




}
