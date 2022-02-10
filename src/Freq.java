
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Freq  implements Command {


    public String name() {
        return "freq";
    }
    public boolean run(Scanner sc) {
        System.out.println("Choose a file !");
        String file = "";

            file = sc.next();
            try {
                String fd = Files.readString(Paths.get(file));


            String[] words = fd.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ");
            Arrays.stream(words).filter((str) -> !str.isBlank())
                    .collect(Collectors.groupingBy((str) -> str)).entrySet().stream()
                    .sorted(Comparator.comparingInt((e) -> -e.getValue().size())).limit(3)
                    .forEach((str) -> System.out.print(str.getKey() + " "));

            }catch (IOException e) {
                System.out.println("Unreadable file : " + e.getClass() + " " + e.getMessage());
            }
        return false ;
    }

}