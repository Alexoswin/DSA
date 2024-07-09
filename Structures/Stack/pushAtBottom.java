import java.util.Stack;
public class pushAtBottom {


    public static void PushAtBottom(int data, Stack<Integer> s){
            if(s.isEmpty()){
                s.push(data);
                return;
            }
      int top =   s.pop();
        PushAtBottom(data, s);

        s.push(top);

    }
     public static void main(String []args){

        System.out.println(" push at the bottom of the stack ");

        Stack<Integer>  s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        int data = 4;
        PushAtBottom(data , s);


        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    
     }      
}
