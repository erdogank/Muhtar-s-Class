package Group9;


import java.time.*;
import java.time.format.DateTimeFormatter;


class LocalDateTimetest {
    public static void main(String[] args) {

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalDateTime e = LocalDateTime.of(2018, Month.JANUARY,12,18,35);
        System.out.println(e);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm");
        System.out.println(f.format(e));

        int today = LocalDate.now().getYear();
       int birthDay = LocalDate.of(1974,11,2).getYear();

        int age = today-birthDay;
        System.out.println(age);


    }
}
