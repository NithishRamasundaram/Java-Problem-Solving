import java.util.Scanner;
public class Prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int a=0;
        if(n<=1){
            System.out.println("Invalid number");
        }
        else{
            for (int i=2;i<n;i++){
                if(n%i==0){
                    a=0;
                    break;
                }
                else{
                    a=1;
                }
            }
        }if(a==0){
            System.out.println("Not a prime number");
        }
        else{
            System.out.println("Prime number");
        }
    }
}
