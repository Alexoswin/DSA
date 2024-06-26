import java.util.Arrays;
public class quick_sort {


    public static int partition(int arr[] , int low , int high){

            int pivot = arr[high];
            int i = low -1;

            for(int j = low ; j<high;j++){

                if(arr[j]<pivot){

                    i++;
                    //swap
                    int temp = arr[i];

                    arr[i] =arr[j];
                    arr[j] = temp;
                }

            }
            i++;
            int temp  = arr[i];
            arr[i]= pivot;
            arr[high]= temp;
            return i;// pivot  index
    }

    public static void sort(int arr[], int low , int high){
        if(low< high){

            int pidx = partition(arr, low ,high);

            sort(arr, low, pidx-1);
            sort(arr, pidx+1, high);

        }
        
         

    }
    

    public static void main(String []args){
        int[] arr = {2,23,1,54,44,1,2,43,7,6,9,23};
        int n = arr.length; 

        sort(arr, 0, n-1);

        for(int i = 0 ;i<n; i++){

            System.out.println(arr[i]+" ");
        }
    }
    
}
