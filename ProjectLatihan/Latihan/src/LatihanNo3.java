public class LatihanNo3 {

    public static void main(String[] args) {
        System.out.println(" DERET ANGKA TERFILTER (1-50)");
        System.out.println(" (kelipatan 5 dilewati)                     ");

        for (int i = 1; i <= 50; i++) {

            // Lewati jika kelipatan 5
            if (i % 5 == 0) {
                continue;
            }

            System.out.print(i + " ");
        }

        System.out.println();
    }
}