import java.util.Scanner;

public class FibonacciThread extends Thread {
    private int[] fibArray;
    private int num;

    public FibonacciThread(int num, int[] fibArray) {
        this.num = num;
        this.fibArray = fibArray;
    }

    public void run() {
        fibArray[0] = 0;
        if (num > 1) {
            fibArray[1] = 1;
        }

        for (int i = 2; i < num; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int num = scanner.nextInt();
        scanner.close();

        int[] fibArray = new int[num];

        FibonacciThread fibThread = new FibonacciThread(num, fibArray);
        fibThread.start();
        fibThread.join();

        System.out.print("Fibonacci sequence: ");
        for (int i = 0; i < num; i++) {
            System.out.print(fibArray[i] + " ");
        }
        System.out.println();
    }
}
