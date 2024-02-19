public class fibonacci {
    
    public static void calculate(int a, int b, int c , int n){
        if(n == 0){
            return;
        }


        c = a+b;
        System.out.print(c + " ");
        a =b;b = c;
        calculate(a, b, c, n-1);

        }
    public static void main (String[]args){
        System.out.println("---fibonacci series using recursion");
        
        int b = 1;
        int c = 0;
        int a = 0;
        int n = 7;
        System.out.print(a + " ");
        System.out.print(b + " " );
        calculate(a, b, c, n-2);
    }
}
