
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Points stats = new Points();
        UserInterface ui = new UserInterface(stats, scanner);
        ui.start();
    }
}
