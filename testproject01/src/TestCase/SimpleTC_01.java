package TestCase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.hp.lft.report.ReportException;
import com.hp.lft.report.Reporter;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.BrowserFactory;
import com.hp.lft.sdk.web.BrowserType;

import Pages.HomePage;
import unittesting.*;

public class SimpleTC_01 extends UnitTestClassBase {
	Browser testBrowser;
	final String test_url="https://www.katalon.com/";
	
	public SimpleTC_01() {
	}	
	
	@BeforeClass
	 public static void setUpBeforeClass() throws Exception {
	 instance = new SimpleTC_01();
	 System.out.println(SimpleTC_01.class);
	 globalSetup(SimpleTC_01.class);
	 System.out.println(SimpleTC_01.class);
	 }
	
	@AfterClass
	 public static void tearDownAfterClass() throws Exception {
	 globalTearDown();
	 }

    @Before
    public void setUp() throws Exception {
    	// Launch the Chrome browser.
    	Reporter.reportEvent("setUp", "Start Browser");
    	testBrowser = BrowserFactory.launch(BrowserType.FIREFOX);
    	System.out.println("Browser has been lunched.");   	
    	
    }

    @After
    public void tearDown() throws Exception {
    	Reporter.reportEvent("tearDown", "Close Browser");
    	testBrowser.close();   
    }
    

    @Test
    public void accessHomepage() throws GeneralLeanFtException, ReportException {
    	// Navigate to https://www.katalon.com/
    	Reporter.reportEvent("accessHomepage", "Navigate to https://www.katalon.com");
    	testBrowser.navigate(test_url);
    	HomePage homePage = new HomePage(testBrowser);
    	String katalonName = homePage.getKalatonName();
    	Assert.assertTrue("Actual value is " + katalonName, katalonName.equals("KATALON STUDIO"));
//    	Assert.assertEquals("Test....+++", "a", "b");
    	
    	
    }

}