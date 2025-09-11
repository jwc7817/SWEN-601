package asst4.activities;

import java.util.Scanner;

public class evenodd {

    public static void main(String[] args) {
        int count;

        do{
            Scanner sc = new Scanner(System.in);
            count = sc.nextInt();
            if(count % 2 == 0){
                System.out.println("Even");
            } else{System.out.println("Odd");}
        } while(count != 0);



    }
}
