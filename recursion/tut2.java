public class tut2{

    public static int calculate(int x , int n){

         if(n == 1 || n == 0){
            return 1;
         }

        int  x_pow = calculate(x, n-1);
    
         int ans = x* x_pow;
         return ans;

        
  

    }

    public static void main (String []args){
         System.out.println("-----X^N using recursion in java -----");

         System.out.println(calculate(5, 5));
    }
}