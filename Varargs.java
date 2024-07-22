import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        mix(10, 8, "kiran", "Patil");
    }
    static void mix(int a, int b, String ...arr) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(arr));
    }
}
