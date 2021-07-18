import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class ThirdTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromDriver\\chromedriver.exe");
        WebDriver driver  = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("http://a.testaddressbook.com/sign_in");


        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("To_my_mind_user@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("666");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@data-test ='addresses']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
        driver.findElement(By.xpath("//input[@id='address_last_name']")).clear();
        driver.findElement(By.xpath("//input[@id='address_last_name']")).sendKeys( "Jackovich");
        driver.findElement(By.xpath("//input[@name='address[address1]']")).clear();
        driver.findElement(By.xpath("//input[@name='address[address1]']")).sendKeys("Ganibal Str");
        Select newdrpCountry = new Select(driver.findElement(By.name("address[state]")));
        newdrpCountry.selectByVisibleText("Florida");
        driver.findElement(By.xpath("//input[@id='address_zip_code']")).sendKeys("\b", "9");
        driver.findElement(By.xpath("//input[@value ='canada']")).click();

        //driver.findElement(By.xpath("//input[@type='color']")).sendKeys("");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("\b","7");
        driver.findElement(By.xpath("//input[@id ='address_interest_dance']")).click();
        driver.findElement(By.xpath("//textarea[@id='address_note']")).clear();
        driver.findElement(By.xpath("//textarea[@id='address_note']")).sendKeys(
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
        driver.findElement(By.xpath("//input[@data-test ='submit']")).click();
        driver.findElement(By.xpath("//a[@data-test ='list']")).click();
        Thread.sleep(2000);




        driver.close();
        driver.quit();
    }
}
