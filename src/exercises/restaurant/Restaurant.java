package exercises.restaurant;

import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {


        MenuItem noodles = new MenuItem("Noodles", 8.99, "Thin noodles with vegetables", false);
        ArrayList<MenuItem> items = new ArrayList<>();
        items.add(noodles);

        Menu lunch = new Menu("Lunch", items);

        System.out.println(lunch);
    }


}
