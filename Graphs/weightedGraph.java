import java.util.ArrayList;
public class weightedGraph{


    static class edge{
        int src ;
        int dest;
        int weight;


        edge(int src , int dest, int weight){
            this.src = src;
            this.dest = dest; 
            this.weight = weight;
        }



    }


    public static void createGraph(ArrayList<edge> graph []){

        for(int i = 0 ; i< graph.length ; i++){
            graph[i] = new ArrayList<edge>();

        }

        graph[0].add(new edge(0,1,10));
        graph[0].add(new edge(0,3,7));

        graph[1].add(new edge(1,0,32));

        graph[2].add(new edge(2,3,5));

        graph[3].add(new edge(3,0,8));
        graph[3].add(new edge(3,3,3));
    }

    public static void main (String[]args){

    ArrayList<edge> graph[] = new ArrayList[4];

    createGraph(graph);

    
    for(int i = 0 ; i<graph.length ; i++){
        for(int j = 0 ; j<graph[i].size(); j++){

        System.out.println(graph[i].get(j).src + " " + graph[i].get(j).dest + " " + graph[i].get(j).weight);
        }

    }
    }
}