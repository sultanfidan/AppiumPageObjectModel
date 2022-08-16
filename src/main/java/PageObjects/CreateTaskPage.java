package PageObjects;

import PageObjects.PageBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreateTaskPage extends PageBase {
    public CreateTaskPage(AppiumDriver appiumdriver) {
        super(appiumdriver);
    }

    @AndroidFindBy(id="editTextTitre")
    MobileElement taskNameTxt;

    @AndroidFindBy(id="editTextNote")
    MobileElement taskDescTxt;

    @AndroidFindBy(id="action_save")
    MobileElement saveBtn;

    public void enterTaskName(String taskName){
        clear(taskNameTxt);
        sendText(taskNameTxt,taskName);
    }

    public void enterDesc(String descName){
        clear(taskDescTxt);
        sendText(taskDescTxt,descName);
    }

    public void clickSaveBtn(){
        click(saveBtn);    }

    public void createTask(String taskname,String desc){
        click(taskNameTxt);
        sendText(taskNameTxt,taskname);
        click(taskDescTxt);
        sendText(taskDescTxt,desc);
        click(saveBtn);
    }


}
