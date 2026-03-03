public class Strings {

    public String StringReversal(String word ){
        String result = "";

        for(int i = word.length() - 1; i >= 0; i--){
            result = result + word.charAt(i);
            
           // System.out.println(result);
         



        }

     return result;

    }
    public static void main(String[] args) {
        Strings string = new Strings();
        System.out.println(string.StringReversal("Hello World"));
    }
    
}
