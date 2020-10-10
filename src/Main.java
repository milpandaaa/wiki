import java.net.URLEncoder;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
        Wikipedia wikipedia = new Wikipedia("Java");
        wikipedia.answerWikipedia();
        System.out.println(wikipedia.getRequest());

    }
}