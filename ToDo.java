import java.util.ArrayList;

/**
 * Holds the details of an item which they have to complete.
 */
public class ToDo {

    private String title;
    private String description;
    private double price;
    private String contact;
    private ArrayList<String> supplies;

    public ToDo(String title, String description, double price, String contact, ArrayList<String> supplies) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.contact = contact;
        this.supplies = supplies;
    }

    /**
     * returns the price to complete the todo item
     *
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     *
     * @return a string representation of title, description, contact, supply
     * list, and price
     */
    @Override
    public String toString() {
        String s = "";
        s += "\n";
        s += "***** " + title + " *****\n";
        s += description + "\n";
        s += "Business Contact: " + contact + "\n";
        s += "Supply List:" + "\n";
        for (String supp : supplies) {
            s += "- " + supp + "\n";
        }
        s += "Price: $" + price + "\n";
        return s;
    }
}
