import java.util.Stack;
public class qStack{


        static class Queue{

           static Stack<Integer> A = new Stack<>();
            static Stack<Integer> B = new Stack<>();


            public static boolean isEmptys(){

                return A.isEmpty();
            }



            public static void add(int data){

                    

                    while(!A.isEmpty()){

                        B.push(A.pop());
                    }           
                    A.push(data);
                     while(!B.isEmpty()){

                        A.push(B.pop());
                    } 
            }


            public static int remove(){

            

                return A.pop();
            }


            public static int pek(){
                 

                return A.peek();
            }



        }
    public static void main(String [] args){


        System.out.println(" implementing queue using 2 stacks");


        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmptys()){

            System.out.println(q.pek());
            q.remove();
        }
    }
}