
import java.util.Scanner;

public class Ganjilgenap {
    public static void main(String[] args) {
        int  num;
        String jenis;

        Scanner aril = new Scanner(System.in);

        System.out.println("masukkan angka: ");
        num = aril.nextInt();

        if (num % 2 == 0) {
            jenis = "Genap";
         } else { 
            jenis = "Ganjil";
         }

         System.out.println(num + " adalah termasuk bilang " + jenis); 
         aril.close();
        }
    }

