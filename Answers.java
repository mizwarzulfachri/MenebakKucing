import java.util.Scanner;
//Kelas ini digunakan untuk tidak perlu diulang di kelas main.

public class Answers {
    Scanner scan= new Scanner(System.in);
    public int score = 0;
    public int answer = 0;

    public void dAnswers(int i) {  

        System.out.print("Tebak apakah kucing "+ (i+1) +" domestik atau liar?\n\n1. Domestik\n2. Liar\n\nJawaban : ");
        answer = scan.nextInt();

        if (answer == 1) {
            System.out.println("    Anda BENAR!\n");
            score += 1;
        } else {
            System.out.println("    Anda SALAH!");
        }   

    }

    public void wAnswers(int i) {  

        System.out.print("Tebak apakah kucing "+ (i+1) +" domestik atau liar?\n\n1. Domestik\n2. Liar\n\nJawaban : ");
        answer = scan.nextInt();

        if (answer == 2) {
            System.out.println("Anda benar!\n");
            score += 1;
        } else {
            System.out.println("Anda salah!");
        }   

    }

    public void Score() {
        System.out.println("Score : " + score + "\n");
    }
}
