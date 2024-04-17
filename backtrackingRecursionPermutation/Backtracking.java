public class Backtracking{

    public static void calculate( String str , String str2, int idx){


        if( str.length() == 0){

            System.out.println(str2);
            return;
        }
        


        for(int i = 0 ; i<str.length(); i++){
            char current = str.charAt(i);

            String replace = str.substring(0,i)+ str.substring(i+1);
              
            calculate(replace,str2 + current, idx + 1) ;
        }
    }

    public static void main (String[]args){

        String  str = "abc";
        calculate(str,"",0);
    }
}
// time complexity = n*n! 