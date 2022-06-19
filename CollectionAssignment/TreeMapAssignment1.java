import java.util.Set;
import java.util.TreeMap;

/**
 * TreeMapAssignment1
 */

public class TreeMapAssignment1 {

    public static void main(String[] args) { 
        TreeMap<Long,Contact> list = new TreeMap<>();

        list.put((long) 1000001, new Contact( 98501157, "Saurabh", "saurabh@gmail.com", Contact.Gender.Male));
        list.put((long) 1000002, new Contact( 77273978, "Abhishek", "abhishek@gmail.com", Contact.Gender.Male));
        list.put((long) 1000003, new Contact( 98645678, "Asim", "asim@gmail.com", Contact.Gender.Male));
        

        Set<Long> keys=list.keySet();
        System.out.print("Keys :- ");
        for(long i:keys)
        {
            System.out.print(i+"  ");
            
        } 
        System.out.println();
        System.out.println("Values:-");
        for(long i:keys)
        {
            System.out.println("   "+list.get(i));
        }
        System.out.println();
        System.out.println(list);

    }   
} 
