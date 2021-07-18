import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SecondTest {
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
        driver.findElement(By.xpath("//a[@data-test ='create']")).click();
        driver.findElement(By.xpath("//input[@id='address_first_name']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id='address_last_name']")).sendKeys("Testovich");
        driver.findElement(By.xpath("//input[@name='address[address1]']")).sendKeys("Alex Str");
        driver.findElement(By.xpath("//input[@name='address[address2]']")).sendKeys("Gabrial Str");
        driver.findElement(By.xpath("//input[@id='address_city']")).sendKeys("New Trafford");
        Select drpCountry = new Select(driver.findElement(By.name("address[state]")));
        drpCountry.selectByVisibleText("Iowa");
        driver.findElement(By.xpath("//input[@id='address_zip_code']")).sendKeys("666");
        driver.findElement(By.xpath("//input[@value ='us']")).click();
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("09.05.1999");

        //driver.findElement(By.xpath("//input[@type='color']")).sendKeys("");
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("22");
        driver.findElement(By.xpath("//input[@type='url']")).sendKeys("https://coderlessons.com");
        WebElement uploadElement = driver.findElement(By.xpath("//input[@type='file']"));
        uploadElement.sendKeys("D:\\test.jpg");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("80297584632");
        driver.findElement(By.xpath("//input[@id ='address_interest_climb']")).click();
        driver.findElement(By.xpath("//textarea[@id='address_note']")).sendKeys(
                "Let the bird of loudest lay,\n" +
                        "\n" +
                        "On the sole Arabian tree,\n" +
                        "\n" +
                        "Herald sad and trumpet be,\n" +
                        "\n" +
                        "To whose sound chaste wings obey.");
        driver.findElement(By.xpath("//input[@data-test ='submit']")).click();
        driver.findElement(By.xpath("//a[@data-test ='list']")).click();
        Thread.sleep(2000);




        driver.close();
        driver.quit();
    }
}
