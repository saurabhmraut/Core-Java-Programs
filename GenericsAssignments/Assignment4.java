

/**
  * Assignment4
  */

  
class KeyValue<T1, T2> {

    public static KeyValue<String, String> with(String string, String string2) {
        return null;
    }

    public KeyValue<String, String> setKey(String string1) {
        return null;
    }
    

}
 public class Assignment4 {
 
    public static void main(String[] args) { 
        KeyValue<String, String> kv= KeyValue.with("1","A computer science portal");
        KeyValue<String, String> myObj = kv.setKey("GeeksforGeeks");

        System.out.println(myObj);

    }
 }