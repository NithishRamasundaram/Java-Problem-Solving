import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the fibo number:");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        int sum=0;
        for (int i=0;i<n;i++){
            System.out.print(a+" ");
            sum=a+b;
            a=b;
            b=sum;
        }
        //System.out.println(sum);   For sum of the fibo series

    }
}
