package Pages;

import com.hp.lft.sdk.web.Browser;

public abstract class AbstractPage {
    /**
     * WebDriver instance.
     */
    private final Browser browser;
    
    protected AbstractPage(Browser browser) {
        this.browser = browser;
    }
    public Browser getBrowser(){
    	return browser;
    }
	

}
