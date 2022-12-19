package SeleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GestionTableau
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.marketindex.com.au/asx-listed-companies");
        driver.manage().window().maximize();

        //Obtenir le nombre de lignes
        List<WebElement>rowelement=driver.findElements(By.xpath("//*[@id=\"sticky-table\"]/div/div/div/table/tbody/tr"));
        int rowsize= rowelement.size();
        System.out.println("Row size"  +rowsize);
        //Obtenir le nombre de colonnes
        List<WebElement>colonumelement=driver.findElements(By.xpath("//*[@id=\"sticky-table\"]/div/div/div/table/tbody/tr[1]/td"));
        int colonumsize= colonumelement.size();
        System.out.println("colonumsize" +colonumsize);
        for (int i=1;i<rowsize;i++)
        {
            for (int j=1;j<colonumsize;j++)
            {
                System.out.println(driver.findElement(By.xpath("//*[@id=\"stickytable\"]/div/div/div/table/tbody/tr["+i+"]/td["+j+"]")).getText());

                System.out.println("test");
            }
        }

    }
}
