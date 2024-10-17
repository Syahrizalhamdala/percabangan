import java.util.Scanner;

public class Harga {
    public static void main(String[] args) {
    


                Scanner aril = new Scanner(System.in);
                
                System.out.print("Masukkan jumlah barang jenis 1 (harga 3000): ");
                int jumlahBarang1 = aril.nextInt();
                
                System.out.print("Masukkan jumlah barang jenis 2 (harga 2500): ");
                int jumlahBarang2 = aril.nextInt();
                
                System.out.print("Masukkan jumlah barang jenis 3 (harga 2000): ");
                int jumlahBarang3 = aril.nextInt();
                
                int totalBiaya = (jumlahBarang1 * 3000) + (jumlahBarang2 * 5000) + (jumlahBarang3 * 10000);
                
                System.out.println("Total biaya yang harus dibayar: " + totalBiaya + " rupiah");
                
                aril.close();
    }
        }
