import java.util.Scanner;
public class Average {

    Scanner sc = new Scanner(System.in);

    public int N;
    int[] a ;


    public void average(int N) {
        this.N = N;
        a = new int[N];
        int sum = 0;
        System.out.println("Enter the numbers : ");
        try {
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
                if (a[i] < 0) {
                    throw new NegativeException("Negative number denied...");
                }
                sum = sum + a[i];
            }
            if (N == 0) {
                throw new EmptyException("the array is empty");
            }
            double avg = (double) sum/N;
            System.out.println("Average is : " + avg);

        }catch(NegativeException| EmptyException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}