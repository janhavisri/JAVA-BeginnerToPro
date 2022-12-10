// ***********************************BUBBLE SORT************************************


import java.util.*;

public class BasicSorting{
//     public static void bubbleSort(int arr[]){
//      for(int turn=0; turn<arr.length-1; turn++){
//         for(int j=0; j<arr.length-1-turn; j++){//-2 tk jana tha pr hmne less than lgaya hai isilie -1 hai dono me
//         //process yhi hai largest element ko piche push krte hai or vaha pe 2 lga denge
//         if(arr[j] > arr[j+1]){ //ab hr ek adject element ko swap krege
//             // check if our current element is larger than next element
//              //swap
//              int temp = arr[j];
//              arr[j] = arr[j+1];
//              arr[j+1] = temp;
//         }
//      }
//     }
// }
// // new fuction for print array
// public static void printArr(int arr[]){
//     for(int i = 0; i<arr.length; i++){
//         System.out.print(arr[i]+" ");
//     }
//     System.out.println();
// }
// public static void main(String args[]){
//     int arr[]= {5, 4, 1, 3, 2};
//     bubbleSort(arr);
//     printArr(arr);
// }
// }


//*********************************SELECTION SORT***************************
public static void selectionSort(int arr[]){
    for(int i =0; i<arr.length-1; i++){//turns count
        int minPos = i;//define current pos = min pos 
        for(int j=i+1; j<arr.length; j++){// yaha pe aage vala jo unsorted part hai usme se mi dhunda
            if(arr[minPos] > arr[j]){//minpos pr element ki value bdi ho jati hai arr at pos[j] pr
                minPos =j;
            }
        } //swap
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;
    }
}
// new fuction for print array
 public static void printArr(int arr[]){
     for(int i = 0; i<arr.length; i++){
         System.out.print(arr[i]+" ");
     }
     System.out.println();
}
public static void main (String args[]){
    int arr[] = {5, 4, 1, 3, 2};
    selectionSort(arr);
    printArr(arr);
}
}