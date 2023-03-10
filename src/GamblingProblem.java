import org.w3c.dom.ls.LSOutput;

public class GamblingProblem {
    public static void main(String[] args) {
        int startAmount = 100;
        int bettingAmount = 1;
        int count = 0;
        while (startAmount > 0 && startAmount < 200) {
            int chance = (int) (Math.random() * 10) % 2;

            if (chance == 0) {
                startAmount = startAmount - bettingAmount;
            } else {
                startAmount = startAmount + bettingAmount;
            }
            count++;
        }
        System.out.println("number of games player "+ count);
    }
}

