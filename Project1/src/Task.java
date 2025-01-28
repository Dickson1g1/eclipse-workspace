import java.util.UUID;

public class Task {
    private String id;
    private String title;
    private String status;
    private String priority;

    public Task(String title, String status, String priority) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.status = status;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getStatus() {
        return status;
    }

    public String getPriority() {
        return priority;
    }
    
    @Override
    public String toString() {
        // Create a StringBuilder to build the string representation
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(id);
        stringBuilder.append(",");
        stringBuilder.append(title);
        stringBuilder.append(",");
        stringBuilder.append(status);
        stringBuilder.append(",");
        stringBuilder.append(priority);

        return stringBuilder.toString();
    }

//    @Override
//    public String toString() {
//        return id + "," + title + "," + status + "," + priority;
//  }
}