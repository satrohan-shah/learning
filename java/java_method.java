public class java_method {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else{
            z=x-y;
        }
        return z;
    }
    
    public static void main(String[] args) {
        int a=50;
        int b=30;
        int c;
        c=logic(a,b);
        System.out.println(c);
    }
}
