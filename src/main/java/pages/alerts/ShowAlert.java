package pages.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ShowAlert extends BasePage {
    @FindBy(xpath = "//button[text()=\"Show Alert\"]")
    private WebElement showAlertButton;

    public ShowAlert() {
        super();
    }


    public void clickOnShowAlertButton() {
        showAlertButton.click();

    }

    public void clickOnConfirm() {
        getAlert().accept();
    }

    public String getAlertText() {
        return getAlert().getText();
    }
}
