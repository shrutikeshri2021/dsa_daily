public class Arrays {

    //linear search
    public static int linSearch(int arr[],int key){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==key){
                    return i;
                }
            }
            return -1;
            
    }
    //binary search
    public static void binSearch(int arr[], int key){
        int start=0, end = arr.length-1,mid=0;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==key){
                System.out.println("found at"+mid);
                return;
            }
            else if(arr[mid]<key){
                start= mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        System.out.println("not found");
    }


public static void reversearray(int arr[]){
    int start=0, end= arr.length-1;
    while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
            start++;
        }

            
    }
//pairs in array
    public static void pair(int arr[]){
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            System.out.print("("+arr[i]+","+arr[j]+')');
        }
        System.out.println();
    }

    public static void subarray(int arr[]){
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            for(int k=i;k<=j;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    }

    public static void maxsubarraybruteforce(int arr[]){
        int curr=0;
        int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        
        for(int j=i+1;j<arr.length;j++){
            curr=0;
            for(int k=i;k<=j;k++){
                //System.out.print(arr[k]+" ");
                curr=curr+arr[k];
            }
            System.out.println(curr);
            if(max<curr){
                max=curr;
            }
        }
        System.out.println();
    }
    
System.out.println("max "+max);
    }


    public static void maxsubarrayprefixsum(int arr[]){
        int curr=0;
        int max=Integer.MIN_VALUE;
        int[] prefix =new int [arr.length];
        prefix[0]=arr[0];
    for(int i=1;i<arr.length;i++){
        prefix[i]=prefix[i-1]+arr[i];
    } 
for(int i=0;i<prefix.length;i++){
    curr=0;
    for(int j=i;j<prefix.length;j++){
        curr=i==0?prefix[j]:prefix[j]-prefix[i-1];
        if(max<curr){
                max=curr;
            }
    } 
}

System.out.println("max "+max);
    }

    public static void kadane(int arr[]){
        int curr=0;
        int max=0;
        for (int i=0;i<arr.length;i++){
            curr=curr+arr[i];
            if(curr<0){
                curr=0;
            }
            max=Math.max(curr,max);
        }
        System.out.println("max "+max);
    }

    public static void rainwater(int arr[]){
        if (arr == null || arr.length < 3) {
        System.out.println(0);
        return;
    }
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];
        
        left[0]=arr[0];
        right[arr.length-1]=arr[arr.length-1];
        
        for (int i=1;i<arr.length;i++){
            left[i]=Math.max(left[i-1],arr[i]);
            
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(left[i]);
        }
         System.out.println();
       for(int i=arr.length-2;i>=0;i--){
        right[i]=Math.max(arr[i],right[i+1]);
        
       }
       for(int i=0;i<arr.length;i++){
            System.out.print(right[i]);
        }
         System.out.println();
        int storage=0;
        for(int i=0;i<arr.length;i++){
        
        int level= Math.min(left[i],right[i]);
        storage +=(level- arr[i])>=0 ? level- arr[i]: 0 ;
        
        
    }
    System.out.println(storage);
    
}


public static void buysellstock(int arr[]){
    if (arr == null || arr.length < 2) {
    System.out.println(0);
    return;
}
    int currp=0;
    int maxp=0;
    int minp=Integer.MAX_VALUE;
    for(int i=0;i<arr.length-1;i++){
        int j=i+1;

    
        if(minp>arr[i]){
            minp=arr[i];
        }
        if(minp<arr[j]){
            currp=arr[j]-minp;
            if(maxp<currp){
                maxp=currp;
            }
        
    }
     j++;
        
        }
       System.out.println(maxp);
    
    
}

    public static void main(String[] args){
        //int arr[] ={4,2,0,6,3,2,5};
        int arr[] ={7,1,5,3,7,4};
        int key=8;
        buysellstock(arr);
        //rainwater(arr);
        //kadane(arr);
        //maxsubarrayprefixsum(arr);
        //maxsubarraybruteforce(arr);
        //pair(arr);
        //subarray(arr);

        //reversing array
        /*
        reversearray(arr);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
*/

        //binSearch
        //binSearch(arr,key);

         //linear search
        /*int index = linSearch(arr, key);
        if(index == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("found at"+index);
        }
            */
    }
}
