import java.util.*;
public class graph{
    // class to store edges sorce source and destination
    class Edge{

        int s;
        int d;

        Edge(int s, int d){
            this.s = s ;
            this.d = d;
        }
    }

    public void createGraph(ArrayList<Edge> graph[]){
        

        for(int i = 0 ; i< graph.length ; i++){

            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 3));
        
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));

    }
    public static void main (String [] args ){
        System.out.print(" graph using adjencicy list");

        ArrayList<Edge> graph[] = new ArrayList<>[4 ] ;


        

    }
}