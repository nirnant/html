class Leptop{
    int w;
    double mrp;
    String name;
    Leptop(int w,double mrp,String name){
        this.w=w;
        this.mrp=mrp;
        this.name=name;
    }
    Leptop(){
        System.out.println("hii");
    }
    void display(){
        System.out.println("w"+w+"mrp"+mrp+"name"+name);
    }
}

