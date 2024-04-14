public class  totalTilesPlaced{

    public static int calculate(int n , int m){

        if(n ==m){
            return m;

        }
        if(n<m){
            return 1;
        }

        int vertical = calculate(n -m , m);
        int horizontal = calculate(n -1 , m );
        return vertical +horizontal;
    }

    public static void main (String[]args){


        System.out.println("Total combinations of tiles placed in a nxm room");
        System.out.println(calculate(4,2));
    }
}