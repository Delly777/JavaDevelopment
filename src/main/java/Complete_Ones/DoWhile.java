package Complete_Ones;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ArrayList;
public class DoWhile {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        String name = "";
        String answer = "";
        do {
            System.out.println("Enter guest name: ");
            name = scan.nextLine();
            System.out.println("Do you want to conitinue: ? ");
            answer = scan.nextLine();
        } while (answer.equals("yes") || answer.equals("Yes") || answer.equals("YES"));
    }
}


