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


        public static void Bfs(ArrayList<edge> graph[]){
            

         boolean visit[] = new boolean[graph.length];
         Queue<Integer> q = new LinkedList<Integer>();
         q.add(0);

         while(! q.isEmpty()){



            int curr = q.remove();
            if(visit[curr]== false){
                System.out.println(curr);

                visit[curr]  =true;

                for(int i = 0 ; i< graph[curr].size(); i++){

                  edge e = graph[curr].get(i);
                  q.add(e.dest);
                    
                }
            }
         }

        }

    public static void main (String [] args){
        System.out.println("Graphs using adjuscent list");

        ArrayList<edge> graph[] = new ArrayList[4];
        createGraph(graph);

        
        Bfs(graph);

    }


}