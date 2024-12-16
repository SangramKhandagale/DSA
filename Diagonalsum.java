import java.util.*;

public class Diagonalsum {

    public static void Sum(int a[][],int m,int n){
        int sum=0,rum=0;
        int Boy=0;

      
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                 
        //For primary diagonal
                if(i==j){
        sum=sum+a[i][j];
                }

        //For seconadary diagonal
         if(i+j==a.length-1){
            rum=rum+a[i][j];
                     }
            }
        }
        
    Boy=rum+sum;
System.out.println("The sum is="+Boy);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m,n;
        System.out.println("Enter array size");
        m=in.nextInt();
        n=in.nextInt();
        int a[][]=new int [m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("Enter element: ");
                a[i][j]=in.nextInt();
            }
        }
        System.out.println("The array is:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }System.out.println();
        }

Sum(a,m,n);
    }
}