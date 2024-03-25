public class permutations {

    public static void calculate(String str , string new){

        
        for(int i = 0 ; i < str.length(); i++){

           char  current = str.charAt(i);
            
            String newsub = str.substring(0, i) + str.substring(i+1);

            calculate(newstr, new + current);
            
        }
    

    }

    public static void main(String[] args){


    System.out.println("print all the combinaations of a string (permutations)");
    // total number of permutations is  n factorial 
    calculate("abc", "");
}