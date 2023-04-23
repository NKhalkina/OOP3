package HW3;

import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        VectorList<Integer> vectorList = new VectorList<>();
        vectorList.add(10);
        vectorList.add(12);
        vectorList.add(6);
        vectorList.add(9);
        for (Integer item : vectorList){
            System.out.println(item);
        }

        VectorList<String> vectorStrings = new VectorList<>();
        vectorStrings.add("black");
        vectorStrings.add("white");
        for (String item : vectorStrings) {
            System.out.println(item);
        }      
    }
}