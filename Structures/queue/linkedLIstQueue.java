
class linkedListQueue{

        
       static class Node{

            int data;
            Node next;

            Node(int data){

                this.data = data;
                this.next = null;
            }
        }

        static class queue{

            static Node head = null;
            static Node tail = null;


            public static boolean isEmpty(){

                return head == null && tail == null;
            }

            // push 
            public static void add(int data){
                Node newnode = new Node(data);
                if(tail == null){

                       tail= head  = newnode;
                        return;
                }
                tail.next = newnode;
                tail = newnode;
                return;

            }


            public static int pop(){

                if(isEmpty()){
                    System.out.println("queue is empty cant pop");
                    return -1;
                    
                }
                    int temp = head.data;
                if(head == tail){
                    
                    head = tail = null;
                    
                }
                else{
                    head = head.next;
                }
                return temp;
            }

            public static int peek(){

                if(isEmpty()){
                    System.out.println("queue is empty cant pop");
                    return -1;
                }

                return head.data;
            }
        }
    
    public static void main(String[] args){


        System.out.println("queue using linked list");

        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){

            System.out.println(q.peek());
            q.pop();
        }

    }

}