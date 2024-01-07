import java.util.Arrays;
import java.util.Scanner;
public class bubble_sort {
    public static void main(String [] args){
        System.out.println("----- Bubble sort in java -----");
        
        // creating a array using users input

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
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

          for(int i = 0; i < A.length -1 ; i++){
            for(int j =0; j<A.length -i -1 ; j++){
                    // Swaping 
                    // time complexity = O(n^2) 
                if(A[j]>A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
          }
          System.out.println("Sorted Array ");
           for(int i = 0; i < A.length; i++){
            System.out.print(A[i]+ " ");
        }
          



    }
    
}
