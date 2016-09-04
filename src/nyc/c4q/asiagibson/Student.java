package nyc.c4q.asiagibson;
/**
 * Created by asiagibson on 9/4/16.
 */
public class Student {
    private String firstName;
    private  String lastName;
    private  int idNumber;
    private String favFood;

    //CONSTRUCTOR SHORT CUT CONTROL + N
    public Student(String firstName, String lastName, int idNumber, String favFood) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.favFood = favFood;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName (String fName){
        firstName = fName;
    }

     String getLastName(){
        return lastName;
    }

    public void setLastName (String lName) {
        lastName = lName;
    }

    public String getFavFood(){
        return favFood;
    }
    public void setFavFood (String food) {
        favFood = food;
    }

    public int getIdNumber(){
        return idNumber;
    }


    public void setIdNumber (){
        return  ;
    }

    public static boolean checkSameFavoriteFood(Student s1, Student s2){
       return s1.getFavFood().equalsIgnoreCase(s2.getFavFood());

    }
}
