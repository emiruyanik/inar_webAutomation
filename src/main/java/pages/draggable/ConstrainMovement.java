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
        actions.clickAndHold(secondDraggableElement).dragAndDropBy(secondDraggableElement, xOffset, yOffset).release().build().perform();
    }

    public int firstElementOFLocationX() {
        return firstDraggableElement.getLocation().getX();
    }

    public int firstElementOFLocationY() {
        return firstDraggableElement.getLocation().getY();
    }

    public int secondElementOFLocationX() {
        return secondDraggableElement.getLocation().getX();
    }

    public int secondElementOFLocationY() {
        return secondDraggableElement.getLocation().getY();
    }

    //for third element
    public void clickAndDragThirdElement(int xOffset, int yOffset) {
        actions.dragAndDropBy(thirdDraggableElement, xOffset, yOffset).build().perform();
    }


    public int thirdElementOFLocationX() {
        return thirdDraggableElement.getLocation().getX();
    }

    public int thirdElementOFLocationY() {
        return thirdDraggableElement.getLocation().getY();
    }
    //for fourth element
    public int fourthElementOfLocationX(){
        return fourthDraggableElement.getLocation().getX();
    }
    public int fourthElementOfLocationY(){
        return fourthDraggableElement.getLocation().getY();
    }
    public void clickAndDragFourthElement(int xOffset,int yOffset){
        actions.dragAndDropBy(fourthDraggableElement,xOffset,yOffset).build().perform();
    }


}
