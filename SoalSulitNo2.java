import java.util.Scanner;

public class SoalSulitNo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Program Penjumlahan Dua Matriks ===");
        
        // Aturan penjumlahan matriks:
        // Kedua matriks harus memiliki dimensi (baris x kolom) yang sama.
        
        // 1. Input Dimensi Matriks
        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = scanner.nextInt();

        // 2. Inisialisasi 2D Array (Matriks)
        int[][] matriksA = new int[baris][kolom];
        int[][] matriksB = new int[baris][kolom];
        int[][] matriksHasil = new int[baris][kolom];

        // 3. Input Elemen Matriks A
        System.out.println("\n--- Input Elemen Matriks A ---");
        // Loop untuk baris
        for (int i = 0; i < baris; i++) {
            // Loop untuk kolom
            for (int j = 0; j < kolom; j++) {
                // (i+1) dan (j+1) digunakan agar tampilan lebih user-friendly (dimulai dari 1)
                System.out.print("Masukkan elemen A (baris " + (i + 1) + ", kolom " + (j + 1) + "): ");
                matriksA[i][j] = scanner.nextInt();
            }
        }

        // 4. Input Elemen Matriks B
        System.out.println("\n--- Input Elemen Matriks B ---");
        // Loop untuk baris
        for (int i = 0; i < baris; i++) {
            // Loop untuk kolom
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan elemen B (baris " + (i + 1) + ", kolom " + (j + 1) + "): ");
                matriksB[i][j] = scanner.nextInt();
            }
        }

        // 5. Proses Penjumlahan Matriks
        // Loop untuk baris
        for (int i = 0; i < baris; i++) {
            // Loop untuk kolom
            for (int j = 0; j < kolom; j++) {
                // Elemen hasil = elemen matriks A + elemen matriks B
                matriksHasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }

        // 6. Tampilkan Hasil
        System.out.println("\n--- Hasil Penjumlahan Matriks (A + B) ---");
        
        // Memanggil fungsi 'printMatriks' untuk menampilkan hasilnya
        printMatriks(matriksHasil, baris, kolom);

        // (Opsional) Menampilkan matriks A dan B untuk perbandingan
        System.out.println("\n--- Matriks A ---");
        printMatriks(matriksA, baris, kolom);
        System.out.println("\n--- Matriks B ---");
        printMatriks(matriksB, baris, kolom);
        
        scanner.close();
    }

    /**
     * Fungsi (method) bantuan untuk mencetak matriks 2D ke konsol.
     * @param matriks Matriks yang akan dicetak
     * @param baris Jumlah baris
     * @param kolom Jumlah kolom
     */
    public static void printMatriks(int[][] matriks, int baris, int kolom) {
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                // Mencetak elemen dan diakhiri dengan Tab (\t) agar rapi
                System.out.print(matriks[i][j] + "\t");
            }
            // Pindah baris baru setelah satu baris selesai dicetak
            System.out.println();
        }
    }

}
