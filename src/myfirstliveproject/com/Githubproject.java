package myfirstliveproject.com;


import java.awt.AWTException;

import org.openga.selenium.Alert;
import org.openga.selenium.By;
import org.openga.selenium.webdriver;
import org.openga.selenium.edge.edgewebdriver;


public class Alerts{
	
	public static void main(String[] args) throws AWTException,InteruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\chengampolicestation\\Downloads\\edgedriver_win64");
		webdriver driver=new edgedriver();
		driver.get("https://demo.automationtesting.in/alerts.html");
		
		driver.findElement(By.xpath("//a[@href=\"#textbox\"]")).click();
		driver.findElement(By.xpath("//button[@onclick=\"promptbox()\"]")).click();
		
		Alert a=driver.switchto().alert();
		System.out.println(a.gettext());
		a.sendkeys("selenium");
		Thread.sleep(2000);
		a.accept();
	}

		// TODO Auto-generated method stub

	}


