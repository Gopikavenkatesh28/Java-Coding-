import java.util.*;
public class Maxelement{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        for(int i=0;i<n;i++){
            
            int max=Integer.MIN_VALUE;
            for(int j=0;j<m;j++){
             int num=s.nextInt();
if(num>max){
    max=num;
}
            }
            System.out.println(max);
            }      }
    }
