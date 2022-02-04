package LeetCode;

public class Totalsubset {
    public static void main(String[] args) {
        char set[] = {'a', 'b', 'c'};
        printSubsets(set);
    }

    static void printSubsets(char set[]) {
        int n = set.length;

        for (int i = 0; i < (1 << n); i++) {
            System.out.print("{ ");

            // Print current subset
            for (int j = 0; j < n; j++)


                if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + " ");

            System.out.println("}");
        }

    }
}