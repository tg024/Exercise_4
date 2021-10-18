import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    WebDriver driver;

    @Test
    public void test() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.messenger.com/");
        Thread.sleep(1000);
        driver.findElement(By.name("email")).sendKeys("555458465");
        driver.findElement(By.id("pass")).sendKeys("dasdsadas");
        driver.findElement(By.id("loginbutton")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.close();
    }
}
