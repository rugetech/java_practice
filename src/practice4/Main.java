package practice4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String[] animation = {".", "..", "...", "...."};
        int i = 0;
        long startTime = System.currentTimeMillis();
        int duration = 3000; // Animation 5s

        while (System.currentTimeMillis() - startTime < duration) {
            System.out.print("\rUSSD code running " + animation[i % animation.length]);
            i++;
            Thread.sleep(1000); // Pause for 1s
            System.out.print("\r" + " ".repeat("USSD code running ....".length()) + "\r"); //clear
        }

        System.out.println("KARIBU MPESA MENU"); //Main Menu name VODACOM M-PESA
        MpesaMenu menu = new MpesaMenu();
        menu.start();



    }
}

