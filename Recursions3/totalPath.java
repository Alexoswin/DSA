import java.util.Arrays;
public class totalPath{
    
    public static int calculate(int rows , int columns ,int n , int m){
        
            if(rows  ==n || columns == m ){
            
            return 0;
        }

         
        if(rows ==n -1 && columns  == m -1){
            
            return 1 ;
        }

        
        int rignt  = calculate(rows + 1 , columns,n,m);
        
        int down =  calculate(rows , columns + 1,n,m);

             return down + rignt ;   
        

        
        
    }

    public static void main(String[]args){

        System.out.println(" total paths from (0,0) to (n,m) in a matrix");
       int ans =   calculate(0, 0 ,5,5);
        System.out.println(ans);
        System.out.println(calculate(0, 0 ,3,3));

    }
}
