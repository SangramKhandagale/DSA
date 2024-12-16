import java.util.*;


 
public class Spiral {

    public static void Spiral(int a[][],int m,int n){
        
int SR=0,SC=0,ER=m-1,EC=n-1;

int i,j;

while(true){

    //For top row
for(i=SR;i<=EC;i++){
    System.out.print(a[SC][i]+" ");
}

//For right
for(i=SR+1;i<=ER;i++){
    System.out.print(a[i][EC]+" ");
}

//For bottom
for(i=ER-1;i>=SC;i--){
    System.out.print(a[EC][i]+" ");
}

//For left
for(i=ER-1;i>=SC+1;i--){
    System.out.print(a[i][SC]+" ");
}

SR++;
SC++;
EC--;
ER--;

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



Spiral(a,m,n);

    }
}