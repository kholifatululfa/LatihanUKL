import java.util.Scanner;
public class SoalMudahNo1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
            System.out.println("=== Perhitungan Biaya Pengiriman Paket ===");

            // Meminta input berat paket (dalam kg)
            System.out.print("Masukkan Berat Paket (kg): ");
            double beratPaket = scanner.nextDouble();

            // Meminta input jarak tempuh (dalam km)
            System.out.print("Masukkan Jarak Tempuh (km): ");
            double jarakTempuh = scanner.nextDouble();

            // Meminta input dimensi paket (dalam cm)
            System.out.print("Masukkan Panjang Paket (cm): ");
            double panjang = scanner.nextDouble();

            System.out.print("Masukkan Lebar Paket (cm): ");
            double lebar = scanner.nextDouble();

            System.out.print("Masukkan Tinggi Paket (cm): ");
            double tinggi = scanner.nextDouble();

            // Menutup scanner
            scanner.close();

            // --- Perhitungan Biaya ---

            // 1. Hitung Volume Paket (dalam cm^3)
            double volumePaket = panjang * lebar * tinggi;

            // 2. Hitung Biaya Berdasarkan Berat dan Jarak
            double biayaPerKg;
            if (jarakTempuh <= 10) {
                biayaPerKg = 4250; // Rp 4250 per kg untuk jarak <= 10 km
            } else {
                biayaPerKg = 6000; // Rp 6000 per kg untuk jarak > 10 km
            }

            double biayaBeratJarak = beratPaket * biayaPerKg;

            // 3. Hitung Biaya Tambahan Volume
            double biayaVolumeTambahan = 0;
            double batasVolume = 100; // Batas volume dalam cm^3

            if (volumePaket > batasVolume) {
                biayaVolumeTambahan = 50000; // Rp 50.000 jika volume melebihi 100 cm^3
            }

            // 4. Hitung Biaya Total
            double biayaTotal = biayaBeratJarak + biayaVolumeTambahan;

            // --- Output Hasil ---

            System.out.println("\n--- Detail Perhitungan Biaya ---");
            System.out.printf("Berat Paket: %.2f kg\n", beratPaket);
            System.out.printf("Jarak Tempuh: %.2f km\n", jarakTempuh);
            System.out.printf("Volume Paket: %.2f cm^3\n", volumePaket);
            System.out.printf("Biaya per kg: Rp %,.0f\n", biayaPerKg);

            System.out.println("---------------------------------");
            System.out.printf("Biaya Berat & Jarak: Rp %,.0f\n", biayaBeratJarak);
            System.out.printf("Biaya Tambahan Volume (> 100 cm^3): Rp %,.0f\n", biayaVolumeTambahan);
            System.out.println("---------------------------------");
            System.out.printf("**TOTAL BIAYA PENGIRIMAN: Rp %,.0f**\n", biayaTotal);
        }

        // --- Input Data Paket ---

    }

