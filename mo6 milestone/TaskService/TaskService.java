/*************************
 *Name: 	Kain Mason
 * Course: 	CS-320 
 * Date: 	September 29, 2024
 
 *************************/
import java.util.HashMap;
import java.util.Map;

public class TaskService {
    private Map<String, Task> taskMap = new HashMap<>();

    public void addTask(Task task) {
        if (taskMap.containsKey(task.getTaskId())) {
            throw new IllegalArgumentException("Task with the same ID already exists.");
        }
        taskMap.put(task.getTaskId(), task);
    }

    public void updateTask(String taskId, String name, String description) {
        Task task = taskMap.get(taskId);
        if (task == null) {
            throw new IllegalArgumentException("Task not found.");
        }
        task.setName(name);
        task.setDescription(description);
    }

    public void deleteTask(String taskId) {
        if (!taskMap.containsKey(taskId)) {
            throw new IllegalArgumentException("Task not found.");
        }
        taskMap.remove(taskId);
    }

    public Task getTask(String taskId) {
        return taskMap.get(taskId);
    }
}
