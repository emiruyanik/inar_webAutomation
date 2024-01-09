package pages.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ShowConfirm extends BasePage {
    @FindBy(xpath = "//button[text()=\"Show Confirm\"]")
    private WebElement showConfirmButton;
    public ShowConfirm(){
        super();
    }
    public void clickOnShowConfirm(){
        showConfirmButton.click();
    }
    public void clickAccept(){
        getAlert().accept();
    }
    public void clickDismiss(){
        getAlert().dismiss();
    }
    public String getTextFromAlert(){
        return getAlert().getText();
    }
}
