import java.util.Scanner;
public class SumDiagonal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0,i=0;
        while(i<arr.length){
            sum+=arr[i][i];
            sum+=arr[i][arr.length-1-i];
            i++;
        }
            
        System.out.print(sum);
    }
}
