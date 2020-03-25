import org.openqa.selenium.WebDriver;
import page.Home;
import page.about.Leadership;

public class Yieldmo {
    private WebDriver driver;

    public Yieldmo(WebDriver driver) {
        this.driver = driver;
    }

    public Home homePage() {
        return new Home(driver);
    }

    public Leadership leadershipPage(){
        return new Leadership(driver);
    }
}
