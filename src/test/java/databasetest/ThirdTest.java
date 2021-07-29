package databasetest;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.support.ui.Select;
import startAndEnd.StartAndEnd;

import static locator.Locator.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ThirdTest extends StartAndEnd {


        @Order(2)
        @Test
        public void oneEditTest() throws InterruptedException {
            driver.findElement(ADDRESS_BUTTON_HEADER ).click();
            driver.findElement(EDIT_BUTTON).click();
            driver.findElement(ADDRESS_LAST_NAME).clear();
            driver.findElement(ADDRESS_LAST_NAME).sendKeys("Jackovich");
            driver.findElement(ADDRESS_ONE).clear();
            driver.findElement(ADDRESS_ONE).sendKeys("Ganibal Str");
            Select newdrpCountry = new Select(driver.findElement(ADDRESS_STATE));
            newdrpCountry.selectByVisibleText("Florida");
            driver.findElement(ADDRESS_ZIP_CODE).sendKeys("\b", "9");
            driver.findElement(ADDRESS_CANADA).click();

            //driver.findElement(By.xpath("//input[@type='color']")).sendKeys("");
            driver.findElement(ADDRESS_PHONE).sendKeys("\b", "7");
            driver.findElement(ADDRESS_INTEREST_DANCE).click();
            driver.findElement(ADDRESS_NOTE).clear();
            driver.findElement(ADDRESS_NOTE).sendKeys(
                "Sigh no more, ladies, sigh no more,\n" +
                        "\n" +
                        "Men were deceivers ever,\n" +
                        "\n" +
                        "One foot in sea and one on shore,\n" +
                        "\n" +
                        "To one thing constant never:\n" +
                        "\n" +
                        "Then sigh not so, but let them go,\n" +
                        "\n" +
                        "And be you blithe and bonny,\n" +
                        "\n" +
                        "Converting all your sounds of woe\n" +
                        "\n" +
                        "Into Hey nonny, nonny.\n" +
                        "\n" +
                        "Sing no more ditties, sing no moe,\n" +
                        "\n" +
                        "Of dumps so dull and heavy;\n" +
                        "\n" +
                        "The fraud of men was ever so\n" +
                        "\n" +
                        "Since summer first was leafy");
            driver.findElement(ADDRESS_CREAT_BUTTON).click();
            driver.findElement(LIST_BUTTON).click();
            Thread.sleep(2000);
        }

       @Ignore
       @Order(3)
       @Test
       public void twoEditTest() throws InterruptedException {
            driver.findElement(ADDRESS_BUTTON_HEADER ).click();
            driver.findElement(EDIT_BUTTON).click();
            driver.findElement(ADDRESS_FIRST_NAME).clear();
            driver.findElement(ADDRESS_FIRST_NAME).sendKeys("3452");
            driver.findElement(ADDRESS_TWO).clear();
            driver.findElement(ADDRESS_TWO).sendKeys("Ленина");
            Select newdrpCountry = new Select(driver.findElement(ADDRESS_STATE));
            newdrpCountry.selectByVisibleText("Москва");
               //driver.findElement(By.xpath("//input[@type='color']")).sendKeys("");

            driver.findElement(ADDRESS_INTEREST_READ).click();
            driver.findElement(ADDRESS_NOTE).clear();
            driver.findElement(ADDRESS_CREAT_BUTTON).click();
            driver.findElement(LIST_BUTTON).click();
            Thread.sleep(2000);
       }


        @Order(1)
        @Test
        public void EditTest() throws InterruptedException {
            driver.findElement(ADDRESS_BUTTON_HEADER ).click();
            driver.findElement(EDIT_BUTTON).click();
            driver.findElement(ADDRESS_FIRST_NAME).clear();
            driver.findElement(ADDRESS_FIRST_NAME).sendKeys("Dida");
            driver.findElement(ADDRESS_TWO).clear();
            driver.findElement(ADDRESS_TWO).sendKeys("laida Str");
            Select newdrpCountry = new Select(driver.findElement(ADDRESS_STATE));
            newdrpCountry.selectByVisibleText("Ohio");
            //driver.findElement(By.xpath("//input[@type='color']")).sendKeys("");

            driver.findElement(ADDRESS_INTEREST_READ).click();
            driver.findElement(ADDRESS_NOTE).clear();
            driver.findElement(ADDRESS_CREAT_BUTTON).click();
            driver.findElement(LIST_BUTTON).click();
            Thread.sleep(2000);
    }


}
