import java.util.ArrayList;

/**
 * Holds an array of max 2 todo items
 *
 */
public class ContractorToDoList {

    private String address;
    private ToDo[] todos;
    private int count;

    public ContractorToDoList(String address) {
        this.address = address;
        todos = new ToDo[2];
        count = 0;
    }

    /**
     * Accepts the title, description, price, contact, and list of supplies
     *
     * @param title
     * @param description
     * @param price
     * @param conatct
     * @param supplies
     */
    public void addToDo(String title, String description, double price, String conatct, ArrayList<String> supplies) {

        ToDo todo = new ToDo(title, description, price, conatct, supplies);

        if (count >= this.todos.length) {
            todos = this.growArray(todos);
        }
        todos[count] = todo;
        count++;
    }

    /**
     *
     * @return a new ToDoIterator
     */
    public ToDoIterator createIterator() {
        return new ToDoIterator(todos);
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the total price of completing all the todo items in the list
     */
    public double getTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < count; i++) {
            totalCost += this.todos[i].getPrice();
        }
        return totalCost;
    }

    /**
     * @param todos
     * @return an array of twice the size with the same data
     */
    private ToDo[] growArray(ToDo[] todos) {

        ToDo[] newTodos = new ToDo[todos.length * 2];
        for (int i = 0; i < todos.length; i++) {
            newTodos[i] = todos[i];
        }
        return newTodos;
    }

}