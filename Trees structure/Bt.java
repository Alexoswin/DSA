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

        public static int countNodes(Node root){

            if(root == null ){
                return 0;
            }
           


            return countNodes(root.left)+ countNodes(root.right) +1 ;
        }


        public static int SumNodes(Node root){

            
            if(root == null ){
                return 0;
            }
           


            return SumNodes(root.left)+ SumNodes(root.right) + root.data ;
        }


        public static int treeHeight(Node root){

            if(root == null ){
                return 0;
            }

            return Math.max(treeHeight(root.left) , treeHeight(root.right)+1);
        }
           
        public static int Diamater(Node root){
                if(root == null){
                    return 0;
                }
            int d1 = Diamater(root.left);
            int d2 = Diamater(root.right);
            int d3 = treeHeight(root.left)+ treeHeight(root.right) +1;
            
            return Math.max(d3, Math.max(d3, d2));
            
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
        

        
        System.out.println();
        System.out.println(" num of nodes ");

       System.out.println( tree.countNodes(root));


       
       System.out.println();
       System.out.println(" sum of nodes  ");

       
       System.out.println(tree.SumNodes(root));


       
       System.out.println();
       System.out.println(" height of the tree ");

       System.out.println(tree.treeHeight(root));

    
       System.out.println();
       System.out.println(" Diamater ");

       System.out.println(tree.Diamater(root));

     }
}