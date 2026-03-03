import java.util.Scanner;
class StringOld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.next();
        char c = input.charAt(0);

        System.out.println( Character.isLetter(c) );
        System.out.println( Character.isDigit(c) );
        System.out.println( Character.isWhitespace(c) );
        System.out.println( Character.isUpperCase(c) );
        System.out.println( Character.isLowerCase(c) );
        System.out.println( Character.isJavaIdentifierStart(c));
        scanner.close();
    

        
    }
    
}
