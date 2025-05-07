import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }
    
    public void removeTask(String id) {
        ArrayList<Task> tasksToKeep = new ArrayList<>();

        for (Task task : tasks) {
            
            if (!task.getId().equals(id)) {
                tasksToKeep.add(task);
            }
        }

        tasks.clear();
        tasks.addAll(tasksToKeep);
    }


    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public ArrayList<Task> getTasksByStatus(String status) {
        ArrayList<Task> filteredTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getStatus().equalsIgnoreCase(status)) {
                filteredTasks.add(task);
            }
        }
        return filteredTasks;
    }

    public ArrayList<Task> getTasksByPriority(String priority) {
        ArrayList<Task> filteredTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getPriority().equalsIgnoreCase(priority)) {
                filteredTasks.add(task);
            }
        }
        return filteredTasks;
    }
}