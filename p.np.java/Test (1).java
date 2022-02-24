import java.io.*;

public class Test {
   public static void main(String[] args)throws IOException {
       Student s[]=new Student[5];
       int i,id;
       String n,c;
       double f;
       DataInputStream obj = new DataInputStream(System.in);
       for(i=0;i<5;i++){
           System.out.println("Enter"+(i+1)+" Student Details");
           s[i]=new Student();
           id=Integer.parseInt(obj.readLine());
           n=obj.readLine();
           c=obj.readLine();
           f=Double.parseDouble(obj.readLine());
           s[i].setStudentDetails(id, n, c, f);
       }
       
       for(i=0;i<5;i++){
           s[i].display();
       }
   }
    
}
