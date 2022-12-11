package day31_Constructors.restaurant;

public class Server {

    public String name;
    public int employeeID;
    public double hourlyRate;
    public boolean isFullTime;

    public Server(String name, int employeeID, double hourlyRate, boolean isFullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.isFullTime = isFullTime;
    }

    public void takeOrder(){
        System.out.println(name+ " is taking order");
    }
    public void cleanTable(){
        System.out.println(name+ " is cleaning table");
    }

    public String fullTime(){

        String result = "";

        if(isFullTime)
           result = "full-time";
        else
            result = "part-time";

        return result;



    }

    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", isFullTime=" + fullTime() +
                '}';
    }
}
