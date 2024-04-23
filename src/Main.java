import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner(System.in);
        Average a = new Average();
        int N = sc.nextInt();
        a.average(N);
    }
}