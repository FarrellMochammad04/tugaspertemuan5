import java.util.Scanner;

public class No1Ganjil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan nilai N
        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();
        
        // Menampilkan hasil penjumlahan deret
        displaySeriesSum(N);
        
        scanner.close();
    }
    
    // Method untuk menampilkan hasil penjumlahan deret
    public static void displaySeriesSum(int N) {
        int sum = 0; // Variabel untuk menyimpan hasil penjumlahan
        
        // Membuat string untuk menyimpan deret
        StringBuilder series = new StringBuilder();
        
        // Melakukan iterasi dari 1 hingga N
        for (int i = 1; i <= N; i++) {
            series.append(i);
            
            // Menambahkan bilangan ke hasil penjumlahan
            sum += i;
            
            // Jika belum mencapai N, tambahkan tanda + di belakang bilangan
            if (i < N) {
                series.append(" + ");
            }
        }
        
        // Menampilkan hasil penjumlahan deret
        System.out.println("Hasil penjumlahan deret 1 + 2 + ... + " + N + " = " + sum);
        System.out.println("Deret: " + series.toString());
    }
}
