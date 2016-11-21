package Pages;


import com.hp.lft.report.ReportException;
import com.hp.lft.report.Reporter;
import com.hp.lft.sdk.GeneralLeanFtException;
import com.hp.lft.sdk.web.Browser;
import com.hp.lft.sdk.web.WebElement;
import com.hp.lft.sdk.web.XPathDescription;

public class HomePage extends AbstractPage{
	private static String KATALON_NAME_XPATH = "/html/body/header/div[2]/div/div/div/h1";
	private static String FEATURE_TAB_XPATH = "/html/body/nav/div/div[2]/ul/li[2]/a";
	
	public HomePage(Browser browser) {
		super(browser);
	}
	
	public String getKalatonName(){
		String valueName=null;
		try {
			valueName = getBrowser().describe(WebElement.class, new XPathDescription(KATALON_NAME_XPATH)).getVisibleText();
			Reporter.reportEvent("getKatalonName", "get value: " + valueName);
			
		} catch (GeneralLeanFtException | ReportException e) {
			e.printStackTrace();
			
		}
		return valueName;
		
	}
	
	

}
