/*************************
 *Name: 	Kain Mason
 * Course: 	CS-320 
 * Date: 	September 29, 2024
 
 *************************/
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {

    @Test
    public void testAddTask() {
        TaskService taskService = new TaskService();
        Task task = new Task("1", "Task Name", "Task Description");
        taskService.addTask(task);
        assertEquals(task, taskService.getTask("1"));
    }

    @Test
    public void testAddDuplicateTask() {
        TaskService taskService = new TaskService();
        Task task = new Task("1", "Task Name", "Task Description");
        taskService.addTask(task);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            taskService.addTask(new Task("1", "Another Task", "Another Description"));
        });
        assertEquals("Task with the same ID already exists.", exception.getMessage());
    }

    @Test
    public void testUpdateTask() {
        TaskService taskService = new TaskService();
        Task task = new Task("1", "Task Name", "Task Description");
        taskService.addTask(task);
        taskService.updateTask("1", "Updated Name", "Updated Description");
        assertEquals("Updated Name", taskService.getTask("1").getName());
        assertEquals("Updated Description", taskService.getTask("1").getDescription());
    }

    @Test
    public void testDeleteTask() {
        TaskService taskService = new TaskService();
        Task task = new Task("1", "Task Name", "Task Description");
        taskService.addTask(task);
        taskService.deleteTask("1");
        assertNull(taskService.getTask("1"));
    }
}
