package pages.menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.List;

public class Icons extends BasePage {
    @FindBy(css = "#menu-w-icons>li>div")
    private List<WebElement>mainIcons;
    @FindBy(xpath = "//ul[@aria-expanded='true']/li")
    private List<WebElement>subIcons;
    public Icons(){
        super();
    }
    public boolean isClickable(String iconName){
        List<String>list=mainIcons.stream().map(WebElement::getText).toList();
        actions.moveToElement(mainIcons.get(list.indexOf(iconName))).perform();
        BrowserUtils.wait(1);
        System.out.println(mainIcons.get(list.indexOf(iconName)).getAttribute("class"));

        return mainIcons.get(list.indexOf(iconName)).getAttribute("class").contains("ui-state-active");
    }
}
