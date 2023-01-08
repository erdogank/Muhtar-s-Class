package day39_Recap.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Adnan",'M',48,33,70000);
        Developer dev1 = new Developer("Akif",'M',47,36,85000);
        Teacher teacher1 = new Teacher("Yusuf", 'M',35,45,90000);
        Student student1 = new Student("Ayşe",'F',20,36,"Medicine");

        tester1.work();
        System.out.println(tester1);

        System.out.println(student1);

        dev1.work();
        tester1.work();
        teacher1.work();
        //teacher1.setAge(-48);
        System.out.println(teacher1.getAge());


    }
}
