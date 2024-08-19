package practice4;

import java.util.Scanner;

public class MpesaMenu {

    public void start() {
            int choice;
            String jina, op1, op2, op3, op4, op5, op6, op7, op8, op9, op10;
            op1 = "1 Tuma pesa";
            op2 = "2 Toa pesa";
            op3 = "3 Nunua Vifurushi/Muda wa Maongezi";
            op4 = "4 LIPA kwa M-Pesa";
            op5 = "5 Mikopo na Akiba";
            op6 = "6 Huduma za kifedha";
            op7 = "7 Jihudumie";
            op8 = "8 NI BALAA";
            jina = "MPESA";
            System.out.println(jina);
            Scanner scn = new Scanner(System.in);
            System.out.println(op1 + "\n" + op2 + "\n" + op3 + "\n" + op4 + "\n" +
                    op5 + "\n" + op6 + "\n" + op7 + "\n" + op8);
            System.out.print(">> ");
            choice = scn.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Tuma pesa menu");
                    break;
                case 2:
                    System.out.println("Toa pesa Menu");
                    break;
                case 3:
                    System.out.println("Nunua Vifurushi/Muda wa Maongezi Menu");
                    break;
                case 4:
                    System.out.println("LIPA kwa M-Pesa Menu");
                    break;
                case 5:
                    System.out.println("Mikopo na Akiba Menu");
                    break;
                case 6:
                    System.out.println("Huduma za kifedha Menu");
                    break;
                case 7:
                    System.out.println("Jihudumie Menu");
                    break;
                case 8:
                    System.out.println("NI BALAA Menu");
                    break;
            }

        }

    }
