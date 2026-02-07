import java.util.ArrayList;

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

    public static int firstoccurance(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        else  if(arr[i]==key){
            return i;
        }
        return firstoccurance(arr,key,i+1);
    }

    public static int lastoccurance(int arr[],int key,int i){
        if(i==0){
            return -1;
        }
        else  if(arr[i]==key){
            return i;
        }
        return lastoccurance(arr,key,i-1);
    }

    public static int power(int n,int power, int i,int num){
        if(i<=power){
            num=num*n;
            return power( n, power, i+1,num);
        }
        return num;
    }

    public static int poweropt(int n, int p) {
    if (p == 0) return 1;
    return n * poweropt(n, p - 1);
}

    public static int poweropt2(int n, int p) {
    if (p == 0) return 1;

    int half = poweropt2(n, p / 2);

    if (p % 2 == 0)
        return half * half;
    else
        return n * half * half;
}



    public static void main(String[] args){

        System.out.println(power(5,2,1,1));
        System.out.println(poweropt(5,2));
        System.out.println(poweropt2(5,2));
        //int arr[]={1,2,3,4,2,6,7,4,1,2,8,99,90};
        //System.out.println(lastoccurance(arr,2,arr.length-1));
        //System.out.println(firstoccurance(arr,90,0));


        //int arr[]={2,7,4,0,1,6,0,3};
        //int arr[]={1,2,3,4,5,6,7};
        //int arr[]={1,2,3,4,2,7,4,1,2,8};
        //System.out.println(sortedarray2(arr,0));


        //printfibonaccirecursion(7);
        //System.out.println(fibonaccirecursion(6));
        //fibonacci(5);
        //System.out.println(sum(5));
        //System.out.println(factorial(5));
        //printnto1(10);
        //printinc(10);
        

    }
}
