
import java.io.*;

class Book{
    int addition;
    String name;
    String author;
    Book(int a,String n,String au)
    {
addition=a;
name=n;
author=au;
    }
    Book()throws IOException
    {
        DataInputStream obj=new DataInputStream(System.in);
        System.out.println("enter the aditiion ,name,author");
        addition=Integer.parseInt(obj.readLine());
        name=obj.readLine();
        author=obj.readLine();

    }
    void display()
    {
        System.out.println("addition="+addition);
        System.out.println("name="+name);
        System.out.println("author="+author);
    }
}
class Testbook{
    public static void main(String[] args)throws IOException {
    Book obj1=new Book(9,"math","RS.Agraqal");
    Book obj=new Book();
    obj1.display();
    obj.display();
    }
}


