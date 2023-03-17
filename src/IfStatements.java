import java.util.Scanner;
public class IfStatements {
    public static void main(String[] args) {
     System.out.println("Namaste World!!");
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int sum = 0;
        for(int p = 0; p <=i; p++){
            sum = sum + p;
        }
        System.out.println(sum);

        System.out.println("enter one number");


        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println("it is even");
        }else {
            System.out.println("it is odd");
        }

        System.out.println("enter your age");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("you can vote");
        }else{
            System.out.println("aguthaleda wait chai "+  (18 - age)+ " more years");
        }
    }
}
