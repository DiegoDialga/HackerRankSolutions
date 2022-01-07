import java.util.Scanner;
public class Result{
    public static void main(String args[]){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for(int i=0; i<n;i++ ){
            ar[i]= sc.nextInt();
        }
        for(int i = 0; i<n; i++){
        sum = sum + ar[i];
        }
        System.out.println(sum);
        
    }
    
}
