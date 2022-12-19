package SeleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CaseAcocher {

    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://simcast.com/");
        driver.manage().window().maximize();

        WebElement radio= driver.findElement(By.xpath("//input[@name='remember']"));
        System.out.println(radio.isSelected());
        //Scroller vers le bouton radio
        Actions actions=new Actions(driver);
        actions.moveToElement(radio);
        actions.perform();
        radio.click();
        System.out.println(radio.isSelected());
    }
}
