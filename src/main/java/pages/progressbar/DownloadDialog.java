package pages.progressbar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class DownloadDialog extends BasePage {
    @FindBy(id = "downloadButton-download-dialog")
    private WebElement startDownloadButton;
    @FindBy(id = "dialog-download-dialog")
    private WebElement progressBar;
    @FindBy(xpath = "//button[text()=\"Cancel Download\"]")
    private WebElement cancelButton;


    public DownloadDialog() {
        super();
    }

    public void clickOnStartDownloadButton() {
        startDownloadButton.click();
    }

    public String getCompletedText() {
        return progressBar.getText();
    }

    public void clickOnCancelButton() {
        cancelButton.click();
    }

    public String getCancelText() {
        return cancelButton.getText();

    }
}
