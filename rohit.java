class Test {
    int x,y;
    static int z;
    void setData(int a,int b,int c)
    {
      x=a;
      y=b;
      z=c;  
    }
    void display(){
        System.out.println("x:"+x);
        System.out.println("y:"+y);
        System.out.println("z:"+z);
    }
    static void show()
    {
        int k=z;
        System.out.println("k="+k);
    }
}
public class Rohit{
   public static void main(String []args]){
   Test m=new Test();
   Text l=new Test();
   Test g=new Test();
   m.setData(2,4,6);
   l.setData(44,6,77);
   g.setData(33,5,66);
   m.display();
   l.display();
   g.display();
   Test.show();
   
     
    
   }}