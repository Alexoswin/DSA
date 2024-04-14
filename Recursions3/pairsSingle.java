public class  pairsSingle{

    public static int calculate(int n){

            if(n ==1){
                return 1;
            }
            


        //single
       int single =  calculate(n-1);
       int pairs =( n -1) * calculate(n-2);
       return single + pairs;
    }

public static void main(String[]args){


    System.out.println("pairs and single combinations");
    calculate(4);
}
    
}