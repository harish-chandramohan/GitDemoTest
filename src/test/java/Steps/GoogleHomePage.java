package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class GoogleHomePage extends Infra {
	
	WebElement SearchTab;
	public void Search()
	{
		SearchTab = driver.findElement(By.name("q"));
		SearchTab.sendKeys("Red bus");
	}
	
	public void Search(String Search)
	{
		SearchTab = driver.findElement(By.name("q"));
		SearchTab.sendKeys(Search);
	}
	
	public void ClickGoogleSearch()
	{
		SearchTab.sendKeys(Keys.ENTER);
	}
}
