import java.util.Scanner;

public class Launcher {


    public static final String[] COMMANDS = { "quit","fibo"};

    public static void main(String[] args) {
        System.out.println("Bienvenue dans ce merveilleux monde de java .");
        Scanner sc = new Scanner(System.in);
        String lecteur = "";
        String cmd = null;
        do {
            lecteur = sc.nextLine();
            cmd = null;
            for(String c : COMMANDS) if(c.contentEquals(lecteur)) {
                cmd = c;
                break;
            }

            if(cmd == null) {
                System.out.println("Unknown command");
            }
            if(cmd == "fibo")
            {
                Fibo coco = new Fibo();
                coco.run(sc);
            }
        } while(cmd == null );
        sc.close();
    }
}