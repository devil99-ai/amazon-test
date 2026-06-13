package amazon.automationTest.testLayer;

import java.net.MalformedURLException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import amazon.automationTest.POMPackages.NevigateToProduct;
import amazon.automationTest.POMPackages.VerifyPrice;
import amazon.automationTest.POMPackages.addToCart;
import amazon.automationTest.basePackage.BaseClass;

public class IphoneTest extends BaseClass {
	addToCart addCart;
	NevigateToProduct nevigateProduct;
	VerifyPrice vp;
	
	public IphoneTest() {
		super();
	}
	@BeforeTest
	public void initSetup() throws MalformedURLException {
		initiation();
		screenshot("Amazon Web Page");
		addCart=new addToCart();
		nevigateProduct = new NevigateToProduct();
		vp = new VerifyPrice();
		
	}
	@Test
	public void TestCase001() {
		String product="iphone";
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
