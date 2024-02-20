public class tut{

        public static void calculate(int x, int i, int ans ){
            if (i ==x ){
                System.out.println(ans);
                return;
            }

            ans = ans * x;
            calculate(x, i + 1, ans);           

        }

    public static void main (String []args ){
        System.out.println("----- X^X using recursion in java -----");
            calculate(7, 0,1);
    }
}