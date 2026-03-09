package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class text_verification {

	public static void main(String[] args) {
		WebDriver driver;
		driver = new ChromeDriver();
		String Exptext1="brainstorming";
		driver.get("https://chatgpt.com/");
		String ActText1=driver.getPageSource();
		if(ActText1.contains(Exptext1)) {
			System.out.println("Text available");
		}else {
			System.out.println("Text  not available");
		}
		driver.quit();
	}

}
//Done
