public class remove_dublicates{

    public static boolean[] map = new boolean[26];
 
    public static void  calculate(String str,int idx,String newstr ){

        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        char current = str.charAt(idx);
        if(map[current - 'a'] == true){
            calculate(str, idx +1, newstr );
        }
        else{
            newstr = newstr + current;
            map[current - 'a' ] = true;
            calculate(str , idx +1 , newstr);
        }

    }

    public static void main(String[] args){

        System.out.println("remove dublctas in a string using recursion ");
        calculate("adknandkadkadnnkww", 0, "");
    }
}