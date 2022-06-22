import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer; 

/**
 * StringUsingFirstLetterOfEachWord
 */
public class StringUsingFirstLetterOfEachWord {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); 
        list.add("Saurabh");
        list.add("Harshal"); 
        list.add("Eshwer");
        list.add("Ramkisan");
        list.add("Aadesh");
        System.out.println();


        StringBuilder str = new StringBuilder() ;
        
        Consumer<String> consumer = (string1)-> { 
            char ch = string1.charAt(0);
            str.append(ch); 
        } ; 

        for (String string : list) {
        consumer.accept(string);  
        }

        System.out.println(str);
    }

        
}