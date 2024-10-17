import java.util.Scanner;


public class Nilaigrade {
    public static void main(String[] args) {
        Double angka;
        String grade;
        Scanner aril = new Scanner(System.in);
        System.out.println("Masukkan nilai : (0-100) ");
        angka = aril.nextDouble();
        if (angka >= 85) {
            grade = "A";

        }else if (angka >= 75){
            grade = "B";

        }else if (angka >= 65) {
            grade = "C";

        }else if (angka >= 55) {
            grade = "D";
        }else{
            grade = "E";
            
        }
          System.out.println("grade; "+grade); 
          aril.close(); 
        }
            
        }

    
