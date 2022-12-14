import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Gosho");
        Mammal person2 = new Person("Pesho");
        Animal person3 = new Person("Stamat");
        person1.eat();
        person1.walk();
        person1.sleep();
        if(person2 instanceof Person)
        {
            ((Person) person2).sleep();
        }
        person2.walk();
        person3.eat();
    }
}