import java.util.Scanner;
import java.util.Arrays;
public class array {

     public static void main (String []args){
        System.out.println("------- Arrays -------");
        Scanner input = new Scanner(System.in);
        System.out.println(" press 1 to create a Array");
        System.out.println("Insert 2 to create a 2D array");
         
        byte inputs = input.nextByte();

        if(inputs ==1){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the size for the array");
        byte size = sc.nextByte();
        int[] A = new int[size];


        for(int i = 0 ; i <size; i++ ){
            Scanner element = new Scanner(System.in);
            System.out.println("Enter the element for the "+ i + " index position in the array");
            A[i] = element.nextByte();
        }
        System.out.println("your Array is ");
         for(int i = 0; i <size; i++){
            System.out.print(A[i] + " ");
         }
        System.out.println();
        
        System.out.println("------- finished -------");
        }

        else{
            System.out.println("press a valid number");
        }

     }

}