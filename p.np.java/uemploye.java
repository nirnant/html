

import java.io.*;
 class Uemploye{
    int id;
    String name;
    double sallary;
    void employe()throws IOException
    {
        DataInputStream obj=new DataInputStream(System.in);
        System.out.println("enter any emp");
id=Integer.parseInt(obj.readLine());
name=obj.readLine();
sallary=Double.parseDouble(obj.readLine());


    }
    void display(){
        System.out.println("id="+id);
        System.out.println("name="+name);
        System.out.println("sallary="+sallary);
    }

class Testemploye{
    public static void main(String[] args)throws IOException {
        Uemploye k=new Uemploye();
    
        k.employe();
        k.display();
    }
}
