package pages.alerts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Alerts extends BasePage {
    @FindBy(xpath = "//button[text()=\"Show Alert\"]")
    private WebElement showAlertButton;
    @FindBy(xpath = "//button[text()=\"Show Confirm\"]")
    private WebElement showConfirmButton;
    @FindBy(css = ".btn.btn-warning")
    private WebElement showPromptButton;

    public Alerts() {
        super();
    }

    public void clickOnShowAlertButton() {
        showAlertButton.click();

    }

    public void clickOnShowConfirm() {
        showConfirmButton.click();
    }

    public void clickOnShowPrompt() {
        showPromptButton.click();
    }
}
