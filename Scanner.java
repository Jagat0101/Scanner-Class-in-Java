
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("This is the first lesson of java");
        System.out.println("Here will learn Scanner class");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(a);
        
        System.out.println();
        System.out.println();
        
        String b = input.nextLine();
        System.out.println(b);
    }
    
}
