import java.util.Scanner;
public class switch_con {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age =sc.nextInt();
        switch(age){
            case 18: 
            System.out.println("you are eligible");
            break;
            case 40:
            System.out.println("you are experienced");
            break;
            case 56:
            System.out.println("do hard work");
            break;
            default:
            System.out.println("enjoy");
            break;
        }
    }
}
