package pages.alerts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ShowPrompt extends BasePage {
    @FindBy(xpath = "//button[text()=\"Show Prompt\"]")
    private WebElement showPromptButton;
}
