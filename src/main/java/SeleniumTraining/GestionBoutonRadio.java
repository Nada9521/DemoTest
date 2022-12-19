package SeleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GestionBoutonRadio
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2019/08/radio-buttons.html");
        driver.manage().window().maximize();
        //Scroller vers le bouton radio
        WebElement radio1= driver.findElement(By.name("red"));
        Actions actions = new Actions(driver);
        actions.moveToElement(radio1);
        actions.perform();
        radio1.click();
        System.out.println(radio1.isSelected());

        WebElement radio2= driver.findElement(By.name("blue"));
        Actions actions1=new Actions(driver);
        actions.moveToElement(radio2);
        actions.perform();
        radio2.click();
        System.out.println(radio2.isSelected());

    }
}
