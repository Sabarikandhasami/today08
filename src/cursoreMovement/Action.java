package cursoreMovement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SABU\\Documents\\selenium\\Actions\\chrome\\chromedriver.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("http://www.greenstech.in/selenium-course-content.html");
		
		WebElement lnkCourses = chrome.findElement(By.xpath("//div[text()='Courses ']"));
		
		Actions actions=new Actions(chrome);
		actions.moveToElement(lnkCourses).perform();
		
		WebElement lnkMaster = chrome.findElement(By.xpath("//span[text()='Master Program (8)']"));
		
		Actions actions1 =new Actions(chrome);
		actions1 .moveToElement(lnkMaster).perform();
		
		WebElement btnMore = chrome.findElement(By.xpath("//a[text()='View All Courses'][1]"));
		btnMore.click();
		
		System.out.println("dadghasd");
		
		
		
		
	}

}
