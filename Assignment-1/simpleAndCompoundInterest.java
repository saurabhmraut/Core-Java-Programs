import java.util.Scanner;

/**
 * simpleAndCompoundInterest
 */
public class  simpleAndCompoundInterest {
    public static double SimpleInterest(int p, Float r, int t) {
        // formula is SI = (principle * rate * time)/100
        double res =  (p * r * t)/100; 
        return res;
        
    } 
    public static double compoundInterest(int p, Float r, int t) {
        
        //formula  CI = principle * (1+rate/100)^time - principle
        double rate = r;
        double time = t;
        double temp = Math.pow((1+ rate/100), time);  
        double res = p * (temp-1) ; 
        return res;


    }

    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Ente the principle value : ");
        int principle = sc.nextInt();
        System.out.print("Enter the Rate Of interest : ");
        float rate = sc.nextFloat();
        System.out.print("Enter the Time : ");
        int time = sc.nextInt();  
        System.out.println( "Simple interest is : "+ SimpleInterest(principle, rate, time));
        System.out.printf( "Simple interest is %.2f : ", compoundInterest(principle, rate, time));

        
        
    }
}