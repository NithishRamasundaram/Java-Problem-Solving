import java.util.Scanner;
public class Prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int a=1;
        if (n<=1){
            System.out.println("Invalid");
        }else {
            for(int i=2;i<n;i++){
                if(n%i==0){
                    a=0;
                    break;
                }
                else {
                    a=1;
                }
            }

        }
        if(a==1){
            System.out.println("Given number is prime");
        }else {
            System.out.println("Given number is not a prime");
        }
    }
}