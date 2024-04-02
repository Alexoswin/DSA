public class test{
    public static void main(String[]args){
        
        String str = "ab";

     
        for(int i= 0 ; i < str.length(); i++){
           String nstr = str.substring(0,i)+ str.substring(i+1);
        System.out.println(nstr);  
        }
    }
}