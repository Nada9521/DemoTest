package SeleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

import static java.lang.Thread.*;

public class GestionFenetre
{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.salesforce.com/fr/");
        driver.findElement(By.xpath("//*[@id=\"globalnavbar-header-container\"]/div[3]/div/div/div/a/span")).click();
        Thread.sleep(4000);
        Set<String> WindowsHandles=driver.getWindowHandles();
        System.out.println(WindowsHandles);
        Iterator<String> Iter= WindowsHandles.iterator();
        System.out.println("Iterator"   +Iter);
        String ParentWindow=Iter.next();
        System.out.println("ParentWindow "+ParentWindow);
        String ChildWindow=Iter.next();
        System.out.println("ChildWindow "+ChildWindow);
        driver.switchTo().window(ChildWindow);
        driver.findElement(By.name("UserFirstName")).sendKeys("Test 1");
        driver.findElement(By.name("UserLastName")).sendKeys("Test 2");
        Thread.sleep(4000);
        driver.switchTo().window(ParentWindow);

    }
}
