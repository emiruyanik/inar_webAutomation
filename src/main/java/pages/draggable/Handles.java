package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Handles extends BasePage {
    @FindBy(xpath = "//p[contains(text(),'I can be dragged only by this handle')]")
    private WebElement element1;
    @FindBy(xpath = "//p[contains(text(),'You can drag me around…')]")
    private WebElement element2;

    public Handles() {
        super();
    }

    public int xLocationOfFirstElement() {
        return element1.getLocation().getX();
    }

    public int yLocationOfFirstElement() {
        return element1.getLocation().getY();
    }

    public void clickAndDropForElement1(int xOffset, int yOffset) {
        actions.clickAndHold(element1).dragAndDropBy(element1, xOffset, yOffset).release().build().perform();
    }

    //for secondElement
    public int xLocationOfSecondElement() {
        return element2.getLocation().getX();
    }

    public int yLocationOfSecondElement() {
        return element2.getLocation().getY();
    }

    public void clickAndDropElement2(int xOffset, int yOffset) {
        actions.clickAndHold(element2).dragAndDropBy(element2, xOffset, yOffset).release().build().perform();
    }
}
