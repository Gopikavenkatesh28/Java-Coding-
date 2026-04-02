import java.util.Scanner;
class Palindrome{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n/2;i++){
            if(arr[i]!=arr[n-i-1]){
                System.out.println(" Not Palindrome");
                return;
            }
            else{
                System.out.println("Palindrome");
            }
        }
    }
}