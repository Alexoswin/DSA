public class subsequence_of_string {

    public static void calculate(String str, int idx , String newstr){

        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        char current = str.charAt(idx);


        calculate(str,idx + 1 , newstr + current);
        calculate(str, idx+1, newstr);

    }
    public static void main(String[]args){

       


        System.out.println("print all subsequence of a string using java");
       String str = "abc" ;
       calculate(str,0,"");
    }
}
