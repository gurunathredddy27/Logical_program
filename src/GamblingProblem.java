import java.util.Scanner;

public class GamblingProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int loss = 0;
        int win = 0;
        for (int i = 0; i <= n; i++) {
            int startAmount = 100;
            int bettingAmount = 1;
            int count = 0;

            while (startAmount > 0 && startAmount < 200) {
                int chance = (int)(Math.random() * 10) % 2;  // 0 or 1

                if (chance == 0) {
                    startAmount = startAmount - bettingAmount;
                } else {
                    startAmount = startAmount + bettingAmount;
                }
                count++;
            }
            System.out.println(" ");
            System.out.println("number of games player " + count);
            System.out.println("Gambler amount " + startAmount);
            if (startAmount == 0){
                System.out.println("gambler lost");
                loss++;
            }else {
                System.out.println("gambler won");
                win++;
            }
        }
        System.out.println(" ");
        System.out.println("gambler won "+ win);
        System.out.println("gambler lose "+ loss);
    }
}
