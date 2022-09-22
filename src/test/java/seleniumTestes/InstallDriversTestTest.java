package seleniumTestes;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
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
	 * driver.quit(); }
	 */

	    @Test
	    public void edgeSession() {
	        
	    		    	
	    	WebDriverManager.edgedriver().setup();

	        WebDriver driver = new EdgeDriver();

	        
	    	driver.get("https://notacarioca.rio.gov.br/contribuinte/notaprint.aspx?ccm=06042970&nf=4413015&verificacao=W3XJ3VHH");
	    	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    	
	    	
	    	WebElement submitButton = driver.findElement(By.className("btnNFSeGerarPdf"));
	    	submitButton.click();
	    	
	    	driver.quit();
	    	
	    	
	    
	    }

		/*
		 * @Test public void firefoxSession() {
		 * WebDriverManager.firefoxdriver().setup();
		 * 
		 * WebDriver driver = new FirefoxDriver();
		 * 
		 * driver.quit(); }
		 */
	   
	}

