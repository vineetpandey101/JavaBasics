package loginsesions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginSession {

	public static void main(String[] args) throws InterruptedException, IOException {
		String Org1="mna1.2_trial1143_admin@navatarplatform.com";
//		String Org2="mna1.2_trial1144_admin@navatarplatform.com";
//		String Org3="mna1.2_trial1143_admin@navatarplatform.com";
//		String Org4="mna1.2_trial1144_admin@navatarplatform.com";
//		String Org5="mna1.2_trial1143_admin@navatarplatform.com";
		ArrayList<String> obj1=new ArrayList();
		obj1.add(Org1);
//		obj1.add(Org2);
//		obj1.add(Org3);
//		obj1.add(Org4);
//		obj1.add(Org5);
		String Url="https://login.salesforce.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vineet Kumar\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		for(int i=0;i<=4;i++){
			for(String abc:obj1){
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				System.out.println("Browser Launched");
				driver.get(Url);
				System.out.println("Url Enter Success Fully");
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//*[@id='username']")).sendKeys(abc);
				System.out.println("Successfully Enter User Name"+abc);
				driver.findElement(By.xpath("//*[@id='password']")).sendKeys("navatar123");
				System.out.println("Successfully Enter Password"+"navatar123");
				driver.findElement(By.xpath("//*[@id='Login']")).click();
				System.out.println("Successfully click on Login button");
				Thread.sleep(5000);
				//driver.findElement(By.xpath("//*[@id='phHeaderLogoImage']")).isDisplayed();
				System.out.println("Login SuccessFully By"+abc);
				driver.close();
			}
			Runtime rt = Runtime.getRuntime();
			Process proc = rt.exec("taskkill /im chrome.exe /f /t");
		}
	}


}

