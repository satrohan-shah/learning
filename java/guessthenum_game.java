import java.util.Random;
import java.util.Scanner;
public class guessthenum_game {
   public static class game{
        public int number;
        public int noofguessnum;
        public static int num;

        public  game(){
            Random rand=new Random();
            number=rand.nextInt(100);
        }
        public static void num(){
            System.out.println("guess the number");
            Scanner sc=new Scanner(System.in);
            num=sc.nextInt();
        } 
        public int getnoofguessnum(){
            return number;
        }
        public int setnoofguessnum(int n){
                 this.number=n;
            return number;

        }
       boolean check()
        {
         if(num==number){
            System.out.println("you guess the correct number");
            return true;
            }
            else if(num<number){
                System.out.println("to less......");
            }
            else if(num>number){
                System.out.println("to high........");
            }
        return false;
        }

    }
    public static void main(String[] args) {
game g=new game();
boolean b=false;
while (!b) {
    g.num();
    b=g.check();
System.out.println(b);
}
  
    }
}
