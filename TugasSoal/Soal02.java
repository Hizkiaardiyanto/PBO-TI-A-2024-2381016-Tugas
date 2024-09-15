package TugasSoal;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan ukuran tangga (n)");
        int n = scanner.nextInt();

        cetakTangga(n);
    }
    public static void cetakTangga(int n){
        // Loop bagian luar untuk setiap barisan
        for (int i = 1; i <= n; i++){

            for (int j = 1; j <= i; j++){
                System.out.println("#");
            }
            System.out.println();// Pindah ke barisan berikutnya setelah mencetak '#' pada setiap barisan
        }
    }
}
