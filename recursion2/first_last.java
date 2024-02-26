public class first_last {
    
    public static int first = -1;
    public static int last  = -1;

 
    public static void calculate( String x, int idx , char element){
         
        if(idx == x.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

       char currchar  =x.charAt(idx);

       if(currchar == element){
         if(first == -1){
            first = idx;
         }
         else{
            last = idx;
         }
       }
      
       calculate(x, idx +1 , element);
    }
    public static void main(String []args){

        System.out.println(" to find the first and last accurance of a element in the string ");
        calculate("aadasdasadihihiiwaoa", 0, 'a' );

    }
}
