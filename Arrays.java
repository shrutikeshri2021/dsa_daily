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



    
//pairs in array
    public static void main(String[] args){
        int arr[] ={2,3,4,5,8,9};
        int key=8;
        //maxsubarray(arr);
        //pair(arr);
        subarray(arr);
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
