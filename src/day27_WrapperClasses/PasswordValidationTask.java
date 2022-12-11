package day27_WrapperClasses;

public class PasswordValidationTask {

    public static void main(String[] args) {

        String password = "Qwerty@123";

        int length = 0;
        int upper = 0;
        int lower = 0;
        int digit = 0;
        int special=0;

        boolean result = false;

        for (int i = 0; i <password.length() ; i++) {

            if (Character.isUpperCase(password.charAt(i))) {
                upper++;
            }
            if (Character.isLowerCase(password.charAt(i))){
                lower++;

            }
            if (!(Character.isLetterOrDigit(password.charAt(i)))){
                special++;

            }
            if (Character.isDigit(password.charAt(i))){
               digit++;

            }
            if(password.length()>=8 && !password.contains(" ") ) {
                length++;
            }

        }
        if( length>=1 && digit>=1 && special>=1 && upper>=1 && lower>=1){
            result = true;
        }else{
            result = false;
            if(length==0)
                System.out.println("password must contain at least 8 characters and must not contain space");
            if(upper==0)
                System.out.println("password must contain at least one uppercase");
            if(lower==0)
                System.out.println("password must contain at least one lowercase");
            if(digit==0)
                System.out.println("password must contain at least one digit");
            if(special==0)
            System.out.println("password must contain at least one special char");
        }
        System.out.println(result);

    }

}