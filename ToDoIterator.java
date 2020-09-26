
import java.util.Iterator;

/**
 * Implements the java.util Iterator
 */
public class ToDoIterator implements Iterator {

    private int positions;
    private ToDo[] todos;

    public ToDoIterator(ToDo[] todos) {
        this.todos = todos;
    }

    /**
     *
     * @return true if there more item to iterate over
     */
    @Override
    public boolean hasNext() {
        return positions < todos.length && todos[positions] != null;
    }

    /**
     *
     * @return the next ToDo, if there is one, and null otherwise
     */
    @Override
    public ToDo next() {

        if (hasNext()) {
            return todos[positions++];
        } else {
            return null;
        }
    }

}
