import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		System.out.println("Enter value: ");
		int num = sc.nextInt();
        int factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d\n", num, factorial);
    }
}
