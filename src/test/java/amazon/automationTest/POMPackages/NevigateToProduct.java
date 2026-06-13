package amazon.automationTest.POMPackages;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import amazon.automationTest.basePackage.BaseClass;

public class NevigateToProduct extends BaseClass {
	@FindBy(xpath = "//input[@type='text']") WebElement searchBar;
	@FindBy(xpath = "//input[@type='submit']") WebElement submitBtn;
	
	
	
	public NevigateToProduct() {
		PageFactory.initElements(driver, this);
	}
	
	public void Search(String product) {
		wait.until(ExpectedConditions.visibilityOf(searchBar));
		searchBar.sendKeys(product);
		submitBtn.click();
		
	}

}
