import java.util.List;
import java.util.ArrayList;

public class TaskList {

    protected List<Task> userList;

    public TaskList() {
        userList = new ArrayList<>();
    }

    public void add(Task task) {
        userList.add(task);
        System.out.println("Got it. I've added this task: ");
        System.out.println(task);
        System.out.println("Now you have " + userList.size() + " tasks in the list.");
    }

    public void markDone(int number) {
        Task task = userList.get(number - 1);
        task.markDone();
        System.out.println("Nice! I've marked this task as done: ");
        System.out.println(task);
    }

    public void remove(int number) {
        Task task = userList.get(number - 1);
        userList.remove(number - 1);
        System.out.println("Noted. I've removed this task: ");
        System.out.println(task);
        System.out.println("Now you have " + userList.size() + " tasks in the list.");
    }

    public void list() {
        int counter = 1;
        for (Task task:userList) {
            System.out.println(counter + "." + task);
            counter++;
        }
    }

}
