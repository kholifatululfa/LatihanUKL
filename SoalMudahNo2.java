import java.util.Scanner;

public class SoalMudahNo2 {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Pengecek Bilangan Ganjil atau Genap ===");

        // Meminta input bilangan dari pengguna
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int bilangan = scanner.nextInt();

        // Menutup scanner setelah selesai mengambil input
        scanner.close();

        // --- Logika Pengecekan ---

        // Bilangan Genap adalah bilangan yang habis dibagi 2 (sisa baginya 0)
        // Bilangan Ganjil adalah bilangan yang tidak habis dibagi 2 (sisa baginya 1 atau -1)

        if (bilangan % 2 == 0) {
            // Jika sisa bagi dengan 2 adalah 0, maka bilangan tersebut Genap
            System.out.println("\nHasil: Bilangan " + bilangan + " adalah GENAP.");
        } else {
            // Jika sisa bagi dengan 2 bukan 0 (yaitu 1 atau -1), maka bilangan tersebut Ganjil
            System.out.println("\nHasil: Bilangan " + bilangan + " adalah GANJIL.");
        }
    }
}

