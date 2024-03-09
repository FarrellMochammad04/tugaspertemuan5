import java.util.Scanner;

public class No2Ganjil {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan batas awal
        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();
        
        // Meminta pengguna untuk memasukkan batas akhir
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();
        
        // Memanggil fungsi countAndDisplayOddNumbers
        countAndDisplayOddNumbers(batasAwal, batasAkhir);
    }
    
    // Fungsi untuk menghitung dan menampilkan bilangan ganjil di antara batasAwal dan batasAkhir
    public static void countAndDisplayOddNumbers(int batasAwal, int batasAkhir) {
        int count = 0;
        
        // Melakukan iterasi dari batasAwal hingga batasAkhir
        for (int i = batasAwal; i <= batasAkhir; i++) {
            // Memeriksa apakah bilangan saat ini ganjil dengan
            if (i % 2 != 0) {
                count++;
                System.out.println(i); // Menampilkan bilangan ganjil
            }
        }
        
        // Menampilkan jumlah bilangan ganjil yang ditemukan
        System.out.println("Banyaknya bilangan ganjil: " + count);
    }
}
