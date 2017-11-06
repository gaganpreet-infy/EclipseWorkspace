package testPackage;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Mouse;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class testClass {
	WebDriver driver;
	
@BeforeTest
	public void preExecutionCall() {
	System.setProperty("webdriver.chrome.driver","/Users/infosysuser/Desktop/EclipseWorkspace/chromedriver");
	 driver = new ChromeDriver();
	System.out.println("This is the begining of Test");
	}
//@Test
//	public  void testCaseToOpenGmail() {
//	
//	driver.get("https://www.google.com");
//	WebElement searchBox= driver.findElement(ById.id("lst-ib"));
//	searchBox.clear();
//	searchBox.sendKeys("gmail");
//	WebElement searchButton =  driver.findElement(ByName.name("btnK"));
//	searchButton.click();
//	driver.navigate().back();
//	driver.navigate().forward();
//	List<WebElement> element = driver.findElements(ByClassName.className("_NId"));
//	System.out.println(element.size());
//	WebElement element2 = element.get(0);
//	element2.click();
//	WebElement dElement =  element2.findElement(ByPartialLinkText.partialLinkText("Gmail - Google"));
//	dElement.click();
//	System.out.println();
//	System.out.println("This is sample test");
//
//}

@Test
public void demo1(){
	driver.get("http://www.toolsqa.com/");
	WebElement inputTag = driver.findElement(ByXPath.xpath(".//*[@id='primary-menu']/li[2]/a/span[1]/span/span"));
	inputTag.click();
	WebElement firstlist = driver.findElement(ByXPath.xpath(".//*[@id='primary-menu']/li[2]/ul/li[2]/a/span[1]/span/span"));
	firstlist.click();
//	WebElement secondList = driver.findElement(ByXPath.xpath(".//*[@id='primary-menu']/li[2]/ul/li[2]/ul/li[3]/a/span[1]/span/span"));
//	if(secondList.isDisplayed()){
//	secondList.click();
//	}
//	else{
//		System.out.println( secondList);
//	}
}

@AfterTest
public void postExecutionCall()
{
	//driver.quit();
	System.out.println("This is the End of Test");
}
	


	
	
	
}
