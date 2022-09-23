package testeSelenium;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class SeleniumPdfConverter {

	
	public static void main(String[] args) throws IOException {

		geradorDeNotas();
		
	}
	
	public static void geradorDeNotas() throws IOException {
		
				
		File file = new File("C://Users//fernando.correa//Documents//GitHub//novos//folder//selenium//Notas ABB AUTOMACAO.csv");
		if (file.exists()) {
			
			FileInputStream stream = null;
			try {
				stream = new FileInputStream(file);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		       
		  InputStreamReader reader = new InputStreamReader(stream);
		       
		   try (BufferedReader br = new BufferedReader(reader)) {
					
		       	String linha = br.readLine();
				while(linha != null) {
					 linha = br.readLine();
					    
					try {
					    	
					    String[] urlCapturada = linha.split(";");
					    String url = urlCapturada[6];
					    WebDriverManager.edgedriver().setup();
				       
					    WebDriver driver = new EdgeDriver();
					    driver.get(url);
					    driver.findElement(By.className("btnNFSeGerarPdf")).click();
					    
					    
 				      // WebElement submitButton = new WebDriverWait(driver, Duration.ofSeconds(15))
 				      //        .until(driver1 -> driver.findElement(By.className("btnNFSeGerarPdf")));
					    
					    WebElement submitButton = new WebDriverWait(driver, Duration.ofSeconds(15))
	 				           .until(driver1 -> driver.findElement(By.className("btnNFSeGerarPdf")));
					    
					    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
 				       
 				       	
 				       
 				       	
 				       
				       //	WebElement submitButton = new WebDriverWait(driver, Duration.ofSeconds((3))
				       	//		.until(driver -> driver.findElement(By.className("btnNFSeGerarPdf")));
				       	
					    
					   // driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400000));
					    submitButton.click();
					    driver.quit();
		
					 } catch (NullPointerException e) {
					    	 System.out.println("Linha vazia: "+e.getMessage());				 
					 }
  		    	} // fecha o while enquanto houver linha no arquivo
		   }
		} else {
		System.out.println("Arquivo inexistente");
		}
}
}