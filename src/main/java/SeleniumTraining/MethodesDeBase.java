package SeleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MethodesDeBase
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://www.google.com");

        //Manage
        driver.manage().window().maximize();
        //GetCurrentURL
        String currenturl= driver.getCurrentUrl();
        System.out.println("Current url     "  +currenturl);
        //GetTitle
        String title= driver.getTitle();
        System.out.println("Title  "+title);
        //GetPageSource
        //String ps= driver.getPageSource();
        //System.out.println("PageSource    "+ps);
        //Naviagate
        driver.navigate().to("https://www.saucedemo.com/");
        //FindElement
        driver.findElement(By.id("user-name")).sendKeys("standard user");
        //GetAttribute
        System.out.println("Attribut class   "+driver.findElement(By.id("user-name")).getAttribute("class"));
        //GetLocation
        System.out.println("location    "+driver.findElement(By.id("user-name")).getLocation());
        //GetSize
        System.out.println("Size   "+driver.findElement(By.id("user-name")).getSize());
        //IsDisplayed
        System.out.println("IsDisplayed  "+driver.findElement(By.id("user-name")).isDisplayed());
        //IsEnabled
        System.out.println("IsEnabled  "+driver.findElement(By.id("user-name")).isEnabled());

        //GetTexte il y a une remarque
        driver.navigate().to("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        System.out.println("Texte" +driver.findElement(By.xpath("//*[@id=\"contactList\"]/tbody/tr[2]/td[2]")).getText());
        //GetTagName
        System.out.println("Nom de la balise"+driver.findElement(By.linkText("//td[text()='Maria Anders]")).getTagName());
        //Quit
        driver.quit();
        driver.findElement(By.name("password")).sendKeys("secret sauce");
        driver.findElement(By.xpath("input[@id='password']")).click();
        //FindElements
        List<WebElement>wbls=driver.findElements(By.cssSelector("product_sort_container"));
        System.out.println("Liste Web Element" +wbls);
        //GetWindowHandle
        String wd = driver.getWindowHandle();
        System.out.println("WindowHandle  "+wd);
        driver.navigate().to("https://www.google.fr/");
        driver.findElement(By.name("q")).sendKeys("Selenium");
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).click();
        //Close
        driver.close();

    }
}
