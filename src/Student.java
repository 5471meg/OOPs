public class Student {
    String name;
    int age;

    Student()
    {
       this("Unknown",0);
    }

    Student(String name,int age){
        this.name=name;
        this.age=age;

    }

   public static void main(String[] args) {
        Student s1=new Student();
       // s1.studentDetails();

        Student s2=new Student("Ayush",12);
        s2.studentDetails();
       s1.studentDetails();
    }

    void studentDetails()
    {
        System.out.println("name " + name +" age "+age);
    }
}
