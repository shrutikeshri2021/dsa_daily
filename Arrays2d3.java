public class Arrays2d3 {

    public static void diagonalmatrix(int matrix[][]){
        int n=matrix.length;
        int m= (matrix.length)/2;
        int x=0;
        int y=0;
        if(n%2==0){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==j){
                        x+= matrix[i][j];
                        System.out.println(matrix[i][j]+" "+x );
                        //System.out.println(x);
                    }
                }
            }

            int j=matrix[0].length-1;
            for(int i=0;i<n;i++){
                
                y+= matrix[i][j];
                System.out.println(matrix[i][j]+" "+y );
                //System.out.println(y);
                j--;
            }

        }
        

        else{
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==j){
                        x+= matrix[i][j];
                        System.out.println(matrix[i][j]+" "+x );
                        //System.out.println(x);
                    }
                }
            }

            int j=matrix[0].length-1;
            for(int i=0;i<n;i++){
                
                y+= matrix[i][j];
                System.out.println(matrix[i][j]+" "+y );
                //System.out.println(y);
                j--;
            }
            y=y-matrix[m][m];
        }
        System.out.println(x+y);

    }

    public static void main(String[] args){
        //int matrix[] [] ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int matrix[] [] ={{1,2,3},{4,5,6},{7,8,9}};
            diagonalmatrix(matrix);
            
    }
}


//approach 2 optimized
/*
// public class Arrays2d3 {

    public static void diagonalMatrix(int[][] matrix) {
        int n = matrix.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];           // primary diagonal
            sum += matrix[i][n - 1 - i];   // secondary diagonal
        }

        // subtract middle element once if matrix size is odd
        if (n % 2 != 0) {
            sum -= matrix[n / 2][n / 2];
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        diagonalMatrix(matrix);
    }
}
*/
