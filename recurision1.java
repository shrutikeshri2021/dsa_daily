public class recurision1 {

    public static void printnto1(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printnto1(n-1);
    }
    public static void printinc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        
        printinc(n-1);
        System.out.print(n+" ");
    }
    public static int factorial(int n){
        if (n==1) return n;
        n=n*factorial(n-1);
        return n;
        
    }
    public static int sum(int n){
        if (n==0) return n;
        n=n+sum(n-1);
        return n;
        
    }

    public static void fibonacci(int n){
        int first=0;
        int second=1;
        int i=3;
        if(n==0) return;
        if(n==1) return;
        if(n==2){
        System.out.print(first +" " +second+" ");
        return;
        }
        System.out.print(first+" "+second+" ");
        while(n>=i){
        int third=first+second;
        System.out.print(third+" ");
        first=second;
        second=third;
        i++;
        }
        return;
        
    }

    public static int fibonaccirecursion(int n){
        if(n==0||n==1) return n;
        else{

            return fibonaccirecursion(n-1)+fibonaccirecursion(n-2);
    }
}
    public static void printfibonaccirecursion(int n){
        if(n==0||n==1) return;
        else{
            int fir=fibonaccirecursion(n-1);
            int sec=fibonaccirecursion(n-2);
            int third=fir+sec;
            System.out.println(third +" ");
            printfibonaccirecursion( n-1);
            
    }
}
    
    public static boolean sortedarray2(int arr[], int i){
        if(i==arr.length-1) return true;
        if(arr[i]>arr[i+1]){
            return false;
        }
        return sortedarray2(arr,i+1);
        
    }



    public static void main(String[] args){
        //int arr[]={2,7,4,0,1,6,0,3};
        //int arr[]={1,2,3,4,5,6,7};
        int arr[]={1,2,3,4,2,7,4,1,2,8};
        System.out.println(sortedarray2(arr,0));
        //printfibonaccirecursion(7);
        //System.out.println(fibonaccirecursion(6));
        //fibonacci(5);
        //System.out.println(sum(5));
        //System.out.println(factorial(5));
        //printnto1(10);
        //printinc(10);
    }
}
