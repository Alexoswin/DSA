public class permutations {

    public static void calculate(String str, String prefix) {

        if (str.length() == 0) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newSub = str.substring(0, i) + str.substring(i + 1);
            calculate(newSub, prefix + curr);
        }
    }

    public static void main(String[] args) {
        System.out.println("Print all the combinations of a string (permutations)");
        // Total number of permutations is n factorial
        // time complexity will be total number of permutations = n factorial 
        calculate("abc", "");
    }
}
