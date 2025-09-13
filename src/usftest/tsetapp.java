package usftest;

import java.io.InterruptedIOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import net.bytebuddy.agent.builder.AgentBuilder.Default.WarmupStrategy.Enabled;

public class tsetapp {

	//open chrome
	
	WebDriver driver = new EdgeDriver();
		
		
		@BeforeTest
		
	    public void getUrl () {
			
			
			//open Url
			driver.get("https://friendly-4.netlify.app/#/login");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.manage().window().maximize();
			
		}
			@Test(priority = 1)
			public void register () throws InterruptedException {
			
		//register
			
			driver.navigate().to("https://friendly-4.netlify.app/#/register");
			
			//data to be register
			
		         WebElement firstname = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div[2]/div/input[1]"));
		         WebElement lastname = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div[2]/div/input[2]"));
		         WebElement email = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div[3]/div/input"));
		         WebElement male = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div[4]/div[1]/span"));
		         WebElement jordan = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div[5]/div/div[2]/select/option[2]"));
		         WebElement phone = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div[6]/div/input"));
		         WebElement day = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div[7]/select[1]/option[16]"));
		         WebElement month = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div[7]/select[2]/option[5]"));
		         WebElement year = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div[7]/select[3]/option[18]"));
		         WebElement pass = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div[8]/div/input[1]"));
		         WebElement repass = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div[8]/div/input[2]"));
		         WebElement register = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div[9]/button"));
		       
		         
		         //data enterd
			    firstname.sendKeys("Waleed");
			    lastname.sendKeys("AbuALrub");
			    email.sendKeys("AbuALrub@gmail.com");
			    male.click();
			    jordan.click();
			    phone.sendKeys("0796593340");
			    day.click();
			    month.click();
			    year.click();
			    pass.sendKeys("12345678");
			    repass.sendKeys("12345678");
			    Thread.sleep(5000);
			    register.click();
			  
			 
			  driver.navigate().to ("https://friendly-4.netlify.app/#/login");
			}
					  
            
		@Test(priority = 2) 
		public void login () throws InterruptedException{
			
			
	
			//Thread.sleep(6000);
 			
			
			//elements data login
			 WebElement email = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div[2]/div/input"));
			 WebElement pass = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div[3]/div/input"));
			 WebElement login = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div[4]/button[1]"));
			 

			 
			//data enterd
			 
			 email.sendKeys("AbuALrub@gmail.com");
			 pass.sendKeys("12345678");
			 login.click();
		}
		
		@Test(priority = 3)
		public void post () throws InterruptedException {
			 
			//Thread.sleep(10000);
			
			// writpost
			WebElement writepost = driver.findElement(By.xpath("//*[@id=\"content\"]"));
			WebElement post = driver.findElement(By.xpath("//*[@id=\"img-post-btn\"]/button"));
			
			
			
			//action Write post 
			writepost.sendKeys("my name is waleed abularub iam 24 yaers old i love you to");
			post.click();
	
			
			
			//serach 
			 
			Thread.sleep(2000);

			WebElement serach = driver.findElement(By.className("search-bar-night"));
			serach.sendKeys("Yousf");
			
			
			Thread.sleep(2000);
			
			driver.navigate().to("https://friendly-4.netlify.app/#/68c08e972d73306d35422a60/message");
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			Thread.sleep(2000);
			
			WebElement soon = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[4]"));
			soon.click();
			
			Thread.sleep(2000);
			
			driver.navigate().to("https://friendly-4.netlify.app/#/profile");
			
			Thread.sleep(2000);
			
			WebElement like = driver.findElement(By.className("interact-button-night"));
			like.click();
			Thread.sleep(2000);
			like.click();
			Thread.sleep(2000);
			like.click();
			
			Thread.sleep(2000);
			
			driver.navigate().to("https://friendly-4.netlify.app/#/post/68c099e72d73306d35422c9f");
			
			//write comment
			
			WebElement writcomment = driver.findElement(By.className("gg-comment"));
			writcomment.click();
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
