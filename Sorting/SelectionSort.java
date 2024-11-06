import java.util.*;

public class SelectionSort {


    public static void main(String[] args){
        int arr[]=new int[]{3,2,5,6,8,10,14};

        //basic sorting logic
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    //swap if the number is greater than the neighbour number
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    
}
