package TugasSoal;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input string dari user
        System.out.println("Masukkan kata dalam camelCase:");
        String input = scanner.nextLine();

        //Memanggil fungsi hitung Kata CamelCase untuk menghitung jumlah kata
        int jumlahKata = hitungKataCamelCase(input);

        //Menampilkan hasil
        System.out.println("Jumlah kata:" + jumlahKata);
    }
    //Fungsi untuk menghitung jumlah kata dalam format camelCase
    public static int hitungKataCamelCase(String s) {
        int jumlahKata = 1; // Inisiallisasi dengan 1 karena kata pertama pasti huruf kecil

        //Loop melalui setiap karakter pada string
        for (int i = 0; i < s.length(); i++){
            //Jika ada huruf kapital, berarti ini adalah awal kata baru
            if (Character.isUpperCase(s.charAt(i))){
                jumlahKata++;
            }
        }
        return jumlahKata;
    }
}
