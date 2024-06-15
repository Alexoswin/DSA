

class Llist {
      class Node{
        String data;
        Node  next;

        Node(String data){
            this.data = data ;
            this.next  = null;
        }
      }
      public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
      }
        public void addLast(String data){
          Node newNode = new Node(data);
          if(head == null){
              head = newNode;
              return;
          }
          Node currNode  = head;
          while ( currNode.next  != null ) {
            currNode.next = newNode;
            
          }
        }

        public void printlist(){
          Node currNode  = head;
          while ( currNode.next  != null ) {
            System.out.println(currNode.data + " ->")
            currNode.next = newNode;
            
          }

        }

      public static void main (String args[]){
         
        Llist list = new Llist();
        list.addFirst("a");
        list.addFirst(" is");

      }
}
