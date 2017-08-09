package exercises.restaurant;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private boolean isNew;


    public MenuItem(String name, double price, String description, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.isNew = isNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }


    public String toString() {
        return "Name: " + name + "\n Price: " + price + "\n Description: " + description + "\n New: " + isNew;
    }


}
