  import java.util.*;
 class Bt {

    static class Node{

        int data ; 
        Node left ;
        Node right ;

        Node(int data ){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

  static class Btree{

        static int idx = -1;

        public static Node BuildTree(int  nodes []){

            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            
            return newNode;

        }


        public static void preorder(Node root){
            if(root == null){
                return;
            }

            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            if(root == null){
                return;
            }

         
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }


        public static void postorder(Node root){
            if(root == null){
                return;
            }

         
            postorder(root.left);
            
            postorder(root.right);
            System.out.println(root.data);
        }

        // breath first search methoad 
        // level order traversal 
        public static void breathFirst(Node root ){

            if(root == null){
                System.out.println("empty tree");
                return;
            }
            Queue<Node> q = new LinkedList<>();

            q.add(root);
            q.add(null);

            while(! q.isEmpty()){
                Node curr = q.remove();

                if(curr == null){
                    System.out.println();

                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.println(curr.data + " ");

                    if(curr.left != null){
                        q.add(curr.left);
                        
                    }
                    if(curr.right != null ){
                        q.add(curr.right);
                    }
                }
            }


        }



    }
     public static void main (String [] args ){

        System.out.println("--- Binarry tree ---");


        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Btree tree = new Btree();
        Node root =  tree.BuildTree(nodes);
        System.out.println(root.data);

        tree.preorder(root);
        System.out.println(" ");
        System.out.println(" ");

        tree.inorder(root);

        System.out.println(" ");
        System.out.println(" ");


        tree.postorder(root);


        System.out.println();
        System.out.println();

        tree.breathFirst(root);

     }
}