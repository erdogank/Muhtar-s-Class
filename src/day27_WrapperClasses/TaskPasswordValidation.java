package day27_WrapperClasses;



public class TaskPasswordValidation {

    public static void main(String[] args) {

        String password = "Qweryy@123";

        int flag = 0;

        Boolean result = false;

        if(password.length()>=8 ) {
            flag++;
        }


        for (int i = 0; i <password.length() ; i++) {

            if (Character.isUpperCase(password.charAt(i))) {
                flag++;
                break;
            }
        }

        for (int i = 0; i <password.length() ; i++) {

            if (Character.isLowerCase(password.charAt(i))){
                flag++;
                break;
            }

        }
        for (int i = 0; i <password.length() ; i++) {

            if (!(Character.isLetterOrDigit(password.charAt(i)))){
                flag++;
                break;
            }


        }
        for (int i = 0; i <password.length() ; i++) {

            if (Character.isDigit(password.charAt(i))){
                flag++;
                break;
            }

        }
        if(flag==5){
            result=true;
        }
        System.out.println(result);

        }

    }







