import java.util.Scanner;

public class CheckString {
    public void checkName(String name) {
        if (name.length() < 2 ||  name.matches("(.*[@,#,$,%].*$)")) {

            System.out.println("This name is too short, or isn't with letters only");

        }
        else {
            System.out.println("Name approved!");
        }

    }

    public static void main(String[] args) {

        String name;
        Scanner scan = new Scanner(System.in);
        name = scan.nextLine();

        CheckString obj1 = new CheckString();
        obj1.checkName(name);

    }
}
