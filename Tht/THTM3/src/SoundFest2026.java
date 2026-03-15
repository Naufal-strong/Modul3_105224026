import java.util.Scanner;

public class SoundFest2026 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stokVIP      = 5;
        int stokFestival = 25;
        int stokTribune  = 35;
        int hargaVIP      = 1500000;
        int hargaFestival = 800000;
        int hargaTribune  = 500000;
        boolean mesinHidup = true;

        do {
            // ===== TAMPILKAN MENU UTAMA =====
            System.out.println("\n========================================");
            System.out.println("   KIOSK TIKET - SOUNDFEST 2026        ");
            System.out.println("========================================");
            System.out.println("Stok Tiket:");
            System.out.println("  VIP      : " + stokVIP      + " tiket");
            System.out.println("  Festival : " + stokFestival + " tiket");
            System.out.println("  Tribune  : " + stokTribune  + " tiket");
            System.out.println("----------------------------------------");
            System.out.println("[1] VIP      - Rp 1.500.000 (Min. 18 th)");
            System.out.println("[2] Festival - Rp 800.000   (Min. 15 th)");
            System.out.println("[3] Tribune  - Rp 500.000   (Semua usia)");
            System.out.println("[4] Matikan Mesin");
            System.out.println("========================================");
            System.out.print("Pilih menu: ");

            int pilihan = input.nextInt();
            if (pilihan == 4) {
                System.out.println("\nMesin dimatikan. Sampai jumpa!");
                mesinHidup = false;
                continue; 
            }
            if (pilihan < 1 || pilihan > 3) {
                System.out.println("Pilihan tidak valid! Kembali ke menu utama.");
                continue;
            }
            String kategori;
            int harga;
            int stok;
            int minUsia;

            switch (pilihan) {
                case 1:
                    kategori = "VIP";
                    harga    = hargaVIP;
                    stok     = stokVIP;
                    minUsia  = 18;
                    break;
                case 2:
                    kategori = "Festival";
                    harga    = hargaFestival;
                    stok     = stokFestival;
                    minUsia  = 15;
                    break;
                default:
                    kategori = "Tribune";
                    harga    = hargaTribune;
                    stok     = stokTribune;
                    minUsia  = 0;
                    break;
            }

            // ===== INPUT JUMLAH TIKET =====
            System.out.print("Jumlah tiket " + kategori + " yang ingin dibeli: ");
            int jumlahBeli = input.nextInt();

            // ===== CEK STOK SEBELUM TANYA USIA =====
            if (jumlahBeli > stok) {
                System.out.println("Stok tidak mencukupi! Stok " + kategori
                    + " tersisa " + stok + " tiket.");
                System.out.println("Kembali ke menu utama.");
                continue;
            }

            // ===== PROSES TIAP TIKET SATU PER SATU =====
            int tiketBerhasil = 0;
            int totalBayar    = 0;
            boolean batalDarurat = false;

            for (int i = 1; i <= jumlahBeli; i++) {

                // Input usia dengan validasi
                int usia = 0;
                boolean usiaValid = false;

                while (!usiaValid) {
                    System.out.print("Masukkan usia untuk Tiket ke-" + i
                        + " (atau -1 untuk batal): ");
                    usia = input.nextInt();

                    // Sinyal batal darurat
                    if (usia == -1) {
                        System.out.println("Batal darurat! Transaksi dihentikan.");
                        batalDarurat = true;
                        break;
                    }

                    // Validasi usia logis (1-120)
                    if (usia < 1 || usia > 120) {
                        System.out.println("Usia tidak logis. Silakan masukkan kembali.");
                    } else {
                        usiaValid = true;
                    }
                }

                // Jika batal darurat, hentikan seluruh proses
                if (batalDarurat) {
                    break;
                }

                // Cek syarat usia
                if (usia < minUsia) {
                    System.out.println("Tiket ke-" + i + " DITOLAK. Usia " + usia
                        + " tahun tidak memenuhi syarat minimal " + minUsia + " tahun.");
                    // Lanjut ke tiket berikutnya, stok tidak dikurangi
                    continue;
                }

                // Usia lolos - proses tiket
                System.out.println("Tiket ke-" + i + " BERHASIL. Usia "
                    + usia + " tahun memenuhi syarat.");
                tiketBerhasil++;
                totalBayar += harga;

                // Kurangi stok sesuai kategori
                if (pilihan == 1) stokVIP--;
                else if (pilihan == 2) stokFestival--;
                else stokTribune--;
            }

            // ===== NOTA AKHIR =====
            if (!batalDarurat) {
                System.out.println("\n--- NOTA PEMBELIAN ---");
                System.out.println("Kategori     : " + kategori);
                System.out.println("Tiket dicoba : " + jumlahBeli);
                System.out.println("Tiket berhasil: " + tiketBerhasil);
                System.out.printf("Total Tagihan: Rp %,d%n", totalBayar);
                System.out.println("----------------------");
            }

        } while (mesinHidup);

        input.close();
    }
}