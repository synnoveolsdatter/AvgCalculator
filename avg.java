import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numslen = 0;
        if (args.length > 1) {
            numslen = args.length;
        } else {
            System.out.println("\nPlease input the number of numbers you will be inputting.");
            System.out.printf(" >> ");
            Scanner scanner = new Scanner();
            numslen = (((int)scanner.nextLine()) + 1);
            scanner = null;
        }
        int[] nums = new int[numslen];
        if (args.length > 1) {
            for (int i = 1; i < args.length; i++) {
                nums[i - 1] = (int)args[i];
            }
        } else {
            System.out.println("\nPlease input numbers.");
            System.out.printf(" >> ");
            Scanner scanner = new Scanner();// TODO: take numbers, use ',' and/or ' ' as seperators
            String ints = scanner.nextLine();
            for (int i = 0; i < ints.length
        }
    }
    public static int avg(int[] nums) {
        int avg = 0;
        for (int i = 0; i < nums.length; i++) {
            avg += nums[i];
        }
        return (avg / nums.length);
    }
}
