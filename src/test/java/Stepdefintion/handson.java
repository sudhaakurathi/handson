
package Stepdefintion;

//import static org.testng.AssertJUnit.assertequals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.When;
public class handson {

	
	
	WebDriver driver;
	

@When("user launches the chrome and given the testme link")
public void user_launches_the_chrome_and_given_the_testme_link() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_C2a.04.30\\Desktop\\Sel-Drivers\\chromedriver.exe");
  System.out.println("open chrome");
  driver=new ChromeDriver();
}

@When("user click the sign-in link")
public void user_click_the_sign_in_link() {
	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
  
}

@When("user enter the {string} in name field")
public void user_enter_the_in_name_field(String name) {
	driver.findElement(By.name("userName")).sendKeys(name);
  System.out.println("username");
  
}

@When("user enters the {string} in word field")
public void user_enters_the_in_word_field(String word) {
	driver.findElement(By.name("password")).sendKeys(word);
  System.out.println("password");  
}

@When("user click the login button")
public void user_click_the_login_button() {
	driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
  System.out.println("login button");
  
}

@When("validates the product")
public void validates_the_product() {
	//Assert.assertequals( "home",driver.getTitle());
  System.out.println("user login successfully");
 
}



}
