import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromDriver\\chromedriver.exe");
        WebDriver driver  = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("http://a.testaddressbook.com/sign_in");


        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("To_my_mind_user@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("666");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);



        driver.close();
        driver.quit();
    }
}
