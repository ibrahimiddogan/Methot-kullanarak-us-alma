import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Taban değerini girin (Programdan çıkmak için -1 girin): ");
            int taban = scanner.nextInt();

            if (taban == -1) {
                System.out.println("Program sonlandırıldı.");
                break;
            }

            System.out.print("Üs değerini girin: ");
            int us = scanner.nextInt();

            int sonuc = usAlma(taban, us);
            System.out.println(taban + "^" + us + " = " + sonuc);
        }
    }

    public static int usAlma(int taban, int us) {
        if (us == 0) {
            return 1;
        } else if (us == 1) {
            return taban;
        } else {
            return taban * usAlma(taban, us - 1);
        }
    }
}
