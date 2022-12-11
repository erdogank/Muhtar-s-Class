package day36_Inheritance.book;

public class BookObjects {

    public static void main(String[] args) {

        AudioBook ab1 = new AudioBook();

        ab1.setInfo("Les Miserables","Classic","Victor Hugo",20);

        ab1.listen();

        Ebook eb1 = new Ebook();

        eb1.setInfo("1984","Novel","George Orwell",12);
        System.out.println(eb1.price);


    }
}
