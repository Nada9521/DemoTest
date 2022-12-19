package SeleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.Wait.*;

public class FluentWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com.au/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        //Fluent Method
        Wait<WebDriver> wait=new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(20))
                        .pollingEvery(Duration.ofSeconds(2))
                                .withMessage("RCV Academy: this is custom message")
                                        .ignoring(NoSuchElementException.class);


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='iPhone']"))).click();
    }

}
