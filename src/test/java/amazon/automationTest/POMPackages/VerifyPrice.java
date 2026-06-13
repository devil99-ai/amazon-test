package amazon.automationTest.POMPackages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import amazon.automationTest.basePackage.BaseClass;

public class VerifyPrice extends BaseClass {
	
	
	@FindBy(xpath = "//span[@class='a-price']") WebElement subTotalData;
	
	public VerifyPrice() {
		PageFactory.initElements(driver, this);
	}
	public String getPrice() {
		wait.until(ExpectedConditions.visibilityOf(subTotalData));
		String subtotalTab=subTotalData.getText();
		String price=subtotalTab.trim();
		
		return price;
	}
	
	
}