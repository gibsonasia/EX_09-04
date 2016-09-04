/**
 * Created by asiagibson on 9/4/16.
 */
public class Student {
    private String firstName;
    private  String lastName;
    private  int idNumber;
    private String favFood;

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getFavFood(){
        return this.favFood;
    }

    public int getIdNumber(){
        return this.idNumber;
    }

    public String setFirstName (){
        return null;
    }
    public String setLastName (){
        return null;
    }
    public String setFavFood (){
        return null;
    }
    public void setIdNumber (){
        return  ;
    }

    public static boolean checkSameFavoriteFood(String favFood){
        String s1FavFood = "Type of food";
        String s2Favfood = "Type of food";

        return s1FavFood.equals(s1FavFood);


    }
}
