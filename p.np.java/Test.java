import java.io.*;

class Fruit {
    private double fprice;
    private String fname;

    Fruit(double fp, String fn) {
        fprice = fp;
        fname = fn;

    }

    Fruit(Fruit fruit) {
        System.out.println("copy constructor called");
        fprice = fruit.fprice;
        fname = fruit.fname;
    }

    double showprice() {
        return fprice;
    }

    String showname() {
        return fname;
    }
}

class Test {
    public static void main(String[] args) {
        Fruit f1 = new Fruit(333, "mango");
        System.out.println("name " + f1.showname());
        System.out.println("price " + f1.showprice());
        Fruit f2 = new Fruit(f1);
        System.out.println("price " + f2.showprice());
        System.out.println("name " + f2.showname());
    }
}
