//  CREATE
//INPUT
//OUTPUT
//UPDATE
//dataType arrayName[] = new dataType[size];
//eg- int marks[] = new int [40];
//eg2- int numbers[] = {1,2,3};
//eg3- int moreNumbers [] = {3,5,8};
//eg4- String fruits[] = {"apple","mango"};



import java.util.*;

public class Arrays{
// public static void main(String args[]){
//     int marks[] = new int[50];
     
//     Scanner sc = new Scanner(System.in);//for user input

//     //int phy
//     //phy = sc.nextInt();
//     marks[0] = sc.nextInt();
//     marks[1] = sc.nextInt();
//     marks[2] = sc.nextInt();
   
//     System.out.println("Phy : " + marks[0]);
//     System.out.println("Chem : " + marks[1]);
//     System.out.println("Math : " + marks[2]);
//     marks[2] =100;//update //marks[2] + 3;
//     System.out.println("Math : " + marks[2]);




//     //percentage
//     int percentage = (marks[0] + marks[1] + marks[2]) / 3;
//     System.out.println("percentage = " + percentage + "%");
// }
// }


// ****************Arrays as function argument*************************
// public static void update(int marks[]){
//     for(int i=0; i<marks.length; i++){
//         marks[i]= marks[i] + 1;
//     }
// }
// public static void main(String args[]){
//     int marks[] = {94, 83, 84};
//     update(marks);//call by reference ki vjh se update hua
//     //print our marks
//     for(int i=0; i<marks.length; i++){
//         System.out.print(marks[i] + " ");
//     }
//     System.out.println();
// }
// }



//******************Linear Search***********************/
// public static int linearSearch (int numbers[], int key){
//     for(int i=0; i<numbers.length; i++){
//         if(numbers[i]==key){
//             return i;//funct me loop
//             //agr hmare ith index key ke = hai to return index else return -1
//         }
//     }
//     return -1;
// }
// public static void main(String args[]){//array or key ko pass kiya linearSearch function me
//     int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
//     int key =10;
//     int index = linearSearch(numbers, key);
//     if(index == -1){
//         System.out.println("Not Found");
//     }else
//     System.out.println("Key is at index: " + index);
// }
// }



// ******************************Largest number****************
// public static int getLargest(int numbers[]){
//     int largest = Integer.MIN_VALUE;//-INFINITY -lowest possible value
//     int smallest = Integer.MAX_VALUE;//INFINITY -highest possible value
//     for(int i=0; i<numbers.length; i++){
//         if(largest < numbers[i]){//means ith index pe stored number largest se bada hua to update kr denge largest ko
//             largest = numbers[i];
//         }
//         if(smallest > numbers[i]){
//             smallest = numbers[i];
//         }
//     }
// System.out.println("smallest Value is:" + smallest);
//     return largest;
// }
// public static void main(String args[]){
//     int numbers[] = {1, 2, 6, 3, 5};
// System.out.println("Largest Value is:" + getLargest(numbers));
// }
// }





// *******************************BINARY SEARCH***********************
// public static int binarySearch(int numbers[], int key){
// int start = 0, end = numbers.length-1;
// while(start <= end){
//     int mid = (start + end) / 2;

//     //comparison
//     if(numbers[mid]==key){
//         return mid;
//     }
//     if(numbers[mid] < key){
//         //right
//         start = mid+1;
//     }else{//left
//         end = mid-1;
//     }
// }
// return -1; //agr hamari key array me exist na krta ho to
// }
// public static void main(String args[]){
//     int numbers[] ={2, 4, 6, 8, 12, 14};
//     int key = 8;
//         System.out.println("index for key is:" + binarySearch(numbers, key));
// }
// }



// *************************REVERSE AN ARRAY*******************
//2, 4, 6, 8, 10
//create new array and store from last one eg - 10, 8, 6, 4,2
//tc- o(n) sc-o(1)-constant bcoz no extra space use
//swapping
// public static void reverse(int numbers[]){
//     int first =0, last = numbers.length-1;

//     while(first < last){
//         int temp = numbers [last];
//         numbers[last]= numbers[first];
//         numbers[first]= temp;//classical code of swapping
//         first++;
//         last--;
//     }
// }
// public static void main(String args[]){
//     int numbers[] = {2, 4, 6, 8, 10};
//     reverse(numbers);
//     //print array
//     for(int i=0; i<numbers.length; i++){
//         System.out.print(numbers[i] + " ");
//     }
//     System.out.println();
// }
// }




// **********************PAIRS IN A ARRAY*************************
public static void printPairs(int numbers[]){
    int tp = 0;
    for(int i=0; i<numbers.length; i++){
        int curr = numbers[i]; //2,4,6,8,10
        for(int j=i+1; j<numbers.length; j++){
            System.out.print("(" + curr + "," + numbers[j] + ") ");//first pair print 1 st no. current 2nd numbers of j, current same but no. change
            tp++;
        }
        System.out.println();
    }
System.out.println("total pairs:" + tp);

}
public static void main(String args[]){
    int numbers[] = {2, 4, 6, 8, 10};
    printPairs(numbers);
}
}