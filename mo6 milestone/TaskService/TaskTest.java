
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    @Test
    public void testValidTaskCreation() {
        Task task = new Task("1", "Task Name", "Task Description");
        assertEquals("1", task.getTaskId());
        assertEquals("Task Name", task.getName());
        assertEquals("Task Description", task.getDescription());
    }

    @Test
    public void testInvalidTaskId() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Task(null, "Name", "Description");
        });
        assertEquals("Task ID must be non-null and up to 10 characters long.", exception.getMessage());
    }

    @Test
    public void testInvalidName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Task("1", null, "Description");
        });
        assertEquals("Name must be non-null and up to 20 characters long.", exception.getMessage());
    }

    @Test
    public void testInvalidDescription() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Task("1", "Name", null);
        });
        assertEquals("Description must be non-null and up to 50 characters long.", exception.getMessage());
    }
}
