package Constructor;

public class CoursePara {
    String name;
    int duration;

    CoursePara(String name ,int duration)
    {
        System.out.println(name);
       this.name=name;//instance = local
        this.duration=duration;
       // System.out.println("Para Constructor is called....");
    }

    public static void main(String[] args){
       // System.out.println("before object creation");
        CoursePara c1 = new CoursePara("java",5);
        CoursePara c2 = new CoursePara("Devops",4);
        CoursePara c3 = new CoursePara("DSA",2);
        System.out.println(c1.name);
        System.out.println(c1.duration);
        System.out.println(c2.name);
        System.out.println(c2.duration);
        System.out.println(c3.name);
        System.out.println(c3.duration);

    }
}
