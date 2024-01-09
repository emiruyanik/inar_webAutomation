package pages.selectable;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class Serialize extends BasePage {
    @FindBy(css = "#selectable-serialize>li")
    private List<WebElement> webElements;
    @FindBy(id = "feedback-serialize")
    private WebElement informationText;

    public Serialize() {
        super();
    }

    public void clickOnlyOneElement(int i) {
        actions.click(webElements.get(i - 1)).release().perform();
    }

    public String getInformation() {
        return informationText.getText();
    }

    public void clickWithCtrlKeyAndSelectMoreThanOne(int i1, int i2, int i3) {
        actions.keyDown(Keys.CONTROL).perform();
        actions.click(webElements.get(i1 - 1)).release().perform();
        actions.click(webElements.get(i2 - 1)).release().perform();
        actions.click(webElements.get(i3 - 1)).release().perform();
        actions.keyUp(Keys.CONTROL).perform();
    }

    public void selectPressingMouseAndSelectMoreThanOne(int init, int last) {
        actions.clickAndHold(webElements.get(init - 1)).moveToElement(webElements.get(last - 1)).release().build().perform();
    }
}
