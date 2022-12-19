package SeleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitTest {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.tunisianet.com.tn/");
        driver.manage().window().maximize();
        WebElement element= driver.findElement(By.xpath("//*[@id=\"_desktop_top_menu\"]/div/div/ul/li[5]/div[1]/span"));
        //faire un mouseover
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
        ////Explicit wait and click on the button
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Chargeurs']"))).click();









    }
}
