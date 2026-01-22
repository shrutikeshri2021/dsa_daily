import java.util.*;
public class Arrays2d {


        public static void search(int matrix[][], int key){
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length; j++){
                    if(matrix[i][j]==key){
                        System.out.print("key found at "+ i+" "+j);
                        return;
                    }
                }
            }
            System.out.print("key not found");
            return;
        }
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int key=sc.nextInt();
        int matrix[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        search(matrix,key);
    }
}
