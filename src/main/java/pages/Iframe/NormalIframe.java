package pages.Iframe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class NormalIframe extends BasePage {
    @FindBy(id = "nestedIframe")
    private WebElement normalIframe;
    @FindBy(tagName = "h1")
    private WebElement textTitle;

    public NormalIframe() {
        super();
    }


    public void passToNormalIframe() {
        driver.switchTo().frame(normalIframe);
    }

    public String getTextTitle() {
        return textTitle.getText();
    }
}
