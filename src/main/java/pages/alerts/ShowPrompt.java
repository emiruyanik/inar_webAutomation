package pages.alerts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ShowPrompt extends BasePage {
    @FindBy(css = ".btn.btn-warning")
    private WebElement showPromptButton;

    public ShowPrompt() {
        super();
    }

    public void clickOnShowPrompt() {
        showPromptButton.click();
    }

    public void sendKeys(String value) {
        getAlert().sendKeys(value);
    }

    public void acceptButton() {
        getAlert().accept();
    }

    public void dismissButton() {
        getAlert().dismiss();
    }

    public String getTextInAlert() {
        return getAlert().getText();
    }
}
