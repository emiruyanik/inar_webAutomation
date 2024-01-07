package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ConstrainMovement extends BasePage {
    @FindBy(id = "draggable5")
    private WebElement firstDraggableElement;

    @FindBy(id = "draggable6")
    private WebElement secondDraggableElement;

    @FindBy(id = "draggable7")
    private WebElement thirdDraggableElement;

    @FindBy(id = "draggable8")
    private WebElement fourthDraggableElement;

    public ConstrainMovement() {
        super();
    }

    public void clickAndDragFirstElement(int xOffset, int yOffset) {
        actions.clickAndHold(firstDraggableElement).dragAndDropBy(firstDraggableElement, xOffset, yOffset).release().build().perform();
    }
    public void clickAndDragSecondElement(int xOffset, int yOffset) {
        actions.clickAndHold(firstDraggableElement).dragAndDropBy(firstDraggableElement, xOffset, yOffset).release().build().perform();
    }

    public int firstElementOFLocationX() {
        return firstDraggableElement.getLocation().getX();
    }

    public int firstElementOFLocationY() {
        return firstDraggableElement.getLocation().getY();
    }

    public int SecondElementOFLocationX() {
        return secondDraggableElement.getLocation().getX();
    }

    public int SecondElementOFLocationY() {
        return secondDraggableElement.getLocation().getY();
    }


}
