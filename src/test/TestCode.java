package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import logic.Code;

public class TestCode {
	@Test
	public void testFunc() {
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rapidtables.com/convert/temperature/celsius-to-fahrenheit.html");      //http dove voglio navigare
		
		driver.findElement(By.xpath("//*[@id=\"x\"]")).sendKeys("30");     //findElement=dove mi muovo       //sendKeys=cosa scrivo
		driver.findElement(By.xpath("//*[@id=\"doc\"]/form/table/tbody/tr[2]/td[2]/button[1]")).click();                     //click=clicco
		WebElement TxtBoxContent=driver.findElement(By.xpath("//*[@id=\"doc\"]/form/table/tbody/tr[3]/td[2]/input"));     //TxtBoxContent=classe ,il testo lo metto in vaue
        String val=TxtBoxContent.getAttribute("value");
        
        
		driver.close();
		assertEquals("86",val);
	}

}
