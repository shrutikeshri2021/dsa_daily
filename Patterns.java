
import java.util.*;
public class Patterns {




    public static void patterns(int n, int m){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||j==1||i==n||j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    } 
    
    public static void zeroone(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }

    /**
     * @param n
     */
    public static void butterfly(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1; j<= 2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1; j<= 2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
    }
}

public static void rhombus(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            System.out.print("*  ");
        }
         System.out.println();
    }
   
}

public static void palin(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(i+" " );
        }
        System.out.println();
    }

}



public static int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
        fact = fact * i;
    }
    return fact;
}

public static char charrr(int n);
    char ch="a";
    for(int i=0;i<n;i++){
        for(intj=0;j<=i;j++){
            return ch;
            
        }
        ch++;
    }

public static void main(String[] args) {
    //System.out.println(factorial(5));
    //System.out.println(charrr(5));
    char ch='A';
    for(int i=0;i<5;i++){
        for(int j=1;j<=i;j++){
            System.out.println(ch);
            ch++;
        }
    }
}

}
