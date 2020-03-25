package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page.about.Leadership;

public abstract class AbstractPage {

    protected WebDriver driver;

    /**
     * common shared selectors
     */

    @FindBy(xpath = "//li[@id='menu-item-58']/a")
    private WebElement primaryAbountButton;

    @FindBy(xpath = "//li[@id='menu-item-390']")
    private WebElement aboutLeadershipButton;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /**
     * common shared interaction methods
     */

    public Home clickAboutButton(){
        primaryAbountButton.click();
        return new Home(driver);
    }

    public Leadership clickLeadershipButton(){
        aboutLeadershipButton.click();
        return new Leadership(driver);
    }

}
