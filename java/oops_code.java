public class oops_code {
 static class employee{
        private int id;
        private String name;
public int getid(){
return id;
}
public String getname(){
    return name;
    
}
public void setname(String n){
    name=n;
}
public void setid(int i){
    id=i;
}
    }
    public static void main(String[] args) {
        employee data = new employee();
        data.setid(18);
        data.setname("satrohan shah");
        System.out.println("Hi my name is "+data.getname()+" and my age is "+data.getid());
    }
}
