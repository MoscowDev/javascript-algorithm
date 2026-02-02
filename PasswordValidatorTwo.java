public class PasswordValidatorTwo {

    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8 || password.length() > 20) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (isDigit(ch)) {
                hasDigit = true;
            } 
            else if (isSpecialCharacter(ch)) {
                hasSpecialCharacter = true;
            } 
            else if (Character.isLetter(ch)) {
            } 
            else {
                return false;
            }
        }

        return hasDigit && hasSpecialCharacter;
    }

    private static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }

    private static boolean isSpecialCharacter(char ch) {
        return "!@#$%^&*()-+".indexOf(ch) >= 0;
    }

    public static void main(String[] args) {
        System.out.println(isValidPassword("Password1!")); 
        System.out.println(isValidPassword("Pass123@1"));
        System.out.println(isValidPassword("Short1!2"));
        System.out.println(isValidPassword(" "));
    }
}
