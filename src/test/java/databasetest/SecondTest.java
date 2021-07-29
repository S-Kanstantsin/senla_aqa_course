package databasetest;


import org.junit.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import startAndEnd.StartAndEnd;

import static locator.Locator.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SecondTest extends StartAndEnd {



         @Test
         public void fillTest() throws InterruptedException {
            driver.findElement(ADDRESS_BUTTON_HEADER).click();
            driver.findElement(NEW_ADDRESS_BUTTON).click();
            driver.findElement(ADDRESS_FIRST_NAME).sendKeys("Test");
            driver.findElement(ADDRESS_LAST_NAME).sendKeys("Testovich");
            driver.findElement(ADDRESS_ONE).sendKeys("Alex Str");
            driver.findElement(ADDRESS_TWO ).sendKeys("Gabrial Str");
            driver.findElement(ADDRESS_CITY).sendKeys("New Trafford");
            Select drpCountry = new Select(driver.findElement(ADDRESS_STATE));
            drpCountry.selectByVisibleText("Iowa");
            driver.findElement(ADDRESS_ZIP_CODE).sendKeys("666");
            driver.findElement(ADDRESS_USA).click();
            driver.findElement(ADDRESS_BIRTHDAY).sendKeys("09.05.1999");

            //driver.findElement(By.xpath("//input[@type='color']")).sendKeys("");
            driver.findElement(ADDRESS_AGE).sendKeys("22");
            driver.findElement(ADDRESS_WEB).sendKeys("https://coderlessons.com");
            WebElement uploadElement = driver.findElement(ADDRESS_DOWNLOAND_FILE);
            uploadElement.sendKeys("D:\\test.jpg");
            driver.findElement(ADDRESS_PHONE).sendKeys("80297584632");
            driver.findElement(ADDRESS_INTEREST_CLIMB).click();
            driver.findElement(ADDRESS_NOTE).sendKeys(
                "Let the bird of loudest lay,\n" +
                        "\n" +
                        "On the sole Arabian tree,\n" +
                        "\n" +
                        "Herald sad and trumpet be,\n" +
                        "\n" +
                        "To whose sound chaste wings obey.");
            driver.findElement(ADDRESS_CREAT_BUTTON).click();
            driver.findElement(LIST_BUTTON).click();
            Thread.sleep(2000);
        }



}
