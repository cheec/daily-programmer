import java.util.Scanner;

public class Challenge235 {
   
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            BowlingScore score = new BowlingScore(sc.nextLine().trim());
            System.out.println(score.getScoreSheet());
            System.out.println(score.getScore());
        }
    }
}