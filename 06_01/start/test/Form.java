import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("Horatiu"); //aici nu mai scriu WebElement, incep direct cu driver si dau comanda la final, dupa punct;

        driver.findElement(By.id("last-name")).sendKeys("Haiduc");

        driver.findElement(By.id("job-title")).sendKeys("QA");

        WebElement levelOfEducation = driver.findElement(By.id("radio-button-3"));
        levelOfEducation.click(); //sau pot scrie asa cum am invatat prima data, pentru dragul exemplului;

        driver.findElement(By.id("checkbox-1")).click();

        driver.findElement(By.cssSelector("option[value='1']")).click();

        driver.findElement(By.id("datepicker")).sendKeys("08/10/2022");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);

        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click(); //pun . inainte de clase;

        driver.quit();
    }
}
