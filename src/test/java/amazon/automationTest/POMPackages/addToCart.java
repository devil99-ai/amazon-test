package amazon.automationTest.POMPackages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import amazon.automationTest.basePackage.BaseClass;

public class addToCart extends BaseClass {
	@FindBy(xpath = "//button[@name=\"submit.addToCart\"]") List<WebElement> addToCartBtn;
	@FindBy(xpath = "//a[normalize-space()='Go to Cart']") WebElement gotoCart;
	
	
	public addToCart() {
		PageFactory.initElements(driver, this);
	}
	
	public void addproductToCart() {
		wait.until(ExpectedConditions.visibilityOfAllElements(addToCartBtn));
		if(!addToCartBtn.isEmpty()) {
			System.out.println("cart button displayed");
			addToCartBtn.get(0).click();
			System.out.println("clicked on cart button");
		}
	}
//	public void gotoCartAndGetPrice() {
//		By gotoCartLocator =
//	            By.xpath("//a[contains(@href,'cart')]");
//		WebElement cartBtn =
//	            wait.until(
//	                    ExpectedConditions.elementToBeClickable(
//	                            gotoCartLocator));
//
//	    System.out.println("go to cart button displayed");
//
//	    cartBtn.click();
//	}
}