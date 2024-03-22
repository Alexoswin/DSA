public class Keypad{

    public static String[] keypad = {"." , "abc", "def", "ghi" , "jkl" , "mno" , "pqrs" ,"tu" ,"vwx", "yz" };

        public static void calculate(String str , int idx , String combination){

            if(idx == str.length()){
                System.out.println(combination);
                return;
            }
            char current = str.charAt(idx);
            String mapping = keypad[current - '0'];


            for(int i = 0 ; i< mapping.length();i ++){

             calculate(str, idx +1, combination + mapping.charAt(i));
            

            }


        }

    public static void main(String[]args){


        System.out.println(" keypad combinations ");

            calculate("23", 0, "");
    }
}