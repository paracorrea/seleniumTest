package seleniumTestes;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InstallDriversTestTest {

	/*
	 * @Test public void chromeSession() { WebDriverManager.chromedriver().setup();
	 * 
	 * WebDriver driver = new ChromeDriver();
	 * 
	 * driver.quit()
	 */;
    
	
	/*
	 * @Test public void edgeSession() { WebDriverManager.edgedriver().setup();
	 * 
	 * WebDriver driver = new EdgeDriver();
	 * 
	 * driver.quit(); }
	 */

	    @Test
	    public void firefoxSession() {
	        WebDriverManager.firefoxdriver().setup();

	        WebDriver driver = new FirefoxDriver();

	        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

	        String title = driver.getTitle();
	        System.out.println(title);
	        
	        //assertEquals("Web form", title);

	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

	        WebElement textBox = driver.findElement(By.name("my-text"));
	        WebElement submitButton = driver.findElement(By.cssSelector("button"));

	        textBox.sendKeys("Selenium");
	        submitButton.click();

	        WebElement message = driver.findElement(By.id("message"));
	        String value = message.getText();
	        assertEquals("Received!", value);
	        
	        //driver.quit();
	    }

//	    @Disabled("Only runs on Windows")
//	    @Test
//	    public void ieSession() {
//	        WebDriverManager.iedriver().setup();
//
//	        WebDriver driver = new InternetExplorerDriver();
//
//	        driver.quit();
//	    }
	
}
