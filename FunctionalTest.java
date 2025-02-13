package Advantage_Shop_Test.Advantage_Shop_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class FunctionalTest {
	WebDriver driver;
  @Test(priority=1)
  public void openweb() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.get("https://www.advantageonlineshopping.com/#/");
	  Thread.sleep(5000);
  }
  
  @Test(priority=2)
  void TestLogo(){
	 boolean status= driver.findElement(By.xpath("//span[normalize-space()='dvantage']")).isDisplayed();
	 if(status==true) {
		 System.out.println("Logo is displayed");
	 }
	 else {
		 System.out.println("Logo is not displayed");
	 }
  }
  
  @Test(priority=3)
  void speakers_test() throws InterruptedException {
	  WebElement ele1=driver.findElement(By.xpath("//span[@id='speakersTxt']"));
	  ele1.click();
	  Thread.sleep(6000);	  
	  driver.findElement(By.xpath("//img[@id='20']")).click();
	  Thread.sleep(6000);
	  driver.findElement(By.xpath("//button[@name='save_to_cart']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[@id='shoppingCartLink']//*[name()='svg']")).click();
	  Thread.sleep(2000);
  }
  
  @Test(priority=4)
  void checkout_page() throws InterruptedException {
	  driver.findElement(By.id("checkOutPopUp")).click();
	  Thread.sleep(4000);
  }
  
  @Test(priority=5)
  void register_user() throws InterruptedException {
	  driver.findElement(By.xpath("//button[@id='registration_btn']")).click();
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("//input[@name='usernameRegisterPage']")).sendKeys("testuser1");
	  Thread.sleep(1500);
	  driver.findElement(By.xpath("//input[@name='emailRegisterPage']")).sendKeys("t1@gmail.com");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@name='passwordRegisterPage']")).sendKeys("Password@123");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@name='confirm_passwordRegisterPage']")).sendKeys("Password@123");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@name='first_nameRegisterPage']")).sendKeys("tt1");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@name='last_nameRegisterPage']")).sendKeys("tt1");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@name='phone_numberRegisterPage']")).sendKeys("1234561789");
	  Thread.sleep(1000);
	  
	  WebElement dropdown = driver.findElement(By.name("countryListboxRegisterPage"));
	  Select select = new Select(dropdown);
	  select.selectByValue("object:624");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@name='cityRegisterPage']")).sendKeys("Bangalore");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@name='addressRegisterPage']")).sendKeys("Bangalore 560008");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@name='state_/_province_/_regionRegisterPage']")).sendKeys("Kar");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@name='postal_codeRegisterPage']")).sendKeys("560008");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@name='i_agree']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//button[@id='register_btn']")).click();	  
  }
  
  @Test(priority=6)
  void payment() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("//div[@class='mobileBtnHandler']//button[@id='next_btn']")).click();
	  Thread.sleep(6000);
	  driver.findElement(By.xpath("//input[@name='safepay_username']")).sendKeys("kkkkk");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@name='safepay_password']")).sendKeys("Aaaaa1");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//button[@id='pay_now_btn_SAFEPAY']")).click();
	  Thread.sleep(6000);
	  boolean title = driver.findElement(By.xpath("//h3[@class='roboto-regular sticky fixedImportant ng-scope']")).equals("ORDER PAYMENT");
	  if(title==true) {
		  System.out.println("Payment pages displayed");
	  }
	  else {
		  System.out.println("Payment page not displayed");
	  }
  }
  @AfterClass
  void closeweb() {
	  driver.quit();
  }
} 
