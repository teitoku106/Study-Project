import java.util.ArrayList;

public class Points {
    private ArrayList<Integer> points;


    public Points() {
        this.points = new ArrayList<>();

    }

    public void addPoint(int point) {
        this.points.add(point);
    }

    public double pointAverage() {
        double sum = 0.0;
        for (int i : points) {
            sum += i;
        }
        return sum / this.points.size();
    }

    public double pointPassingAverage() {
        double sum = 0.0;
        int countOfPassingPoints = 0;
        for (int i : points) {
            if (i > 50) {
                sum += i;
                countOfPassingPoints++;
            }
        }
        if (countOfPassingPoints != 0) {
            return sum / countOfPassingPoints;
        }
        return 0.0;
    }

    public double passPercentage() {
        int countOfPassingPoints = 0;
        for (Integer i : points) {
            if (i >= 50) {
                countOfPassingPoints++;
            }
        }
        return ((1.0 * countOfPassingPoints) / this.points.size() * 100);
    }

    public void pointsToGrade() {
        ArrayList<Integer> grade = new ArrayList<>();
        for (Integer point : points) {
            if (point < 50) {
                grade.add(0);
            } else if (point < 60) {
                grade.add(1);
            } else if (point < 70) {
                grade.add(2);
            } else if (point < 80) {
                grade.add(3);
            } else if (point < 90) {
                grade.add(4);
            } else {
                grade.add(5);
            }
        }
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + stars(grade, i));
        }
    }

    private String stars(ArrayList<Integer> grades, int number) {
        String star = "";
        for (Integer grade : grades) {
            if (grade == number) {
                star += "*";
            }
        }
        return star;
    }
}
