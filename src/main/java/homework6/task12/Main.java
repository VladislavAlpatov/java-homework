package homework6.task12;
import java.util.Stack;

interface UndoableCommand {
    void execute();
    void undo();
}

class AppendCommand implements UndoableCommand {
    private StringBuilder delegate;
    private String appendedString;

    public AppendCommand(StringBuilder delegate, String appendedString) {
        this.delegate = delegate;
        this.appendedString = appendedString;
    }

    @Override
    public void execute() {
        delegate.append(appendedString);
    }

    @Override
    public void undo() {
        int endIndex = delegate.length();
        int startIndex = endIndex - appendedString.length();
        delegate.delete(startIndex, endIndex);
    }
}
class StringBuilderWithUndo {
    private StringBuilder delegate = new StringBuilder();
    private Stack<UndoableCommand> commandStack = new Stack<>();

    public StringBuilderWithUndo append(String str) {
        UndoableCommand command = new AppendCommand(delegate, str);
        command.execute();
        commandStack.push(command);
        return this;
    }

    public void undo() {
        if (!commandStack.isEmpty()) {
            UndoableCommand command = commandStack.pop();
            command.undo();
        }
    }

    @Override
    public String toString() {
        return delegate.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        StringBuilderWithUndo stringBuilder = new StringBuilderWithUndo();
        stringBuilder.append("Hello, ");
        stringBuilder.append("world!");
        System.out.println(stringBuilder);  // Output: "Hello, world!"

        stringBuilder.undo();
        System.out.println(stringBuilder);  // Output: "Hello, "

        stringBuilder.undo();
        System.out.println(stringBuilder);  // Output: ""
    }
}

