import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Masukkan Usia Sekarang: ");
        int Usia = Scanner.nextInt();
        

        if (Usia >= 17) {
            System.out.println("Anda Layak Honor");
            System .out.println("Masukan Berat Badan Anda: ");
            Float Berat = Scanner.nextFloat();
            if (Berat >= 45) {
                System.out.println("Anda Layak Honor");
                System.out.println("Masukan Hemo: ");
                Float Hemo = Scanner.nextFloat();
                if (Hemo >= 12.5) {
                    System.out.println("Anda Layak Honor");
                } else {
                    System.out.println("Anda Tidak Layak Honor");
                }
            } else {
                System.out.println("Anda Tidak Layak Honor");
            }
        } else if (Usia >= 60) {
            System.out.println("Anda Tidak Bsia Honor");
        } else {
            System.out.println("Anda Belum Cukup Usia Untuk Honor");
        }
    }
}
