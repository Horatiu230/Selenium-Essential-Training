import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium learning tools\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDownButton = driver.findElement(By.id("dropdownMenuButton"));
        dropDownButton.click();

        WebElement autoCompleteButton = driver.findElement(By.id("autocomplete"));
        autoCompleteButton.click();

        driver.quit();
    }
}
