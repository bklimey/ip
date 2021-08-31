package duke;

/**
 * Represents a Todo Task
 */
public class Todo extends Task {

    public Todo(String description) {
        super(description);
    }
    public Todo(String description, boolean isDone) {
        super(description, isDone);
    }

    @Override
    public String serialise() {
        return "T" + super.serialise();
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}