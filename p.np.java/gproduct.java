import java.io.*;
class Gproduct{
	String pname;
	double mrp;
	float discount=10;
	Gproduct()throws IOException{
		DataInputStream obj=new DataInputStream(System.in);
	System.out.println("enter any five product");
	pname= obj.readLine();
    mrp=Double.parseDouble(obj.readLine());
    discount=Float.parseFloat(obj.readLine());
	}
    Gproduct(String p,double m,float d){
        pname=p;
        mrp=m;
        discount=d;
    }
	void display()
	{
System.out.println("pname="+pname);
System.out.println("mrp="+mrp);
System.out.println("discount="+discount);
	}
}
class Testproduct
{
	public static void main(String[] args)throws IOException 
	{
        Gproduct l[]=new Gproduct[5];
		for(int j=0;j<5;j++){
			m[l]=new Gproduct();
        l[0]=new Gproduct("rr",456,683);
        l[1]=new Gproduct("ma",457,684);
		l[2]=new Gproduct("mag",458,685);
		l[3]=new Gproduct("magg",459,686);
		l[4]=new Gproduct("maggi",460,687);
		l[j].display();
    }
		
		
		Gproduct k[]=new Gproduct[5];
		for(int i=0;i<5;i++)
		{
			k[i]=new Gproduct();
		
		}
				System.out.println("_______________________________________________________________");
        for(int i=0;i<5;i++){
          k[i].display();}
	
        
        System.out.println("_______________________________________________________________");
        
		
	}
}
