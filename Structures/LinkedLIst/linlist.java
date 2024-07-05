import java.util.*;
public class linlist {
    public static void main (String []args){
        System.out.println("linked list package");

        LinkedList<String> List = new LinkedList<>();

        List.addFirst("Adsa");
        List.addLast("Dasda");
        List.addFirst("sda");
        System.out.println(List.size());
        System.out.println(List.get(2));
        List.removeFirst();
        List.remove(0);
        
        

        //Array list 
        ArrayList<String> ll = new ArrayList<>();
        ll.add("Asd");
        ll.add("sda");
        ll.add("dsad");

        System.out.println(ll.size());
        ll.set(0, "dsad");
        
        System.out.println(ll.get(2));



    }   
}
