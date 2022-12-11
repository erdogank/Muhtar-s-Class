package day09;

public class OperatingSystem {
    public static void main(String[] args) {

        String os= "IOS";
        String device = "Mac";

        if(os =="MacOs"){
            device="Mac";

        }else if(os =="Windows"){
            device="Lenova";
        }else if(os =="IOS") {
            device = "Iphone";
        }else if(os =="Android"){
                device="Samsung";
            }else{
                System.out.println("Wrong OS Name");

            }
            System.out.println("If you want to learn "+os +" you should have "+device );

        }
    }

