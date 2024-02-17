
public class recursion {
    // a function which will call itself until the condition is met 
    public static void print(int n ){
        if(n==10){
            return;
        }
        System.out.println(n);
        print(n+1);
    }
     public static void main(String []args){
        System.out.println("-----recursion in java-----");
        
        print(1); 

     }  
}
