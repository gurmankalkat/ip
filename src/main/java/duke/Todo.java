package duke;

public class Todo extends Task {
    private boolean isDone;

    public Todo(String description, boolean isDone) {
        super(description,isDone);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }
}
