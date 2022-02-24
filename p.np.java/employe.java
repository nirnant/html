import java.io.*;

class Employe {
    int id;
    double sallary;
    String name;

    void employe() throws IOException {
        DataInputStream obj = new DataInputStream(System.in);
        System.out.println("enter 5 employe");
        sallary = Double.parseDouble(obj.readLine());
        id = Integer.parseInt(obj.readLine());
        name = obj.readLine();
    }

    void display() {
        System.out.println("sallary=" + sallary);
        System.out.println("id=" + id);
        System.out.println("name=" + name);

    }
}

class TestEmploye {
    public static void main(String[] args) throws IOException {
        Employe k[] = new Employe[5];
        for (int i = 0; i < 5; i++) {
            k[i] = new Employe();
            k[i].employe();

        }
        for (int i = 0; i < 5; i++) {
            if (k[i].sallary > 5000)

                k[i].display();
        }
    }
}