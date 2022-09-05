import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium learning tools\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement NewTabbutton = driver.findElement(By.id("new-tab-button")); //gasim butonul;
        NewTabbutton.click(); //dam click pe el;

        String originalHandle = driver.getWindowHandle(); //gasim pagina principala;
        //for-pt a putea itera prin cele doua pagini;
        for(String handle1: driver.getWindowHandles()) {  //getHandles e pt ambele pagini;
            driver.switchTo().window(handle1);  //aici codul se refera la trecerea la pagina a doua;
        }

        driver.switchTo().window(originalHandle); //trecem inapoi la pagina principala pt. a inchide testul;

        driver.quit(); //inchidem testul
    }
}
