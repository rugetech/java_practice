package counting;

import java.util.Scanner;

public class counting {
    public static void main(String[] args){
        int num;
        Scanner counter = new Scanner(System.in);
        System.out.print("Enter your number: ");
        num = counter.nextInt();

        for(int i = 0; i <= num; ++i){
            System.out.println(i);
        }
        counter.close();
    }
}
