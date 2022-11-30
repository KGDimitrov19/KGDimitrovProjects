import java.util.Scanner;

public class Password {

    public void checkPassword(String password)
    {
        if(password.length()<10)
        {
            System.out.println("Your password must consist of at least 10 characters!");
        }
        int counter = 0;
        for(int i = 0; i < password.length(); i++)
        {
            if(Character.isDigit(password.charAt(i)))
            {
                counter++;
            }
        }
        if(counter<2)
        {
            System.out.println("Your password consist of at least two numbers!");
        }
        else
        {
            System.out.println("Password accepted!");
        }
        if(password.matches("(.*[@,#,$,%].*$)"))
        {
            System.out.println("Your password must not have special characters!");
        }


    }

    public static void main(String[] args) {

        String pass;
        Scanner scan = new Scanner(System.in);
        pass=scan.nextLine();

        Password obj1 = new Password();
        obj1.checkPassword(pass);

    }

}
