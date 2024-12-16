import java.text.NumberFormat.Style;
import java.util.*;
 
public class Q1 {

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

    }
}