import java.io.*;
class Worker{
 String name;
   int id;
    double salary;
    void addworker()throws IOException{
        DataInputStream obj =new DataInputStream(System.in);
        System.out.println("enter the worker");
        name=obj.readLine();
        id=Integer.parseInt(obj.readLine());
        salary=Double.parseDouble(obj.readLine());
}
void display(){
    System.out.println("name="+name);
    System.out.println("id="+id);
    System.out.println("salary="+salary);
}
}
public class testworker{
     public static void main(String[] args)throws IOException {
        Worker m[]=new Worker[5];
        for(int i=0;i<5;i++)
        {
m[i]=new Worker();
m[i].addworker();
        }
        for(int i=0;i<5;i++){
            System.out.println("_______________________________________");
         m[i].display();
               System.out.println("___________________________________");

            }
            
            

        
     }
}
