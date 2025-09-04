import java.util.ArrayList;
import java.util.Arrays;

public class Datastruct {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        int [] arr2 = new int[3];
        String[][] multStrings = {{"monkey", "banana", "apple"}, {"dog", "cat", "mouse"}};
        ArrayList<String>str = new ArrayList<String>();
        str.add("Hawk");
        str.add(1,"Eagle");
        str.add(0, "Falcon");

        ArrayList<ArrayList<ArrayList<Integer>>> zahlen = new ArrayList<>();
        zahlen.add(new ArrayList<>());
        zahlen.add(1, new ArrayList<>());
        zahlen.get(0).add(new ArrayList<>());
        zahlen.get(1).add(new ArrayList<>());
        zahlen.get(1).add(1, new ArrayList<>());
        zahlen.get(0).get(0).add(5);
        zahlen.get(1).get(0).add(10);
        zahlen.get(1).get(1).add(15);
        System.out.println(zahlen);
        // str.remove("Hawk");
        // System.out.println(str);
        // System.out.println(str.getLast());
        // System.out.println(arr[2]);
        // System.out.println(arr2[1]);
        // System.out.println(multStrings[0][1]);
        // for (int i = 0; i < multStrings.length; i++){
        //     for (int j = 0; j < multStrings[i].length; j++){
        //         System.out.println(multStrings[i][j]);
        //     }
        // }

    }
}
