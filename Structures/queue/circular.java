public class circular {

    static class CQueue {
        static int size;
        static int front = -1;
        static int rear = -1;
        static int[] arr;

        CQueue(int size) {
            this.size = size;
            arr = new int[size];
        }


        public static boolean isEmpty(){

            if(front == -1 && rear == -1  ){

             return true ;
            }
            else{

                return false ;
            }
            
        }

        public static boolean isFull(){


            if((rear +1)% size == front){
                return true;
            }
            else{
                return false;
            }
        }


        public static int peek(){

            if(isEmpty()){

                return -1;
            }
            else{
                return arr[front];

            }
        }

        public static void push(int data){
                if(isFull()){
                    System.out.println(" queue is full");
                }

                if(front == -1){
                    front = 0;
                    
                    
                }

                
                    rear = (rear+1)% size;
                    arr[rear] = data;
                


        }

        public static int pop(){
            if(isEmpty()){
                System.out.println(" empty queue");
                return -1;
            }


            int temp = arr[front];
            if(front == rear){
                rear = front = -1;
            }
            else{
            front = (front +1)% size;

            }
            return temp;
        }
        
           
        

        

        
    }

    public static void main(String[] args) {
        System.out.println("Circular queue using array");

        CQueue q = new CQueue(4);

        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
       
       

                   while(!q.isEmpty()){

                        System.out.println(q.peek());
                        q.pop();
                   }
    }
}
