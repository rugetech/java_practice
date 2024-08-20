package practice4;

import java.util.Scanner;

public class MpesaMenu {

    public void start() {
        String[] choice = menuKuu.MenuMama();
        for (String c : choice) {
            System.out.println(c);
        }

        Scanner scn = new Scanner(System.in);
        System.out.print(">> ");
        int put = scn.nextInt();


        if (put >= 1 && put <= choice.length) {
            String selectedOption = choice[put - 1];
            String menu = selectedOption.replaceAll("^[0-9]+\\s+", "");
            menu = menu.toUpperCase();
            System.out.println(menu + " MENU");
        } else {
            System.out.println("Chaguo sio sahihi. Jaribu tena.");
            start();
        }
    }
}
