import java.util.Scanner;

public class Kriteriakelulusan {
    public static void main(String[] args) {
        int score;
        String status;

        Scanner aril = new Scanner(System.in);

        System.out.print("Masukkan niali: ");
        score = aril.nextInt();

        if (score > 75) {
            status = "lulus";
        } else {
            status = "tidak lullus";
        }
         System.out.println( + score +  status); 
         aril.close(); 
        }
    }

