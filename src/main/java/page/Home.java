package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends AbstractPage{

    /**
     * Selectors
     */
    @FindBy(xpath = "")
    private WebElement heroBanner;

    @FindBy(xpath = "")
    private WebElement heroDescription;

    public Home(WebDriver driver) {
        super(driver);
    }

    /**
     * interactions
     */

    public String getHeroBannerText(){
        return heroBanner.getText();
    }

    public String getHeroDescriptionText(){
        return heroDescription.getText().toLowerCase();
    }

}
