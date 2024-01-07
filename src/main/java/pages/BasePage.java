package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.time.Duration;

public abstract class BasePage {
  protected final WebDriver driver= Driver.getDriver();

  protected WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));

 protected Actions actions=new Actions(driver);

  public BasePage(){
      PageFactory.initElements(driver,this);
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  }
}
