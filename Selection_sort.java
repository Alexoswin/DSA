import java.util.Arrays;
import java.util.Scanner;

public class Selection_sort {
     public static void main(String[]args){
        System.out.println("----- Selection sort in java -----");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Emter the size for the array");
        int []A = new int[sc.nextInt()];
       
        for(int i = 0; i< A.length; i++){
            Scanner sc2 = new Scanner(System.in);
            System.out.println("enter the element for the " + i + " index position");
            A[i]= sc2.nextInt();
                        
        }
        System.out.println("Your array is");
        for(int i = 0; i < A.length; i++){
            System.out.print(A[i]+ " ");
        }
        System.out.println();
        System.out.println(" Sorting your array");  
     
        
        for(int i = 0 ; i<A.length - 1; i++){
          int smallest = i;

            for(int j = i+1;j<A.length ;j++){
               if(A[smallest]>A[j]){
                  smallest = j;
               }
               
              
            }
            int temp = A[smallest];
            A[smallest] = A[i];
            A[i] = temp;
         
        }
        System.out.println();
        for(int i = 0; i<A.length;i++){
         System.out.print(A[i] +" ");
        }



     }
}
