package HashMap;

import java.util.*;
public class Hashing {
    
public static void main (String [] args ){

        System.out.println("hashmap in java");
        // IN HASH MAP   you can store a key and a value pair

        HashMap<String, Integer> map = new HashMap<>();
        
        // insertion in hashmap

        map.put("india" , 120);
        map.put("us",12 );
        map.put("UK" , 32);
        map.put("china" , 12);

        System.out.println(map);
        // updating values 
        map.put("china" ,24);
        System.out.println(map);


        //search operation
        System.out.println( map.containsKey("ads"));
        System.out.println( map.containsKey("india"));


        System.out.println(map.get("india"));


        // itteration in mashmap        

System.out.println(" MAP ITTERATION ");
        for(Map.Entry<String, Integer> val : map.entrySet()){
                        System.out.println(val.getKey() + " "  + val.getValue());
        }

         
}
}
 