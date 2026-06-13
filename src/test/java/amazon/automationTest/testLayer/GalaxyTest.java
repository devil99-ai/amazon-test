package amazon.automationTest.testLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import amazon.automationTest.POMPackages.NevigateToProduct;
import amazon.automationTest.POMPackages.VerifyPrice;
import amazon.automationTest.POMPackages.addToCart;
import amazon.automationTest.basePackage.BaseClass;

public class GalaxyTest extends BaseClass {
	addToCart addCart;
	NevigateToProduct nevigateProduct;
	VerifyPrice vp;
	
	public GalaxyTest() {
		super();
	}
	@BeforeTest
	public void initSetup() {
		initiation();
		screenshot("Amazon Web Page");
		addCart=new addToCart();
		nevigateProduct = new NevigateToProduct();
		vp = new VerifyPrice();
		
	}
	@Test
	public void TestCase001() {
		String product="galaxy s25";
		nevigateProduct.Search(product);
		addCart.addproductToCart();
		String price = vp.getPrice();
		System.out.println("Price of "+product+" is: "+price);
		
	}
	@AfterTest
	public void TearDown() {
		driver.quit();
	}
	

}
