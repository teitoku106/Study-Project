import java.util.ArrayList;

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients = new ArrayList<>();

    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        for (String ingrident : ingredients) {
            this.ingredients.add(ingrident);
        }
    }

    public String getName() {
        return this.name;
    }

    public int getTime() {
        return this.time;
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    public void printIngredient() {
        System.out.println(this.ingredients);
    }

    public String toString() {
        return this.getName() + ", cooking time: " + this.getTime();
    }
}
