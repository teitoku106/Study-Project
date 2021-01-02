public class Item {
    private String itemName;
    private int itemWeight;

    public Item(String name, int weight) {
        this.itemName = name;
        this.itemWeight = weight;
    }

    public String getName() {
        return this.itemName;
    }

    public int getWeight() {
        return this.itemWeight;
    }

    public String toString() {
        return this.itemName + " (" + this.itemWeight + " kg)";
    }




}
