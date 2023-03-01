import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scr.next();
        System.out.println("Hello " + name);
    }
}
