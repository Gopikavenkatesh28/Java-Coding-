import java.util.Scanner;
public class PrimeNumber{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n>2){
for(int i=2;i<n;i++){
    if(n%i==0){
System.out.println("Not Prime");
return;
    }
}
System.out.println("Prime Number");
        }
    }
}