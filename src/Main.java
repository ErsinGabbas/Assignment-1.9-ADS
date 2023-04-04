import java.util.Scanner;

public class Main {
    //Function
    public static int binomCoffee(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binomCoffee(n-1, k-1) + binomCoffee(n-1, k);
        }
    }
    //Function work check
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int binom = binomCoffee(n, k);
        System.out.println(binom);
    }
}