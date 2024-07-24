import java.util.ArrayList;

public class ExampleArrayList {
    public static void main(String[] args) {
        
        ArrayList <Integer> list = new ArrayList<>(5); 

        list.add(10);
        list.add(2);
        list.add(56);
        list.add(237);
        list.add(0);

        list.add(99); // add 6th element when size defined to 5

        System.out.println(list); // we can directly print arraylist 

        // this is for loop for arraylist
        for(int i=0; i<6; i++){
            System.out.println(list.get(i));  // we print using the index in arraylist 
        }


        System.out.println(list.contains(99));

        list.set(3, 37);
        System.out.println(list);

        list.remove(4);
        System.out.println(list);
    }
}
