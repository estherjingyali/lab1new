import java.util.Scanner;
import java.util.Date;

public class HelloWorld {

    private String greeting;

    public HelloWorld(String g) {
       System.out.println("Hello, World!");
       this.greeting = g;
    }

    public String getGreeting() {
        return greeting;
    }

    public static void main (String[] args) {
        HelloWorld helloworld = new HelloWorld("What is your name?");
        System.out.println(helloworld.getGreeting());

        Scanner sc =new Scanner(System.in);
        String str = sc.next();
        System.out.println("Welcome,"+" "+str+".");

        //set real time
        Date d = new Date();
        System.out.println(d);

    }
}