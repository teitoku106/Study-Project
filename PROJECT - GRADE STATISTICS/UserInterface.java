import java.util.Scanner;

public class UserInterface {
    private Points pointList;
    private Scanner scanner;

    public UserInterface(Points pointList, Scanner scanner) {
        this.pointList = pointList;
        this.scanner = scanner;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops: ");
        while (true) {
            int userInput = scanner.nextInt();

            if (userInput == -1) {
                break;
            } else {
                if (userInput > 0 && userInput < 100) {
                    this.pointList.addPoint(userInput);
                }
            }
        }
        System.out.println("Point average (all): " + pointList.pointAverage());
        System.out.println("Point average (passing): " + pointList.pointPassingAverage());
        System.out.println("Pass percentage: " + pointList.passPercentage());
        System.out.println("Grade distribution: ");
        pointList.pointsToGrade();
    }


}
