import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1, y = 1, z = 1;

        System.out.print("Masukan jumlah bilangan fibonacci = ");
        int jumlah = sc.nextInt();
        for (int i = 0; i < jumlah; i++)
        {
            System.out.print(z + " ");
            z = x + y;
            x = y;
            y = z;
        }
        System.out.println();
    }
}
