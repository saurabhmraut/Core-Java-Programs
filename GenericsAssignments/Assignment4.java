

/**
  * Assignment4
  */

  
// class KeyValue<T1, T2> {

//     public static KeyValue<String, String> with(String string, String string2) {
//         return null;
//     }

//     public KeyValue<String, String> setKey(String string1) {
//         return null;
//     } }

class Student <K,V> {
    private K key;
    private V value;
    public Student() {
    }
    public Student(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    } 
    
}
 public class Assignment4 {
 
    public static void main(String[] args) { 
        // KeyValue<String, String> kv= KeyValue.with("1","A computer science portal");
        // KeyValue<String, String> myObj = kv.setKey("GeeksforGeeks"); 
        // System.out.println(myObj);  
        Student<String, String> student = new Student<>();
        student.setKey("Name");
        student.setValue("Saurabh");
        
        String key = student.getKey();
        String value = student.getValue();
        System.out.println("{"+key+":"+value+"}");

    }
 }