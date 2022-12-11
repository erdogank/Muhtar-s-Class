package day36_Inheritance.scrumTeam;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    ProductOwner PO= new ProductOwner();
    BusinessAnalyst BA = new BusinessAnalyst();
    ScrumMaster SM = new ScrumMaster();

    ArrayList<Tester> testers = new ArrayList<>();
    ArrayList<Developer> developers = new ArrayList<>();

    public void addTester(Tester tester){
        testers.add(tester);
    }
    public void addTesters(Tester[] testarr ){
        testers.addAll(Arrays.asList(testarr));

    }
    public void removeTester(int id){
        testers.removeIf(p-> p.id==id);
    }
    public void addDeveloper( Developer developer){
        developers.add(developer);
    }
    public void addDevelopers(Developer[] devarr){
        developers.addAll(Arrays.asList(devarr));
    }
    public void removeDeveloper(int id){
        developers.removeIf(p-> p.id==id);

    }

    public void setInfo(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM, ArrayList<Tester> testers, ArrayList<Developer> developers) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.testers = testers;
        this.developers = developers;
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO.name +
                ", BA=" + BA.name +
                ", SM=" + SM.name +
                ", number of testers=" + testers.size() +
                ", number of developers=" + developers.size() +
                '}';
    }
}
