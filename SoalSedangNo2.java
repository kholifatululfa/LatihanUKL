import java.util.Scanner;

public class SoalSedangNo2 {
   public static double hitungVolume(double jariJari, double tinggi) {
        // Rumus volume tabung: V = pi * r^2 * t
        // Kita gunakan Math.PI untuk nilai pi (π) yang lebih presisi
        double volume = Math.PI * jariJari * jariJari * tinggi;
        
        // Mengembalikan nilai volume yang sudah dihitung
        return volume;
    }
    // Ini adalah program utama
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk input
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Program Menghitung Volume Tabung ===");

        // 1. Meminta input dari pengguna
        System.out.print("Masukkan jari-jari alas tabung: ");
        double r = scanner.nextDouble();

        System.out.print("Masukkan tinggi tabung: ");
        double t = scanner.nextDouble();

        // 2. Memanggil fungsi hitungVolume()
        //    Nilai 'r' dan 't' dari input pengguna dilemparkan (passing)
        //    sebagai parameter ke dalam fungsi.
        //    Variabel 'hasilVolume' akan menampung nilai yang dikembalikan (return)
        //    oleh fungsi tersebut.
        double hasilVolume = hitungVolume(r, t);

        // 3. Menampilkan hasil
        System.out.println("\n--- Hasil Perhitungan ---");
        // Menggunakan printf untuk memformat output 2 angka di belakang koma
        System.out.printf("Jari-jari: %.2f\n", r);
        System.out.printf("Tinggi: %.2f\n", t);
        System.out.printf("Volume Tabung adalah: %.2f\n", hasilVolume);

        // Menutup scanner
        scanner.close();
    }
}