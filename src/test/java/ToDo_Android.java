import PageObjects.CreateTaskPage;
import PageObjects.TaskListPage;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class ToDo_Android extends TestBase{

    CreateTaskPage createTaskPage;
    TaskListPage taskListPage;

    @Test
    public void test_add_task() throws MalformedURLException {
        Android_setUp();
        taskListPage=new TaskListPage(driver);
        createTaskPage=new CreateTaskPage(driver);
        taskListPage.clickAddTaskBtn();
        createTaskPage.enterTaskName("First task");
        createTaskPage.enterDesc("This area for task description");
        driver.hideKeyboard();
        createTaskPage.clickSaveBtn();
        tearDown();
    }
}
