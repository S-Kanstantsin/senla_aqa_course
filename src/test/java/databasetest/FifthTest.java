package databasetest;

import org.junit.Test;
import org.junit.jupiter.api.TestInstance;
import startAndEnd.StartAndEnd;

import static locator.Locator.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FifthTest extends StartAndEnd {

        @Test
        public void singOut() throws InterruptedException {
            driver.findElement(SING_OUT_BUTTON).click();
            Thread.sleep(1000);
        }


}
