import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	protected static void clickElement(ChromeDriver driver, String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.click();
    }

 
    protected static void sendKeysToElement(ChromeDriver driver, String xpath, String keys) {
        WebElement element = driver.findElement(By.xpath(xpath));
        element.sendKeys(keys);
    }

    protected static void sleep(long milliseconds) throws InterruptedException {
        Thread.sleep(milliseconds);
    }





}
