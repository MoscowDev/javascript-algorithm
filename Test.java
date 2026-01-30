public class Test {  
      public static void main(String[] args) {

        char[] chars = {'a', 'b', 'c', 'd', 'e'};

        String str = new String(chars);
        String str2 = "abcde";
        String str3 = new String("abcde");
        String s = new String("hello");
        String s2 = new String(chars, 3, 1);



        System.out.println(s);
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(s2);
    }
}