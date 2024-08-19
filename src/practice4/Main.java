package practice4;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String[] animation = {"|", "/", "-", "\\"};
        int i = 0;
        long startTime = System.currentTimeMillis();
        int duration = 5000; // Animation duration in milliseconds (5 seconds)

        while (System.currentTimeMillis() - startTime < duration) {
            System.out.print("\rUSSD code running.. " + animation[i % animation.length]);
            i++;
            Thread.sleep(200); // Pause for 200ms to create the animation effect
        }

        MpesaMenu menu = new MpesaMenu();
        menu.start();
    }
}

