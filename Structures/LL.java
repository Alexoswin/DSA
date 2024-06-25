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
        // pointing the new node to the head  and then making the new node  head 
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

     public void delete_first(){
        if(head == null){
            System.out.println("empty list");
            return;
        }
        head = head.next;
     }
     public void delete_last(){
        if(head == null){
            System.out.println("empty list");
        }
        if(head.next == null){
            head = null;
            return;
        }
        
            Node last = head.next;

            
            while(last.next.next != null){
                last = last.next;
                
            }
            last.next =null;
                
   
     }

     public void delete_form_between(String data){

        if(head == null){
            System.out.println("empty list");
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node  cu = head;
        while (cu.next.data != data) {
            cu = cu.next;
            
        }
        cu.next = cu.next.next;
     }

    public static void  main (String args[]){

        LL list = new LL();

        list.addFirst("abc");
        list.addFirst("Def");
        list.addLast("xyz");
        list.addFirst("xxx");
        list.addLast("hhh");
        list.addLast("Second_last_node");
        list.addLast("last");
        list.delete_first();
        list.delete_last();
        list.printList();
        System.out.println();
        list.addFirst("aadsad");
        list.addFirst("ammim");
        list.addFirst("knknknk");
        list.delete_form_between("aadsad");
        list.printList();
            



    }
  
}