
        /* method overriding with inheritance and cunstructor in inheritance and use of this and super in java*/

public class inheritanceinjava {
    static class base {
             /* cunstructor in inheritance */
              int x;

        base(int x){
            System.out.println("i am cunstructor of base"+x);
            this.x=x;
        }

    public void s1(){
        System.out.println("this is s1 of base");
    }
        
    }
    /* code with inheritance */
    static class optional extends base{
        optional(int c){
            super(c);
            System.out.println("i am cunstructor of optional"+x);
        }
        /*method overriding */
        public void s1(){
            System.out.println("this is s2 of optional");
        }
    public void s2(){
        System.out.println("hello i am s2 of optional");
    }
        
    }
    public static void main(String[] args) {

        base g=new base(45);
        g.s1();
        optional o=new optional(18);
        o.s1();
        o.s2();

    }
}
