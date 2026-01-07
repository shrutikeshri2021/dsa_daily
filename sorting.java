import java.util.Arrays;
import java.util.Collections;
import java.util.*;
public class sorting {
    public static void bubblesort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]) {
                     int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }

               
            }
        }
         for(int i=0;i<arr.length;i++){ 
            System.out.print(arr[i]);
         }
        
    }

    public static void selectionsort(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
              int min=i;
            for(int j=i+1;j<arr.length;j++){
                 
                if(arr[min]>arr[j]){
                min=j;
                }
           
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
           
        }
          for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
    }
}



    public static void insertionsort(int arr[]){
        for(int i=1;i<arr.length;i++){
              int curr=arr[i];
            int prev =i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
         arr[prev+1]=curr;
    }
     for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
    }
}

public static void countingsort(int arr[]){
    int largest = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        largest=Math.max(largest,arr[i]);
    }
    int count[] = new int[largest+1];
    for(int i=0;i<arr.length;i++){
        count[arr[i]]++;
    }
    int j=0;
    for(int i=0;i<count.length;i++){
        while(count[i]>0){
            arr[j]=i;
            j++;
            count[i]--;
        }
    }
}

     public static void main(String args[]){
        int arr[]={7,5,6,3,4,2,1};
        //bubblesort(arr);
        //insertionsort(arr);
        //selectionsort(arr);
        //Arrays.sort(arr);
        //Arrays.sort(arr,0,4);
        //Arrays.sort(arr);

        /*
        Integer arr[]={7,5,6,3,4,2,1};
        Arrays.sort(arr,0,4,Collections.reverseOrder());
         */
        countingsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
    }
    }
}
