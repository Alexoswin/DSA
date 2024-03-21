import java.util.HashSet;

public class unique_subsequences {
        // hash set is a data structure which can only have unique values
    public static void calculate( String str,  int idx, String newstr,HashSet<String> set){
        if(idx == str.length()){
            
            if(set.contains(newstr)){
                return;
            }
            else{
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }
       

        char current = str.charAt(idx);

        calculate(str, idx +1, newstr +  current, set);
        calculate(str, idx+1, newstr, set);


    }
    public static void main (String[]args){
        System.out.println("unique subsequences of a string");

        HashSet<String> set = new HashSet<>();
        calculate("aaa",  0, "",set);
    }
    
}
