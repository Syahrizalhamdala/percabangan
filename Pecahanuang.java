import java.util.Scanner;

/**
 * Pecahanuang
 */
public class Pecahanuang {
    public static void main(String[] args) {
        Scanner aril = new Scanner(System.in);
        int sisaUang, jumlahUang;
    
        System.out.println("Masukkan jumlah uang: ");
        jumlahUang = aril.nextInt();
        sisaUang = jumlahUang;

        int[] pecahan = {100000, 50000, 20000, 10000, 5000, 1000, 500, 200, 100, 50, 10};
        String[] namaPecahan = {"100000", "50000", "20000", "10000", "5000", "1000", "500", "200", "100", "50", "10"};

        for (int i = 0; i < pecahan.length; i++) {
            int jumlahLembar = sisaUang / pecahan[i];
            if (jumlahLembar > 0) {
                System.out.println(jumlahLembar + " lembar " + namaPecahan[i]);
                sisaUang = sisaUang % pecahan[i];
            }
        }

        aril.close();
    }
}
