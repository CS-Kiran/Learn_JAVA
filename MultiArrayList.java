import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {

        // declared multilist ArrayList
        ArrayList<ArrayList<Integer>> multiList = new ArrayList<>();

        // initialization of multi arrayList
        for(int i=0; i<3; i++){
            multiList.add(new ArrayList<>());  // 3 new arrayList added to multi ArrayList
        }

        try (Scanner in = new Scanner(System.in)) {
            //add elemets
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    multiList.get(i).add(in.nextInt());
                }
            }
        }
        System.out.println(multiList);
    }
}
