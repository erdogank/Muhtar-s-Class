package day31_Constructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {
        Tester tester1 = new Tester("Layan", 11, "QA", 110000);
        Tester tester2 = new Tester("Ali", 43, "SDET", 142000);
        Tester tester3 = new Tester("Layan", 44, "SE", 135000);
        Tester tester4 = new Tester("Alex", 23, "SDET", 115000);

        Tester[] testers = {tester2, tester3, tester4};

        Developer developer1 = new Developer("Olga", 22, "Java Developer", 125000);
        Developer developer2 = new Developer("Aygun", 39, "Java Master", 185000);
        Developer developer3 = new Developer("Tunc", 28, "QA", 135000);
        Developer developer4 = new Developer("Sinem", 13, "QA", 110000);

        Developer[] developers = {developer2, developer3, developer4};

        //ScrumTeam
        ScrumTeam scrum = new ScrumTeam("Nigara", "Huseyin", "Neira", 14);
        System.out.println(scrum);

        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);

        scrum.addDevelopers(developers);

        System.out.println(scrum);

        //to get the testers name and salaries:
        for (Tester eachtester : scrum.testersList) {
            System.out.println(eachtester.name+" "+eachtester.salary);
        }
        //to get the developers name and salaries

        for (Developer eachdeveloper : scrum.devopsList) {
            System.out.println(eachdeveloper.name+ " "+ eachdeveloper.salary);

        }

        //remove tester with the id
        scrum.removeTester(23);

        //remove develeoper
        scrum.removeDeveloper(22);

        System.out.println(scrum);













    }
}
