import java.util.Scanner;

/**
 * simpleAndCompoundInterest
 */
public class  simpleAndCompoundInterest {
    public static double SimpleInterest(int p, int r, int t) {
        double res =  (p * r * t)/100;
        System.out.println(res);
        return res;
        
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ente the principle value : ");
        int principle = sc.nextInt();
        System.out.print("Enter the Rate Of interest : ");
        int rate = sc.nextInt();
        System.out.print("Enter the Time : ");
        int time = sc.nextInt();

        System.out.println(principle+" "+rate+" "+time);
         
        System.out.println( "Simple interest is : "+ SimpleInterest(principle, rate, time));

        
    }
}