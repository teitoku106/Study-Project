import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> itemsList;
    private int maximumWeight;


    public Suitcase(int maxWeight) {
        itemsList = new ArrayList<>();
        this.maximumWeight = maxWeight;
    }

    public void addItem(Item item) {
        int suitCaseWeight = 0;
        for (Item itemsInside : itemsList) {
            suitCaseWeight += itemsInside.getWeight();
        }

        if ((this.maximumWeight - suitCaseWeight) >= item.getWeight()) {
            this.itemsList.add(item);
        }

    }

    public String toString() {
        int suitCaseWeight = 0;
        for (Item itemsInside : itemsList) {
            suitCaseWeight += itemsInside.getWeight();
        }

        if (this.itemsList.isEmpty()) {
            return "no items (" + suitCaseWeight + " kg";
        }
        if (this.itemsList.size() == 1) {
            return this.itemsList.size() + " item (" + suitCaseWeight + " kg)";
        } else {
            return this.itemsList.size() + " items (" + suitCaseWeight + " kg)";
        }

    }

    public void printItems() {
        for (Item inside : itemsList) {
            System.out.println(inside);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item inside : itemsList) {
            totalWeight += inside.getWeight();
        }
        return totalWeight;
    }

    public Item heaviestItem() {
        if (this.itemsList.isEmpty()) {
            return null;
        }
        Item heaviestItem = this.itemsList.get(0);
        for (Item item : itemsList) {
            if (heaviestItem.getWeight() < item.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
}
