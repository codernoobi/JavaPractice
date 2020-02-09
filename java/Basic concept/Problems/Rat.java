import java.util.*;

class Rat {
    public static double log2(int x) {
        return (Math.log(x) / Math.log(2));
    }

    // Function to find the minimum number of rats
    static int minRats(int n) {
        return (int) (Math.floor(log2(n)) + 1);
    }

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of rats");
        n = in.nextInt();

        System.out.println("Minimum " + minRats(n) + " rat(s) are required");
    }
}