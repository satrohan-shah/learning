package learning.java;
import java.util.Scanner;
public class percentagecalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("physics ke number");
        float physics = sc.nextFloat();
        System.out.println("bio ke number");
        float bio = sc.nextFloat();
        System.out.println("hindi ke number");
        float hindi = sc.nextFloat();
        System.out.println("english ke number");
        float english = sc.nextFloat();
        System.out.println("chemistry ke number");
        float chemistry = sc.nextFloat();
        float res = (hindi+bio+physics+english+chemistry)/5;
        System.out.println(res);

    }
}
