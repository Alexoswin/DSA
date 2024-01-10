import java.util.Scanner;
import java.util.Arrays;
public class insertion_sort {
    public static void main (String[] args ){
        System.out.println("----- insertion sort in java-----");
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
        
        for(int i = 0; i<A.length; i++){
            int current = A[i];
            int j = i-1;
            while(j>=0 && A[current] < A[j]){
                A[j+1]= A[j];
                j--;
            }
            A[j+1]=current;
        }
        System.out.println();
        for(int i = 0 ; i<A.length; i++){
            System.out.print(A[i] + " ");
        }

    }
}
