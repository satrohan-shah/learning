import java.util.Scanner;

public class continue_con {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num");
        int a=sc.nextInt();
        while (a!=20) {
            System.out.println(++a);
            if(a==2){
                System.out.println("good work");
                continue;
            } 
        }
    }
}
