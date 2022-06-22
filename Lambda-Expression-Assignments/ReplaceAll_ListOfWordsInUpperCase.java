import java.util.ArrayList;
import java.util.List; 

/**
 * ReplaceAll_ListOfWordsInUpperCase
 */ 

public class ReplaceAll_ListOfWordsInUpperCase {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); 
        list.add("Saurabh");
        list.add("Harshal"); 
        list.add("Eshwer");
        list.add("Ramkisan");
        list.add("Aadesh");
        System.out.println(list);   
        
        list.replaceAll((str) -> (str.toUpperCase()));

        System.out.println(list); 
    }
}