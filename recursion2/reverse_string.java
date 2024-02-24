public class reverse_string {

    public static void calculate(int i, String r){

        if(i == 0){
            System.out.print(r.charAt(i));
            return;
        }
        
        
    System.out.print(r.charAt(i));

    calculate(i-1, r);
    }

 
    public static void main(String[] args){
        System.out.println("-----reverse string using recursion -----");
        calculate(4, "OSWIN");
    }
}