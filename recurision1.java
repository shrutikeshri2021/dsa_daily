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
public static int optimizedpower(int a,int n){
    if(n==0){
        return 1;
    }
    int halfpower=optimizedpower(a,n/2);
    int halfpowersq=halfpower*halfpower;
    //n is odd

    if(n%2!=0){
        halfpowersq = a* halfpowersq;
    }
    return halfpowersq;
}
public static int tiling(int n){
    if(n==0||n==1){
        return 1;
    }
    int fnm1=tiling(n-1);
    //vertical
    int fnm2=tiling(n-2);
    int toways=fnm1+fnm2;

return toways;
}

public static void removedup(String str,int idx, StringBuilder newStr, boolean map[]){
    if(idx==str.length()){
        System.out.println(newStr);
        return;
    }
    char currChar=str.charAt(idx);
    if(map[currChar -'a']==true){
        //duplicate
        removedup(str,idx+1,newStr,map);
    } else{
        map[currChar - 'a']=true;
        removedup(str,idx+1,newStr.append(currChar),map);
    }
}

    public static int friendspairing(int n){
        if(n==1||n==2){
            return n;
        }
        //single
        int fnm1=friendspairing(n-1);
        //pair
        int fnm2=friendspairing(n-2);
        int pairways=(n-1)*fnm2;
        int totways= fnm1+pairways;
        return totways;
        
    }
    public static int friendspairing2(int n){
        if(n==1||n==2){
            return n;
        }

        return friendspairing(n-1) + (n-1)*friendspairing(n-2);
        
    }

    public static void printbinstring(int n, int lastplace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printbinstring(n-1,0,str+"0");
        if(lastplace==0){
            printbinstring(n-1,1,str+"1");
        }
    }

    public static void main(String[] args){
        printbinstring(3,0,"");
        //System.out.println(friendspairing(4));
        //System.out.println(friendspairing2(4));
        //String str="appnnacollege";
        //removedup(str,0,new StringBuilder(""),new boolean[26]);
        
        
        //System.out.println(tiling(3));
        //System.out.println(optimizedpower(2,10));
        //System.out.println(power(5,2,1,1));
        //System.out.println(poweropt(5,2));
        //System.out.println(poweropt2(5,2));
        //int arr[]={1,2,3,4,2,6,7,4,1,2,8,99,90};
        //System.out.println(lastoccurance(arr,2,arr.length-1));
        //System.out.println(firstoccurance(arr,90,0));


        //int arr[]={2,7,4,0,1,6,0,3};
        //int arr[]={1,2,3,4,5,6,7};
        //int arr[]={1,2,3,4,2,7,4,1,2,8};
        //System.out.println(sortedarray2(arr,0));


        //printfibonaccirecursion(7);
        //System.out.println(fibonaccirecursion(7));
        //fibonacci(7);
        //System.out.println(sum(5));
        //System.out.println(factorial(5));
        //printnto1(10);
        //printinc(10);
        

    }
}
