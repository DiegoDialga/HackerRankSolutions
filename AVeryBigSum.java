import java.util.Scanner;
public class Result{
public static void main(String args[]){
    long sum = 0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long a[] = new long[n];
    for(int i = 0; i<n; i++){
        a[i] = sc.nextLong();
        }
    for(int i = 0; i<n;i++){
        sum = sum + a[i];
        }
        System.out.println(sum);
    }
}
