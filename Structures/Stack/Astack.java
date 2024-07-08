import java.util.*;
public class Astack {
    static class Stacks{
       public static ArrayList<Integer> list = new ArrayList<>();

        public static Boolean isEmpty(){
            return list.size()==0;
        }


        public static void push (int data ){
            list.add(data);
        }
    
    
        public static int pop(){
                if(isEmpty()){
                    return -1;
                }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peak(){
            if(isEmpty()){
                return -1;
            }

            return list.get(list.size()-1);
        }
    }

        public static void main (String []args){

            System.out.println("stack implemented using arraylists ");

            Stacks s = new Stacks();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);

            while(!s.isEmpty()){
                System.out.println(s.peak());
                s.pop();
            }
        }
        
}
