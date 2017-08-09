package exercises.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items = new ArrayList<>();
    private String category;

    public Menu(String category, ArrayList<MenuItem> items) {
        this.category = category;
        this.items = items;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItem(MenuItem item) {
        this.items.add(item);

    }

    public String toString() {
        return items.toString();
    }

}
