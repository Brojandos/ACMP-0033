import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 21.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        byte harryCansNumber = in.nextByte();
        byte larryCansNumber = in.nextByte();
        System.out.printf("%d %d", larryCansNumber - 1, harryCansNumber - 1);
    }
}
