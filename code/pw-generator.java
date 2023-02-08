import java.util.Random; public class Main {    //Einstellung für die Password länge
    private static int passwordLength = 10;
    public static void main(String[] args) {
        System.out.println(generatePassword());
    }
    public static String generatePassword(){
        String pw = "";
        for (int i = 0; i < passwordLength; i++) {
            pw = pw + Character.toString(getPasswordChar());
        }
        return pw;
    }
    //Diese Methode generiert eine randem Zahl zwischen 0 - 127 und gibt eine char die von der methode
    //checkAlowedNumber erlaubt wurde zurück. Wenn nicht wird die methode nochmal ausgeführt.
    public static char getPasswordChar() {
        Random rn = new Random();
        int rnNumber = rn.nextInt(127);
        if(checkAlowedNumber(rnNumber)) {
            return (char) rnNumber;
        }
        else {
            return getPasswordChar();
        }
    }
    //Überprüft ob die Angegebende Zahl für das Password erlaubt ist.
    public static boolean checkAlowedNumber(int number) {
        if((number >= 33 && number <= 126) || number == 129 || number == 132 || number == 142 || number == 148) {
            return true;
        }
        return false;
    }
}