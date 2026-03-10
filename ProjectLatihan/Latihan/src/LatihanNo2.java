import java.util.Scanner;

public class LatihanNo2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pinSesungguhnya = 200605;
        int maxPercobaan = 3;
        System.out.println(" SIMULASI LOGIN PIN ");

        int percobaan = 1;

        while (percobaan <= maxPercobaan) {

            System.out.print("Masukkin Pinnya yang menurut lu bener (percobaan " + percobaan + "/" + maxPercobaan + ") : ");
            int pinInput = input.nextInt();

            if (pinInput == pinSesungguhnya) {
                System.out.println("--------------");
                System.out.println("Login berhasil Asekkk!");
                break;
            } else {
                System.out.println("Sorry To say anda Salah ");
            }

            percobaan++;
        }

        if (percobaan > maxPercobaan) {
            System.out.println("--------------");
            System.out.println("Akun anda Kena Banned.");
        }

        input.close();
    
    }
}