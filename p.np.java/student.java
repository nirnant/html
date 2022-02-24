public class Student {
    private int id;
    private String name;
    private String course;
    private double fees;
    
    void setStudentDetails(int id, String name, String course, double fees){
        this.id=id;
        this.name=name;
        this.course=course;
        this.fees=fees;
    }

    
    void display(){
        System.out.println("Name is:"+ this.name);
        System.out.println("Id is:"+ this.id);
        System.out.println("Course is:"+ this.course);
        System.out.println("Fees is:"+ this.fees);
    }

    Student(){
        id=0;
        name="";
        course="";
        fees=0;
    }

}
