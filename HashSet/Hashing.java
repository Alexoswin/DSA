import java.util.HashSet;


 class Hashing{

    public static void main(String []args){

        System.out.println("hash set in java");

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(0);
        set.add(2);



        if(set.contains(1)){
            System.out.println("true");
        }

        
    }
}