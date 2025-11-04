import java.util.Scanner;

public class SoalSulitNo1 {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk menerima input
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Program Rekapitulasi Nilai Ujian RPL ===");

        // --- Input Jumlah Siswa ---
        System.out.print("Masukkan jumlah siswa yang akan diinput: ");
        int jumlahSiswa = scanner.nextInt();

        // Variabel untuk menyimpan total nilai
        // Kita gunakan 'double' agar bisa menampung nilai desimal
        double totalNilai = 0.0;

        // --- Perulangan (Loop) untuk Memasukkan Nilai ---

        // Melakukan validasi sederhana, jumlah siswa harus lebih dari 0
        if (jumlahSiswa <= 0) {
            System.out.println("Jumlah siswa harus lebih dari 0. Program berhenti.");
        } else {
            System.out.println("----------------------------------------");
            
            // Loop akan berjalan dari 1 sampai 'jumlahSiswa'
            for (int i = 1; i <= jumlahSiswa; i++) {
                System.out.print("Masukkan nilai ujian siswa ke-" + i + ": ");
                
                // Membaca nilai yang dimasukkan (bisa desimal, cth: 85.5)
                double nilai = scanner.nextDouble();
                
                // Menambahkan nilai yang baru dimasukkan ke totalNilai
                // totalNilai = totalNilai + nilai;
                totalNilai += nilai;
            }
            
            System.out.println("----------------------------------------");

            // --- Perhitungan Rata-rata ---
            // Rata-rata = Total Nilai / Jumlah Siswa
            double rataRata = totalNilai / jumlahSiswa;

            // --- Menampilkan Hasil ---
            System.out.println("\n--- Hasil Rekapitulasi ---");
            System.out.printf("Jumlah siswa: \t\t %d\n", jumlahSiswa);
            
            // %.2f artinya format angka desimal dengan 2 angka di belakang koma
            System.out.printf("Total keseluruhan nilai: %.2f\n", totalNilai);
            System.out.printf("Nilai Rata-Rata Kelas: \t %.2f\n", rataRata);
        }

        // Menutup scanner
        scanner.close();
    }
}

