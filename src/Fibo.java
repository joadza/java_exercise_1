import java.util.Scanner;
import java.util.InputMismatchException;


public class Fibo  {

    public String get_name() {
        return "fibo";
    }

    public void run(Scanner sc) {
        System.out.println("Index fibonacci n = ?");

        int i = sc.nextInt();
        sc.nextLine();
        if (i == 0 || i == 1) {
            System.out.println(i);
            sc.close();
            return;
        }
        int reste = 1, fibo = 1;
        for (int j = 2; j < i; j++) {
            int temp = reste + fibo;
            reste = fibo;
            fibo = temp;
        }
        System.out.println(fibo);

        sc.close();
        return;
    }

}
