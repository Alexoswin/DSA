

public class natural_numbers {
    public static void Sum(int i , int n , int sum){
     if(i==n){
        sum = sum +i;
        System.out.println(sum);
        return;
     }
     sum = sum+i;
     Sum(i+1,n,sum);
            
    }
    
    public static void main (String []args){
        System.out.println("-----Print sim of n natural numbers using recursion-----");
      
       Sum(1, 100, 0);
    }
}
