import java.util.Arrays;
public class array_sorted {
    
    public static boolean calculate(int idx, int lis[]){
         
        if(idx+1== lis.length){
            return true;
        }

        if(lis[idx]<= lis[idx+1]){

          return  calculate(idx+1, lis);
        }
        else{
            return false;
        }

        
    }

    public static void main(String []args){
        System.out.println("----- check if the array is soted or not -----");
        int lis[] = {2,344,12,43,1,5,56,978,12,43,2,5,6};   
        
        System.out.println( calculate(0, lis));

    }
}
