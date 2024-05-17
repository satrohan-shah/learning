
import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age here :)");
        int age =sc.nextInt();
        if(age>18){
            System.out.println("congrates you are ready to drive !");
        }
        else{
            System.out.println("enjoy");
        }
 
    }
}
