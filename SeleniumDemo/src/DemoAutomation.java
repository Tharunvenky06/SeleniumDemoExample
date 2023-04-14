import org.openqa.selenium.edge.EdgeDriver;

public class DemoAutomation {

	public static void main(String[] args) 
	{ 
		System.setProperty("webdriver.edge.driver" , "C:\\Browsserdrivers\\msedgedriver");
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https:\\www.google.com");

		}

}
