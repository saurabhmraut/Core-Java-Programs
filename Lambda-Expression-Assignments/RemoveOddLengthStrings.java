import java.util.ArrayList;
import java.util.List;

/**
 * RemoveOddLengthStrings
 */
public class RemoveOddLengthStrings {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Saurabh");
        list.add("Abhishk");
        list.add("Eshwer");
        list.add("Harshal");
        list.add("Ramkisan");
        list.add("Aadesh");
        System.out.println("Original list"); 
        System.out.println(list);  
        System.out.println("List after removing old lenght words ");
        list.removeIf((str) -> (str.length()%2 !=0));
        System.out.println(list);

    }
}