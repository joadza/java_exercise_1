
import java.util.Scanner;

public class Launcher {


    public static final  Command []  commando = {new Fibo(),new Freq(),new Predict(),new Quit()};

    public static void main(String[] args) {
        System.out.println("Bienvenue dans ce merveilleux monde de java .");
        Scanner sc = new Scanner(System.in);
        String lecteur = "";
        Command cmd = null;

        do {
            lecteur = sc.nextLine();
            cmd = null;
            for(Command aze : commando) if(aze.name().contentEquals(lecteur)) {
                cmd = aze;
                break;
            }

            if(null == cmd) {
                System.out.println("Unknown command");
            }

        } while(null == cmd || !cmd.run(sc) );
        sc.close();
    }
}