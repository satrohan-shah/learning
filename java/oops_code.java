public class oops_code {
    public static class employee{
        private int id;
        private String name;
public int getid(){
return id;
}
public String getname(){
    return name;
    
}
public void setname(String n){
    this.name=n;
}
    }
    public static void main(String[] args) {
        employee data = new employee();
        data.id=18;
        data.setname("");
        System.out.println(data.getname());
        System.out.println(data.getid());
    }
}
