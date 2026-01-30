public class SheepCounter {
    public static int sheepCount(boolean[] sheep ){
        int count = 0;

        for(int i = 0; i <  sheep.length; i++){
            if(sheep[i] == true){
                count ++;
            }
        }

        return count;
    }
    

public static void main(String[] args) {
        boolean[] sheepArray = {true, false, true, true, false, true, false, true, true, false};

        System.out.println(sheepCount(sheepArray)); 
    }
}
