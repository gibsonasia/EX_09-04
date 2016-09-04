package nyc.c4q.asiagibson;

public class Main {

    public static void main(String[] args) {

        Student asia = new Student("asia", "gibson", 21, "cheese");
        Student bob =  new Student("bob", "din", 4, "burger");

        System.out.println(Student.checkSameFavoriteFood(asia,bob));

    }
}
