package pages.drppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class RevertAndDraggablePosition extends BasePage {
    @FindBy(id = "draggable-revert-draggable")
    private WebElement webElement1;
    @FindBy(id = "draggable2-revert-draggable")
    private WebElement webElement2;
    @FindBy(id = "droppable-revert-draggable")
    private WebElement webElement3;

    public RevertAndDraggablePosition() {
        super();
    }

    public void dragAndDropWebElement1() {
        actions.dragAndDrop(webElement1, webElement3).build().perform();
    }

    public void dragAndDropWebElement2() {
        actions.dragAndDrop(webElement2, webElement3).build().perform();
    }

    public int locationXOfWebElement1() {
        return webElement1.getLocation().getX();
    }

    public int locationYOfWebElement1() {
        return webElement1.getLocation().getY();
    }

    public int locationXOfWebElement2() {
        return webElement2.getLocation().getX();
    }

    public int locationYOfWebElement2() {
        return webElement2.getLocation().getY();
    }

}
