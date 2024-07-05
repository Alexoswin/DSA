public class Lstack {
    
    Node peak;
   class Node{


    String  data ;
    Node next;

    Node(String data){
        this.data = data;
        this.next = null;
    }
   }    

   public void push(String data){

    Node newNode = new Node(data);

    if(peak == null){

        peak = newNode; 
        return;
    }


    newNode.next = peak;
    peak = newNode;
   }

   public void pop(){

    if(peak == null){

        System.out.println("Stack is empty ");
        return;
    }
    if(peak.next == null){
        peak = null;
    
    }
    peak = peak.next ;
     
   }
 
   public void top(){
    if(peak == null ){
        System.out.println("Stack is empty");
        return;
    }

    System.out.println(peak.data);
   }

   public void printStack(){
    if(peak == null){
        System.out.println("Stack empty");
         return;
    }
    Node curr = peak ;
    System.out.println(" Start");
    while(curr != null){
        System.out.print(curr.data + "->");
        curr = curr.next;
    }
    System.out.println("end");
    
   }

   public static void main(String [] args){
        System.out.println(" Implementing stack using linked list ");

        Lstack  stac = new Lstack();
        stac.push("one ");
        stac.push("two");
        stac.push("three");
        stac.push("four");
        stac.push( "five");

        stac.printStack();

        stac.pop();
        stac.printStack();
        stac.top();


   }

}
