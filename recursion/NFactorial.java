import java.util.Scanner;
public class NFactorial {

    public static void fact(int x , int i, int f){

        if(i==x){
            
            f= f+x;
            System.out.println(f);
            return;
        }
        else if (x ==0){
            System.out.println(1);
            return;
        }
         f = f*x;
            fact(x-1, i,f);
            
    }
        public static void main (String []args){
        System.out.println("-----factorial of a number using recursion in java-----");
        System.out.println("choose a number");
        Scanner sc = new Scanner(System.in);
            
            fact(sc.nextInt(), 0, 1);
    }
    
}
