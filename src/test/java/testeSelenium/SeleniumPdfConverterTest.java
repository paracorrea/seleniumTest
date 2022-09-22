package testeSelenium;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPdfConverterTest {

	@Test
	public void test() {
		
		
		File file = new File("C://Users//fernando.correa//Documents//GitHub//novos//folder//selenium//Notas ABB AUTOMACAO.csv");
		
		if (file.exists()) {
			
			FileInputStream stream = null;
			try {
				stream = new FileInputStream(file);
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		       
			 // FileInputStream stream = new FileInputStream("\\\\172.16.252.8\\mestat$\\movitelFolder/teste.csv");
		      
			  InputStreamReader reader = new InputStreamReader(stream);
		       
		        try (BufferedReader br = new BufferedReader(reader)) {
					
		        	String linha = br.readLine();
				
					while(linha != null) {
					   // LOG.info("Linha capturada: "+linha);
					    linha = br.readLine();
					    
					    try {
					    	
					       	String[] urlCapturada = linha.split(";");
					       	String url = urlCapturada[6];
					       
		
					       	WebDriverManager.edgedriver().setup();

					       	WebDriver driver = new EdgeDriver();

        
					       	driver.get(url);
					       	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
    	
    	
					       	WebElement submitButton = driver.findElement(By.className("btnNFSeGerarPdf"));
					       	submitButton.click();
					       	
					       	driver.quit();
		
					    } catch (NullPointerException e) {
					    	 System.out.println("Linha vazia: "+e.getMessage());				 
					    }
					    
					    				       	
					} // fecha o while enquanto houver linha no arquivo
		        } catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		} else {
		
		System.out.println("Arquivo inexistente");
		}
}
}
