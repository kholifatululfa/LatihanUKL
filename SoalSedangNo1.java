import java.util.Scanner;

public class SoalSedangNo1 {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk menerima input
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Program Menghitung Faktorial (n!) ===");
        System.out.print("Masukkan sebuah bilangan bulat positif: ");
        int n = scanner.nextInt();

        // Kita menggunakan tipe data 'long' untuk menampung hasil faktorial,
        // karena nilainya bisa menjadi sangat besar dengan cepat.
        long hasilFaktorial = 1;

        // Menutup scanner
        scanner.close();

        // --- Logika Perhitungan Faktorial ---

        if (n < 0) {
            // Kasus jika bilangan negatif
            System.out.println("\nError: Faktorial tidak terdefinisi untuk bilangan negatif.");
        } else {
            // Kasus jika bilangan 0 atau positif
            // Loop dimulai dari 1 sampai n
            // Jika n = 0, loop ini tidak akan berjalan, dan hasilnya tetap 1 (karena 0! = 1)
            for (int i = 1; i <= n; i++) {
                hasilFaktorial = hasilFaktorial * i;
            }

            // Menampilkan hasil
            System.out.println("\nHasil:");
            System.out.println("Faktorial dari " + n + " (ditulis " + n + "!) adalah: " + hasilFaktorial);
        }
    }
}

