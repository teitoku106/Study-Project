import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> holdSuitcases;

    public Hold(int maxWeight) {
        this.holdSuitcases = new ArrayList<>();
        this.maximumWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        int holdCaseWeight = 0;
        for (Suitcase caseInside : holdSuitcases) {
            holdCaseWeight += caseInside.totalWeight();
        }
        if ((this.maximumWeight - holdCaseWeight) >= suitcase.totalWeight()) {
            this.holdSuitcases.add(suitcase);
        }
    }

    public String toString() {
        int holdCaseWeight = 0;
        for (Suitcase caseInside : holdSuitcases) {
            holdCaseWeight += caseInside.totalWeight();
        }

        if (this.holdSuitcases.isEmpty()) {
            return "no suitcase (" + holdCaseWeight + " kg";
        }
        if (this.holdSuitcases.size() == 1) {
            return this.holdSuitcases.size() + " suitcase (" + holdCaseWeight + " kg)";
        } else {
            return this.holdSuitcases.size() + " suitcases (" + holdCaseWeight + " kg)";
        }
    }

    public void printItems() {
        for (Suitcase inside : holdSuitcases) {
            inside.printItems();
        }
    }
}
