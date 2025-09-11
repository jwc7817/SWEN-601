package asst4.activities;

import java.util.Scanner;

public class countdown {
    public static void  main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        while (count >= 0) {
            System.out.println(count);
            count--;
        }



    }
}
