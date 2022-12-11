package day07;

public class NameOfTheMonth {

    public static void main(String[] args) {
        int number = 12;
        boolean a=number>11;
        boolean b=number>10&&!a;
        boolean c=number>9&&!a&&!b;
        boolean d=number>8&&!a&&!b&&!c;
        boolean e=number>7&&!a&&!b&&!c&&!d;
        boolean f=number>6&&!a&&!b&&!c&&!d&&!e;
        boolean g=number>5&&!a&&!b&&!c&&!d&&!e&&!f;
        boolean h=number>4&&!a&&!b&&!c&&!d&&!e&&!f&&!g;
        boolean i=number>3&&!a&&!b&&!c&&!d&&!e&&!f&&!g&!h;
        boolean j=number>2&&!a&&!b&&!c&&!d&&!e&&!f&&!g&!h&&!i;
        boolean k=number>1&&!a&&!b&&!c&&!d&&!e&&!f&&!g&!h&&!i&&!j;
        boolean l=!a&&!b&&!c&&!d&&!e&&!f&&!g&!h&&!i&&!j&&!k;
        if(l){
            System.out.println("January");}
        if(k){
            System.out.println("February");}
        if(j){
            System.out.println("March");}
        if(i){
            System.out.println("April");}
        if(h){
            System.out.println("May");}
        if(g){
            System.out.println("June");}
        if(f){
            System.out.println("July");}
        if(e){
            System.out.println("August");}
        if(d){
            System.out.println("September");}
        if(c){
            System.out.println("October");}
        if(b){
            System.out.println("November");}
        if(a){
            System.out.println("December");}

    }
}
