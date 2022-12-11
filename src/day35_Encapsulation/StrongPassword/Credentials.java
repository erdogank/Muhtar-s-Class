package day35_Encapsulation.StrongPassword;

public class Credentials {

    private String userName;
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {

        int countDigit=0; int countLetter=0; int countSpec=0; int countSpace=0;

        if(passWord.length()<8){
            System.out.println("check your password");
            System.exit(1);
        }
        for (int i = 0; i <passWord.length() ; i++) {

            char ch = passWord.charAt(i);

            if(Character.isDigit(ch)){
                countDigit++;
            }
            if(Character.isLetter(ch)){
                countLetter++;
            }
            if(!(Character.isLetterOrDigit(ch))){
                countSpec++;
            }
            if(Character.isSpaceChar(ch)){
                countSpace++;

            }

        }
        if(countSpace==0&&countLetter>=1&&countDigit>=1&&countSpec>=1){
            this.passWord = passWord;
        }else{
            System.out.println("your password is not strong enough");
            System.out.println("1. Password MUST be at least have 8 characters long, and should not contain space");
            System.out.println("2. PassWord should at least contain one letter ");
            System.out.println("3. Password should at least contain one special characters");
            System.out.println("4. Password should at least contain a digit");
            System.exit(1);
        }





    }

    public Credentials(String userName, String passWord) {
        setUserName(userName);
        setPassWord(passWord);
    }

    public String toString() {
        return "Credentials{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
