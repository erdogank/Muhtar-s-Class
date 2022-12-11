package day37_Inheritance.scrumTask;

public class AmazonInc {

    public static void main(String[] args) {

        String company = "Amazon Inc";

        ProductOwner po = new ProductOwner("Ahmet", 29, 'M',1,160000,company);

        BusinessAnalyst ba = new BusinessAnalyst("Cihad", 30, 'M',2,150000, company);

        ScrumMaster sm = new ScrumMaster("Hüseyin", 32, 'M',3,170000, company);

        Tester tester1 = new Tester("Aygün", 32, 'F',"Tester",3, 110000,company);
        Tester tester2 = new Tester("Ahmet", 32, 'M',"Tester",4, 110000,company);
        Tester tester3 = new Tester("Sibel", 32, 'F',"Tester",5, 110000,company);

        Developer developer1 = new Developer("Yaşar",25,'M',"Developer",6,120000, company);
        Developer developer2 = new Developer("Hakan",25,'M',"Developer",7,120000, company);
        Developer developer3 = new Developer("Hasan",25,'M',"Developer",8,120000, company);
        Developer developer4 = new Developer("Sadık",25,'M',"Developer",9,120000, company);

        ScrumTeam scrumTeam = new ScrumTeam(po,ba,sm);

        System.out.println(scrumTeam);

        scrumTeam.addTester(tester1);
        scrumTeam.addTester(tester2);
        scrumTeam.addTester(tester3);

        System.out.println(scrumTeam);

        System.out.println(developer1);

        scrumTeam.addDeveloper(developer1);

        System.out.println(scrumTeam);




        for (Tester tester : scrumTeam.testers) {

            System.out.println(tester.name+" : "+tester.salary);

        }








    }






}
