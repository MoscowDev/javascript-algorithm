public class PasswordValidator{
    public static boolean isValidPassword(String password) {
    
        if (password.length() < 8 || password.length() > 20) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if ("!@#$%^&*()-+".indexOf(ch) >= 0) {
                hasSpecial = true;
            }
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
    public static void printPasswordValidity(String password) {
        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
    
    public static void main(String[] args) {
        String testPassword = "Test@1234";
        printPasswordValidity(testPassword);
    }
        
    }           

