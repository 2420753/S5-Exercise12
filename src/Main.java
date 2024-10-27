import java.util.Scanner;

public class Main {
    public static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {
        String[] arrayName;
        String stringValue = "One Two Three";
        int length;

        arrayName = stringValue.split(" ");
        length = arrayName.length;

        for (int i = 0; i < length; i++) {
            System.out.println(arrayName[i]);
        }
    }
}