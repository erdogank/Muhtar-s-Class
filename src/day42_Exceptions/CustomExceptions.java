package day42_Exceptions;
class Myexception extends RuntimeException{

//parent contruction should be called for custom exception messages
    public Myexception(String message){
        super(message);
    }

}

public class CustomExceptions {
    public static void main(String[] args) {

        throw new Myexception("break");

    }
}
