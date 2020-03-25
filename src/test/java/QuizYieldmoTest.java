import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import page.Home;
import page.about.Leadership;
import utils.DriverFactory;
import utils.SelServer;

public class QuizYieldmoTest {

    private SelServer server;
    private WebDriver driver;
    private Yieldmo app;
    private String EXPECTED = "Expected to find %s | ";

    /**
     * - Starts up the selenium server pragmatically
     * - driver is built and set
     * - loads the page factory for initial screen validation
     */
    @BeforeSuite
    public void setup(){
        // start/set the server
        server = new SelServer();
        server.startSelServer();
        Assert.assertTrue(server.isServerUp());

        // set the driver and load page of test
        driver = DriverFactory.build();
        driver.get("https://www.yieldmo.com");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[@class='navbar-header']/a/img[@class='navbar-brand']")
                )
        );
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.yieldmo.com/"));

        // set the application to play (for easy loading of page instance)
        app = new Yieldmo(driver);
    }

    /**
     * quits the driver
     * kills the selenium server
     */
    @AfterSuite
    public void teardown(){
        driver.quit();
        server.stopSelServer();
    }

    /**
     * TODO (task for quiz taker!)
     * - find out why this is failing and fix it to make it work
     *
     * Hint:
     * - hero banner can be found on the home page as soon as the page loads in
     */
    @Test(description = "Selenium rodeo question 1 - home page hero banner text validation")
    @Parameters({"heroBanner"})
    public void testSeleniumRodeoOne(String heroBannerText){
        SoftAssert sa = new SoftAssert();

        Home home = app.homePage();

        sa.assertEquals(
            heroBannerText,
            home.getHeroBannerText(),
            String.format(EXPECTED, heroBannerText)
        );

        sa.assertAll();
    }

    /**
     * TODO (task for quiz taker!)
     * - find out why this is failing and fix it to make it work
     *
     * Hint:
     * - hero description can be found on the home page as soon as the page loads in
     */
    @Test(description = "Selenium rodeo question 2 - home page hero description text validation")
    @Parameters({"heroDescription"})
    public void testSeleniumRodeoTwo(String heroDescriptionText){
        SoftAssert sa = new SoftAssert();

        Home home = app.homePage();

        sa.assertEquals(
            heroDescriptionText,
            home.getHeroDescriptionText(),
            String.format(EXPECTED, heroDescriptionText)
        );

        sa.assertAll();
    }

    /**
     * TODO (task for the quiz taker!)
     * - write a test that validates the CEO's name ignoring all case sensitivity
     * - the test MUST use the string passed as an argument in the test method
     *
     * Hint:
     * - the ceo's name is found in the leadership page
     */
    @Test(description = "CEO name will match")
    @Parameters({"ceoName"})
    public void testCEONameMatch(String ceoName){
        SoftAssert sa = new SoftAssert();

        Home home = app.homePage();

        sa.assertAll();
    }

    /**
     * TODO (task for the quiz taker!)
     * - write a test that validates the CTO's name ignoring all case sensitivity
     * - the test MUST use the string passed as an argument in the test method
     *
     * Hint:
     * - the cto's name is found in the leadership page
     */
    @Test(description = "CTO name will match")
    @Parameters({"ctoName"})
    public void testCTONameMatch(String ctoName){
        SoftAssert sa = new SoftAssert();

        Home home = app.homePage();

        sa.assertAll();
    }

    /**
     * TODO (task for the quiz taker!)
     * - write a test that validates the CTO's team member image is visible on the page
     *
     * Hint:
     * - the cto's profile pic is found in the leadership page
     */
    @Test(description = "CTO image is visible on the page")
    public void testCTOImageVisible(){
        SoftAssert sa = new SoftAssert();

        Home home = app.homePage();

        sa.assertAll();
    }

    /**
     * TODO (task for the quiz taker!)
     * - write a test that validates the name of the first 4 board members
     * - the test MUST use the strings passed as an argument in the test method
     *
     * Hint:
     * - the board member names can be found if you scroll down the leadership page
     */
    @Test(description = "First 4 board members are matched")
    @Parameters({"boardNameOne","boardNameTwo","boardNameThree","boardNameFour"})
    public void testListFirstFourBoardMembers(String boardOne, String boardTwo, String boardThree, String boardFour){
        SoftAssert sa = new SoftAssert();

        Home home = app.homePage();

        sa.assertAll();
    }

    /**
     * TODO (task for the quiz taker!)
     * - write a test that validates the first P tag's text in Dan Contento's bio.
     * - the test MUST use the string passed as an argument in the test method
     */
    @Test(description = "test the first P tag's text matches for Dan Contento Bio")
    @Parameters({"danContentoBioFirst"})
    public void testBioTextMatch(String danContentoBioFirstPTag){
        SoftAssert sa = new SoftAssert();

        Home home = app.homePage();

        sa.assertAll();
    }

    /**
     * TODO (task for the quiz taker!)
     * - write a test that validates if Dan Contento's bio contains a link to his linkedin profile.
     */
    @Test(description = "test Dan Contento Bio contains a linkedin link")
    public void testBioContainsLinkedinLink(){
        SoftAssert sa = new SoftAssert();

        Home home = app.homePage();

        sa.assertAll();
    }


}
