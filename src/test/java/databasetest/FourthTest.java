package databasetest;

import org.junit.Test;
import org.junit.jupiter.api.TestInstance;
import startAndEnd.StartAndEnd;
import static locator.Locator.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FourthTest extends StartAndEnd {

        @Test
        public void dellAddress() throws InterruptedException {
            driver.findElement(ADDRESS_BUTTON_HEADER ).click();
            driver.findElement(DESTROY_BUTTON).click();
            driver.switchTo().alert().accept();
            Thread.sleep(2000);
        }
}
