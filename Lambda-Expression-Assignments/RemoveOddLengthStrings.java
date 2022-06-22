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
        System.out.println();
        for (String string : list) {
            System.out.print(string+"  "); 
        }
        System.out.println();
        list.removeIf((str) -> (str.length()%2 !=0));
        for (String string : list) {
            System.out.print(string+ "  ");
            
        }

    }
}