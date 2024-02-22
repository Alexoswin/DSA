public class tower{

        public static void Tower(int n , String src, String helper ,String  dest){
            if(n ==1 ){
                System.out.println("transfer disk no"+ n + " from " + src + " to " + dest);
                return;
            }

            Tower(n-1, src, dest, helper);
            System.out.println("transfer disk no"+ n + " from " + src + " to " + dest);
            Tower(n-1, dest, src, helper);
        }

    public static void main(String[] args) {
        System.out.println("Tower of hanoi");
        Tower(2, "S", "H", "D");
        


    }
}  