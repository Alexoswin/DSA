import java.util.Scanner;
import java.util.Arrays;
public class array {

     public static void main (String []args){
        System.out.println("------- Arrays -------");
        Scanner input = new Scanner(System.in);
        System.out.println(" press 1 to create a Array");
        System.out.println("Insert 2 to create a 2D Array");
         
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
        else if (inputs ==2){
            
            Scanner sc2 = new Scanner(System.in);
            System.out.println("enter the rows for the 2D array ");
            byte rows = sc2.nextByte();
            Scanner sc3 = new Scanner(System.in);
            System.out.println("enter the colums for the 2D array");
            byte columns = sc3.nextByte();

            int [][] B = new int[rows][columns];

            for(int i = 0;i<rows ; i++){

                for(int j=0 ;j<columns ; j++){

                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("enter the element for index " + i + ", " + j);
                    B[i][j] = sc4.nextInt();
                }
            }

             for(int i = 0;i<rows; i++){

                for(int j=0 ;j< columns; j++){

                    System.out.print(B[i][j]+ " ");
                }
                System.out.println();

            }
            System.out.println("-------finished-------");

               
        }
        else{
            System.out.println("press a valid number");
        }

     }

}