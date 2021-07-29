package startAndEnd;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import utilits.Driver;
import static locator.Locator.*;

public class StartAndEnd {

    public WebDriver driver = Driver.getChromeDriver();

    @Before
    public void setUp() throws InterruptedException {
        driver.get("http://a.testaddressbook.com/sign_in");
        String currentURL = driver.getCurrentUrl();
        Assertions.assertEquals( "http://a.testaddressbook.com/sign_in", currentURL );
        driver.findElement(EMAIL_USER).sendKeys("To_my_mind_user@gmail.com");
        driver.findElement(PASSWORD_USER).sendKeys("666");
        driver.findElement(SING_IN_BUTTON).click();
        Thread.sleep(2000);
    }
    @After
    public void closesecond() {
        driver.quit();
    }
}
