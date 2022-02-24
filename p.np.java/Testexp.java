import java.io.*;

 class Ram {
    int x,y;
    Ram(int a,int b){
        x=a;
        y=b;
    }
    Ram(Ram t){
        x=t.x;
        y=t.y;
    }
    void display()
    {
System.out.println("x"+x);
System.out.println("y"+y);
    }
}
class Testexp{
    public static void main(String[] args)throws IOException {
        Ram m=new Ram(82,96);
Ram l=new Ram(4,6);
Ram n= new Ram(m);
m.display();
l.display();
n.display();
    }
}
