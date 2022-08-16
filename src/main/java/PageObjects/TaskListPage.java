package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskListPage extends PageBase {
    public TaskListPage(AppiumDriver appiumdriver) {
        super(appiumdriver);
    }
    @AndroidFindBy(id="com.jeffprod.todo:id/fab")
    MobileElement addTaskBtn;

    public void clickAddTaskBtn(){
        click(addTaskBtn);
    }


}
