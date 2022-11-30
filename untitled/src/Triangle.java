import java.util.Scanner;

public class Triangle {

    public static void heoron()
    {
        Scanner scan = new Scanner(System.in);
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        double c=scan.nextDouble();

         double p = (a+b+c)/2;
         double S=Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("The area is "+ S);
    }

    public static void main(String[] args) {

        System.out.println("Input a, b and c ");

        heoron();

    }
}
