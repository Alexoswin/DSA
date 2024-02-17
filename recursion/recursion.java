
public class recursion {
    // a function which will call itself until the condition is met 
    public static void print(int n ){
        if(n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
     public static void main(String []args){
        System.out.println("-----recursion in java-----");
        
        print(5);

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers.length);

     }  
}
