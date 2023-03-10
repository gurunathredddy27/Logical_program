public class FibonaciSeries {
    public static void main(String[] args) {
        int n = 10;
        int previourNum = 0;
        int currentNum = 1;
        System.out.println(" the addition of " + n );

        for (int i = 1; i <= n; i++){
            System.out.print(previourNum + "   ");
            int nextNumber = previourNum + currentNum;
            previourNum = currentNum;
            currentNum = nextNumber;
        }
    }
}
