import java.util.Scanner;

public class Launcher {


    public static final String[] COMMANDS = { "quit"};

    public static void main(String[] args) {
        System.out.println("Bienvenue dans ce merveilleux monde de java .");
        Scanner sc = new Scanner(System.in);
        String lecteur = "";
        String cmd = null;
        lecteur = sc.nextLine();
        cmd = null;
        for(String c : COMMANDS) if(c.contentEquals(lecteur)) {
            cmd = c;
            break;
        }
        if(cmd == null) {
            System.out.println("Unknown command");
        }

        sc.close();
    }
}