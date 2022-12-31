package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	public void selectFromDropdown(WebElement element, String visibleTest) {
		
		Select sel = new Select(element);
		sel.deselectByVisibleText(visibleTest);
		
	}

}
