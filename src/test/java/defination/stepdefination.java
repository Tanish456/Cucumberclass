package defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepdefination {
	
	public static String van = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	@Given("I should go to the login page  #precondition")
	public void i_should_go_to_the_login_page_precondition() {
	    WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
	    driver.get(van);
	}
	
	@Given("Enter the username {string}")
	public void enter_the_username(String string) throws InterruptedException {
       Thread.sleep(8000);
       driver.findElement(By.name("username")).sendKeys(string);
       }
       
	@Given("Enter the password {string}")
	public void enter_the_password(String string) throws InterruptedException {
		 Thread.sleep(8000);
		 driver.findElement(By.name("password")).sendKeys(string);
	}

	@Given("Click on the login button")
	public void click_on_the_login_button() throws InterruptedException {
		 Thread.sleep(8000);
		 driver.findElement(By.xpath("//*[@type='submit']")).click();
	}

	@Then("I should see the login #outcomes")
	public void i_should_see_the_login_outcomes()  throws InterruptedException {
		 Thread.sleep(8000);
		 String st = driver.getTitle();
		 System.out.println(st);
		 driver.close();
	}

}


