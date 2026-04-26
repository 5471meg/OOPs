package Constructor;

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

        Student s2=new Student("Shivam",12);
        s2.studentDetails();
       s1.studentDetails();
       s2.hello(s2);
    }

    void studentDetails()
    {
        System.out.println("name " + name +" age "+age);
    }
    void hello(Student s2){
        System.out.println("hello"+s2.name );
    }
}
