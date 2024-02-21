public class logntut2{
    public static int calculate(int x, int n){

        if(x== 0){
            return 0;
        }
        else if(n == 0){
            return 1 ;

        }


        if(n % 2  == 0){
            return calculate(x, n/2) * calculate(x , n/2);

        } // n  is even
        else{
            return calculate(x, n/2) * calculate(x , n/2) * x;
        }// n is odd 
    }

 

    public static void main (String [] args){


        System.out.println("----- X^n such that the height of the stack is logn -----");
        
        int ans= calculate(5,2);
        System.out.println(ans);
    }
}