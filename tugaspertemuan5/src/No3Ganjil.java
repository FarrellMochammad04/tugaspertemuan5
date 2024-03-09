import java.util.Scanner;

public class No3Ganjil {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan nilai n
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();
        
        // Memeriksa apakah nilai n valid (lebih besar dari atau sama dengan 0)
        if (n < 0) {
            System.out.println("Input tidak valid. n harus lebih besar dari atau sama dengan 0.");
        } else {
            // Menampilkan hasil faktorial nilai n
            System.out.println(n + "! = " + displayFactorial(n));
        }
    }
    
    // Fungsi untuk menghitung faktorial nilai n dan menampilkannya dalam bentuk string
    public static String displayFactorial(int n) {
        if (n == 0 || n == 1) {
            return "1";
        } else {
            String result = ""; // String untuk menyimpan faktorial dalam bentuk string
            int factorial = 1; // Variabel untuk menyimpan nilai faktorial
            
            // Menghitung faktorial dari n
            for (int i = n; i >= 1; i--) {
                factorial *= i; // Mengalikan nilai factorial dengan nilai i
                if (i == 1) {
                    result += i; 
                } else {
                    result += i + "*";
                }
            }
            
            // Mengembalikan hasil faktorial beserta nilai faktorialnya
            return result + "=" + factorial;
        }
    }
}
