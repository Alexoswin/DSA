import java.util.*;
public class reverseLinkedList {

     

    public static void main(String[] args) {
        System.out.println("revrse a linked list ");
        
        LinkedList<String> list = new LinkedList<>();

            list.add("this");
            list.add("is");
            list.add("a");
            list.add("LinkedList");
        LinkedList<String> newlist = new LinkedList<>();
        
        
     for(int i = list.size()-1; i>= 0 ; i--){

        newlist.add(list.get(i));
     }

     for(int i = 0 ; i< newlist.size(); i++){

        System.out.println(newlist.get(i));
     }
}
}