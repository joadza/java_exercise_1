import java.util.Scanner;


public class Fibo implements Command {

    public String name() {
        return "fibo";
    }

    public boolean run(Scanner sc) {
        System.out.println("Index ?");

        int i = sc.nextInt();
        sc.nextLine();
        if (i == 0 || i == 1) {
            System.out.println(i);
            sc.close();
            return false;
        }
        int reste = 1, fibo = 1;
        for (int j = 2; j < i; j++) {
            int temp = reste + fibo;
            reste = fibo;
            fibo = temp;
        }
        System.out.println(fibo);

        return false;
    }

}
