import java.util.Scanner;
import java.util.Date;

public class HelloWorld {
    private String greeting = "Hello, World!";
    public void greet()

    {
        System.out.println(greeting);
    }

    public static void main (String args[]) {
        Scanner sc =new Scanner(System.in);
        System.out.println("What is your name?");
        String str = sc.next();
        System.out.println("Welcome,"+" "+str+".");
        Date d = new Date();
        System.out.println(d);
        HelloWorld helloworld;
        helloworld = new HelloWorld ();
        helloworld.greet () ;
    }
}