public class Factorial {

    public static  int calculate(int n){
        if(n==1 || n ==0 ){
            return 1;
        }

        int fn_1 =calculate(n-1);
        int fact_n = fn_1 * n ;
        return fact_n;
    }
    public static void main (String [] args){

        System.out.println(" recursion in java ");
       int ans = calculate(5);
       System.out.println(ans);
    }
    
}
