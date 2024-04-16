import java.util.ArrayList;
public class pSubsets{

    public static void nsubsets(ArrayList<Integer> subsets){

        for(int i = 0; i<subsets.size();i++){

            System.out.print(subsets.get(i)+ "");
        }
        System.out.println();
    }

    public static void calculate(int n , ArrayList<Integer> subsets){

        if(n == 0){
            nsubsets(subsets);
            return;
        }

        subsets.add(n);
        calculate(n-1, subsets);

        subsets.remove(subsets.size()-1);
        calculate(n-1,subsets);
    }

    public static void main(String[]args){

        System.out.println("print subsets of n natural numbers");

        int n = 3;
        ArrayList<Integer> subsets = new ArrayList<Integer>();
        calculate(n,subsets);
    }
}