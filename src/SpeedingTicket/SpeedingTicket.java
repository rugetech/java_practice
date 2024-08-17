package SpeedingTicket;

import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String[] args) {
        int kph;
        String ticket = "Speeding Ticket";
        String gtg = "Good to Go";
        Scanner meter = new Scanner(System.in);
        System.out.print("Please provide your readings: ");
        kph = meter.nextInt();

        if(kph >= 120){
            System.out.println(ticket);
        }
        else{
            System.out.println(gtg);
        }
        meter.close();
    }
}