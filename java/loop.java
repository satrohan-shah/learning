import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter digit");
        int num=sc.nextInt();
System.out.println("thanks your loop is here");
       
             //while loop
        /* 
        while(num<=5){
            System.out.println(num++);
        }
        */
                   //do while loop
                   /* 
                   do{
                    System.out.println(num++);
                   }
                   while(
                    num!=20
                   );
                   */
                  //for loop
                 for(num=1;num!=20; num++){
                    System.out.println(num++);
                 };

    }
}
