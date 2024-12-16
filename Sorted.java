import java.util.*;

public class Sorted{

    public static void found(int a[][],int key,int m,int n){
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if(key==a[i][j]){
                count++;
                System.out.println("Element found at "+(i+1)+"rd row and "+(j+1)+"th column");
               }
            }
        }

        if(count==0){
            System.out.println("Element not found");
        }
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
                System.out.print("Enter element");
                a[i][j]=in.nextInt();
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }System.out.println();
        }

        System.out.println("Enter the element to be found");
        int key=in.nextInt();

found(a, key,m,n);
    }
}