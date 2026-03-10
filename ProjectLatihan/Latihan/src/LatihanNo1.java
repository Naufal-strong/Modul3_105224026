import java.util.Scanner;

public class LatihanNo1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=========================== ");
        System.out.println("     KALKULATOR SEDERHANA   ");
        System.out.println("=========================== ");

        System.out.print("Masukkin angka pertama  : ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkin angka kedua     : ");
        double angka2 = input.nextDouble();

        System.out.print("Pilih Operator nya (+,-,*,/) : ");
        char operator = input.next().charAt(0);

        input.close();

        System.out.println("----------------------------");

        switch (operator) {
            case '+':
                System.out.println("Hasil : " + (angka1 + angka2));
                break;
            case '-':
                System.out.println("Hasil : " + (angka1 - angka2));
                break;
            case '*':
                System.out.println("Hasil : " + (angka1 * angka2));
                break;
            case '/':
                if (angka2 == 0) {
                    System.out.println("Error Ga boleh Nol.");
                } else {
                    System.out.println("Hasil : " + (angka1 / angka2));
                }
                break;
            default:
                System.out.println("Error Operator Ngasal.");
        }
    }
}