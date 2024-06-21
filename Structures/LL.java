class LL{

Node head;
    class Node {
        String data;
        Node next;

        Node(String data){

            this.data = data;
            this.next = null;
        }

    }
// ADD  - FIRST AND LAST 
    public void addFirst(String data){
        Node newNode  = new Node(data);

        if(head == null){

            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){

        Node newNode  = new Node(data);

        if(head == null){

            head = newNode;
            return;
        }

        Node curNode = head;

        while(curNode.next != null){

            curNode = curNode.next;
        }

        curNode.next = newNode;
    }
     public void printList(){
        
       if(head == null){
        System.out.println("list is empty");
       }
        Node curNode = head;

        while(curNode != null){
            System.out.print(curNode.data + " -->");
            curNode = curNode.next;
        }

        
     }

    public static void  main (String args[]){

        LL list = new LL();

        list.addFirst("abc");
        list.addFirst("Def");
        list.addLast("xyz");
        list.addFirst("123");
        list.addLast("hhh");
        list.printList();



    }
  
}