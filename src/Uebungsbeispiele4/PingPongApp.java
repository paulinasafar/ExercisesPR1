package Uebungsbeispiele4;

public class PingPongApp {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            if (i % 6 == 0) {
                System.out.print(" " + i + " ping pong,");
            }
            else if (i % 3 == 0) {
                System.out.print(" " + i + " pong,");
            }
            else if (i % 2 == 0) {
                System.out.print(" " + i + " ping,");
            }
            else {
                System.out.print(" " + i + "-,");
            }
        }
    }
}
