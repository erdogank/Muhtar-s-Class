package day36_Inheritance.scrumTeam;


import java.util.ArrayList;

public class AmazonInc {

    public static void main(String[] args) {


        ProductOwner PO = new ProductOwner();
        PO.setInfo("Adnan",23,'M');

        BusinessAnalyst BA = new BusinessAnalyst();
        BA.setInfo("Hüseyin",32,'M');

        ScrumMaster SM = new ScrumMaster();
        SM.setInfo("Metin", 38,'M');

        Tester tester1 = new Tester();
        Tester tester2 = new Tester();
        Tester tester3 = new Tester();
        Tester tester4 = new Tester();

        tester1.setInfo("Ayşe",25,'F');
        tester2.setInfo("Turan",29,'M');
        tester3.setInfo("Yasemim", 22, 'F');
        tester4.setInfo("Kerem", 24,'M');

        Developer developer1 = new Developer();
        Developer developer2 = new Developer();
        Developer developer3 = new Developer();
        Developer developer4 = new Developer();
        Developer developer5 = new Developer();

        developer1.setInfo("Ömer", 33, 'M');
        developer2.setInfo("Mine",27,'F');
        developer3.setInfo("Ali",33,'M');
        developer4.setInfo("Mithat", 34, 'M');
        developer5.setInfo("Yeşim",29, 'F');

        ArrayList<Developer> developers = new ArrayList<>();
        ArrayList<Tester> testers = new ArrayList<>();

        testers.add(tester1);
        testers.add(tester2);
        testers.add(tester3);
        testers.add(tester4);

        developers.add(developer1);
        developers.add(developer2);
        developers.add(developer3);
        developers.add(developer4);
        developers.add(developer5);




        ScrumTeam scrumTeam1 = new ScrumTeam();

        scrumTeam1.setInfo(PO,BA,SM,testers,developers);

        System.out.println(scrumTeam1);




    }
}
