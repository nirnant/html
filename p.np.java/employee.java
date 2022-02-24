import java.io.*;
class employee{
    
    String name;
    int id;
    int sallary;
    employee(String n,int i,int s){

name=n;
id=i;
sallary=s;
    }
    employee()throws IOException{
        DataInputStream obj=new DataInputStream(System.in);
        System.out.println("enter the name ,id ,sallary");

name=obj.readLine();
id=Integer.parseInt(obj.readLine());
sallary=Integer.parseInt(obj.readLine());

    }
    void display()
    {
       
        System.out.println("name="+name);
        System.out.println("id="+id);
        System.out.println("sallary="+sallary);
          }

}
class test
{
    public static void main(String[] args)throws IOException {
        employee obj= new employee();
        employee obj1=new employee("rajan",123,4500);
        obj.display();
        obj1.display();
    }
}
