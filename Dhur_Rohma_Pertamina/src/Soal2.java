public class Soal2 {
    public static void main(String[] args) {
        System.out.println("Segitiga siku-siku");
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nSegitiga sama kaki");
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
