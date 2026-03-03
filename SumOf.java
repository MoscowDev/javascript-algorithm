import java.util.stream.LongStream;

public class SumOf {
    long start = System.nanoTime();
public static void main(String[] args) {   
   // long  start = System.nanoTime(); 
    System.out.println(LongStream.rangeClosed(1, 1000).sum()); 
   // long end = System.nanoTime();
   // System.out.println("Execution time: " + (end - start) + " nanoseconds");        
}
}
