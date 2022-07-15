import java.util.Scanner;
public class Temp{
    public static void main (String[] args) {
        int a = 0, b = 0;
    	for (int i = 1000; i < 10000; i++) {
            System.out.println(i);
            System.out.println(Integer.bitCount(i));
        }
    }
}
