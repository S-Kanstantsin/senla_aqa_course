package databasetest;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import utilits.Driver;

import static locator.Locator.*;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstTest {

        private WebDriver driver = Driver.getChromeDriver();

        @BeforeAll
        public void setUpfirst() {
            driver.get("http://a.testaddressbook.com/sign_in");
            String currentURL = driver.getCurrentUrl();
            Assertions.assertEquals( "http://a.testaddressbook.com/sign_in", currentURL );
        }

        @Test
        void singInTest() throws InterruptedException {
            driver.findElement(EMAIL_USER).sendKeys("To_my_mind_user@gmail.com");
            driver.findElement(PASSWORD_USER).sendKeys("666");
            driver.findElement(SING_IN_BUTTON).click();
            Thread.sleep(2000);
        }

         @AfterAll
         public void closefirst() {
            driver.quit();
         }


}
