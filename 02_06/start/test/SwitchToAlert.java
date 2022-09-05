import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement alertButton = driver.findElement(By.id("alert-button")); //gasirea butonului;
        alertButton.click(); //dam clik pe el;

        Alert alert = driver.switchTo().alert(); //Alert ca sa apara mesaj de alerta;
        alert.accept(); //acceptare;


        driver.quit();
    }
}
