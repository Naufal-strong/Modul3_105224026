import java.util.Scanner;

public class Postest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double saldoAwal = 500000;
        double saldomMin  = 50000;
        int pilihan;

        do {
            System.out.println("\n--- MENU UTAMA ---");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print(" Pilih menu : ");
            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.println("Saldo yang lu Punya sekarang : Rp " + saldoAwal);
                    break;

                case 2:
                    System.out.print("Berapa Jumlah Yang mau Disetor : Rp ");
                    double jumlahSetor = input.nextDouble();
                    saldoAwal= saldoAwal + jumlahSetor;
                    System.out.println("Setor berhasil!");
                    System.out.println("Saldo Update : Rp " + saldoAwal);
                    break;

                case 3:
                    System.out.print("Berapa Jumlah yang mau tarik : Rp ");
                    double jumlahTarik = input.nextDouble();

                    if (saldoAwal - jumlahTarik < saldomMin) {
                        System.out.println("Penarikan Gagal");
                        System.out.println("Saldo tidak mencukupi. Minimal saldo : Rp " + saldomMin);
                    } else {
                        saldoAwal = saldoAwal - jumlahTarik;
                        System.out.println("Penarikan berhasil!");
                        System.out.println("Saldo Update : Rp " + saldoAwal);
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan ATM.");
                    System.out.println("Caps Yoww");
                    break;

                default:
                    System.out.println("Pilihan tidak ga ada. Coba lain .");
            }


        } while (pilihan != 4);  // loop berhenti hanya jika pilih 4

        input.close();
    }
}