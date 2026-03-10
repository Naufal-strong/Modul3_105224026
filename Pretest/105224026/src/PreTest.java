import java.util.Scanner;

public class PreTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("============================================");
        System.out.println("       CEK KELAYAKAN DONOR DARAH           ");
        System.out.println("============================================");
        System.out.print("Masukkan Usia (tahun)     : ");
        int usia = input.nextInt();
        System.out.print("Masukkan Berat Badan (kg) : ");
        Float beratBadan = input.nextFloat();
        System.out.print("Masukkan Kadar Hemoglobin : ");
        Float hemoglobin = input.nextFloat();
        input.close();
        System.out.println("--------------------------------------------");

        // Cek usia dulu
        if (usia < 17) {
            System.out.println("Status : TIDAK LAYAK");
            System.out.println("Alasan : Usia Belum Mencukupi (minimal 17 tahun)");

        } else if (usia > 60) {
            System.out.println("Status : TIDAK LAYAK");
            System.out.println("Alasan : Usia terlalu tua (maksimal 60 tahun)");

        } else {

            // Cek berat badan
            if (beratBadan < 45) {
                System.out.println("Status : TIDAK LAYAK");
                System.out.println("Alasan : Berat Belum Mencukupi (minimal 45 kg)");

            } else {

                // Cek hemoglobin
                if (hemoglobin < 12.5) {
                    System.out.println("Status : TIDAK LAYAK");
                    System.out.println("Alasan : Kadar hemoglobin rendah (minimal 12.5 g/dL)");

                } else {
                    System.out.println("Status : LAYAK DONOR DARAH");
                    System.out.println("Alasan : Semua kriteria terpenuhi");
                }
            }
        }
    }
}