import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws Exception {
		
		//ScreenRecorderUtil.startRecord("Tarefa 40093");
		
		//WebDriverManager.chromedriver().browserVersion("129").setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.name("search")).sendKeys("macbook");
		
		driver.findElement(By.cssSelector("button[class='btn btn-default btn-lg']")).click();
		
		driver.close();
		
		ScreenRecorderUtil.stopRecord();

	}

}
