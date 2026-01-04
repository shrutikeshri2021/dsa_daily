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
<<<<<<< HEAD
        System.out.println("not found");
=======
        System.out.println("not found");  
>>>>>>> 186ae6ac4ce26125fd33d1e85cf9bc1d8fa14d61
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
<<<<<<< HEAD
//pairs in array
=======

>>>>>>> 186ae6ac4ce26125fd33d1e85cf9bc1d8fa14d61
    public static void pair(int arr[]){
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            System.out.print("("+arr[i]+","+arr[j]+')');
        }
        System.out.println();
    }
<<<<<<< HEAD

=======
   
>>>>>>> 186ae6ac4ce26125fd33d1e85cf9bc1d8fa14d61
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

<<<<<<< HEAD
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
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];
        int leftmax=0,rightmax=0;
        int right[0]=rightmax=0;
        
        for (int i=1;i<arr.length;i++){
            leftmax=Math.max(leftmax,arr[i-1]);
            left[i]=leftmax;
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(left[i]);
        }
        
        for (int i=arr.length-1;i>=0;i--){
            rightmax=Math.min(rightmax,arr[i+1]);
            right[i]=rightmax;
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(right[i]);
        }
    }

    public static void main(String[] args){
        int arr[] ={2,3,4,5,8,9};
        int key=8;
        rainwater(arr);
        //kadane(arr);
        //maxsubarrayprefixsum(arr);
        //maxsubarraybruteforce(arr);
        //pair(arr);
        //subarray(arr);

=======


    
//pairs in array
    public static void main(String[] args){
        int arr[] ={2,3,4,5,8,9};
        int key=8;
        //maxsubarray(arr);
        //pair(arr);
        subarray(arr);
>>>>>>> 186ae6ac4ce26125fd33d1e85cf9bc1d8fa14d61
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
