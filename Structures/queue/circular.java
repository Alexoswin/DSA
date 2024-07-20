public class circular{

public static class circularQueue{

 static  int arr[];
 static int front = -1;
 static int rear = -1 ;
static int size;



// constructor 

circularQueue(int size){

    arr = new int [size];
    this.size = size;
  
}


public static boolean  isEmpty(){

   return rear ==-1 && front ==-1;

}

public static void push(int data){
   if(rear%size +1 == front % size || rear == size && front == -1){

    System.out.println("queue is full");
    
   }
   else{
    rear = (rear +1)% size;
    arr[rear] = data;


   }



}


public static int pull(){


    if(isEmpty()){
        return -1;
    }
    int temp = arr[front];
    front = (front +1) % size;
    return temp;
}


public static int peek(){


    if(isEmpty()){
        return -1;
    }
    return arr[front];
}



}

public static void main(String [] args){


    System.out.println("circular queue using array");
     circularQueue  q = new circularQueue(5);

     q.push(1);
     q.push(2);
     q.push(3);
     q.push(4);


     while(!q.isEmpty()){

            System.out.println(q.peek());
            q.pull();

     }


}
}