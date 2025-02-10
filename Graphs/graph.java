import java.util.*;

public class  graph{
    
 static class  edge{

        int src;
        int dest;

        edge(int src , int dest){
            this.src = src;
            this.dest = dest;

        }
    }


    public static void createGraph(ArrayList<edge> graph[]){


        for(int i = 0 ; i< graph.length ; i++){

            graph[i] = new ArrayList<edge>();
        }


        graph[0].add(new edge(0,1));
        graph[0].add(new edge(0,2));


        graph[1].add(new edge(1,2));
        graph[1].add(new edge(1,3));

        graph[2].add(new edge(2,3));
        graph[2].add(new edge(2,1));
        

        graph[3].add(new edge(3,2));
        graph[3].add(new edge(3,1));
    }


    public static void main (String [] args){
        System.out.println("Graphs using adjuscent list");

        ArrayList<edge> graph[] = new ArrayList[4];
        createGraph(graph);

        // print neighbours of each node 
        for(int i = 0 ; i< graph.length ; i++){
         
        
            System.out.print("node: " + i + ": ");
            
            for(int j = 0 ; j< graph[i].size(); j++){

                System.out.println("src: " + graph[i].get(j).src + " -> " + "Dest: " + graph[i].get(j).dest);
            }
            System.out.println();
        }

    }
}