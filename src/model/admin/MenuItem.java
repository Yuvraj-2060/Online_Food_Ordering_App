package model.admin;

public class MenuItem {
    private String name;
    private ItemType itemType;
    private double price;

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

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public MenuItem(String name, ItemType itemType, double price) {
        this.name = name;
        this.itemType = itemType;
        this.price = price;
    }
}
