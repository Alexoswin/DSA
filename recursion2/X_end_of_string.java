public class X_end_of_string {
    
    public static void calculate(String str, int idx , int count , String nstr){

        if(idx  == str.length()){

            for(int i =0; i<count; i++){
                nstr += 'x';
            }
            System.out.println(nstr);
            return;
        }
        char current = str.charAt(idx);
        if(current =='x'){
            count++;
            calculate(str, idx +1, count, nstr);
        }
        else{
            nstr =  nstr + current;
            calculate(str, idx +1, count, nstr);

        }
    }
    public static void main (String [] args){

        System.out.println("----- move x to the ennd of string ");
        String str = "axsxdxjdsd";
        calculate(str, 0, 0, null);
    }
}
