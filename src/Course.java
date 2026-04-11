public class Course {
    String name;
    int duration;

    Course()
    {
        System.out .println("Constructed called....");
    }

    public static void main(String[] args){
        System.out.println("before object create");
        Course c=new Course();
        c.name="java full stack";
        System.out.println("after object create");
       // c.learn(c);
        Course c2=new Course();
        c2.name="Devops";
        c.learn(c2);
    }
    //here we are passing course obj in method
    public void learn(Course c){
        System.out.println("we are learning "+c.name);
    }
}
