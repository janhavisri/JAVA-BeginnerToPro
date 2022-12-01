// *********************************VARIABLES AND DATA TYPES************************************
//1.Average of 3 numbers
import java.util.*;
public class Solution{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
//         int A = sc.nextInt();
//         int B = sc.nextInt();
//         int C = sc.nextInt();
//         int average = (A + B + C) / 2;
//         System.out.println("average is:" + average);
//     }
// }



//2.side of square
// int side = sc.nextInt();
// int area= side * side;
// System.out.println("area of square :" + area);
// }
// }



// 3.items
// float pencil= sc.nextFloat();
// float pen= sc.nextFloat();
// float eraser= sc.nextFloat();
// float total = pencil + pen + eraser;
// System.out.println("bill is:" + total);
// // add on- with 18 %gst
// float newTotal = total + (0.18f * total);
// System.out.println("bill with 18% tax:" + newTotal);

//     }
// }


// ****************************************OPERATORS******************************************
// int x=2, y=5;
// int exp1 = (x*y/x);
// int exp2 = (x*(y/x));
// System.out.println(exp1 + ",");
// System.out.println(exp2);
//     }}
//5,4



//2

// int x=200, y=50, z=100;
// if(x>y && y>z){
//     System.out.println("hello");//faLSE

// }
// if(z>y && z<x){
//     System.out.println("java");//true

// }
// if((y+200) < x && (y+150) < z){
//     System.out.println("Hello Java");//false
// }
//     }
// }



//3
// int x,y,z;
// x=y=z=2;
// x+=y;
// y-=z;
// z/=(x+y);
// System.out.println(x+ "" + y + "" + z);
//     }}//4,0,0


//4
// int x=9,y=12;
// int a=2, b=4, c=6;
// int exp= 4/3 * (x+34) +9 * (a+b*c)+ (3 + y*(2 + a))/(a + b*y);
// System.out.println(exp);
//     }}
//     //278


//5
// int x=10,y=5;
// int exp1 = (y * ( x / y + x /y));
// int exp2 = (y * x /y + y * x / y);
// System.out.println(exp1);
// System.out.println(exp2);
//     }}
//     //20
//     //20




// **************************************SWITCH STATEMENT**************************************
//positive or negative
// int x = sc.nextInt();
// if (x>0){
//     System.out.println("x is greater than 0");
// }else {
//     System.out.println("x is less than 0");

// }
//    }
// }


//fever or not
// double temp = 103.5;
// if(temp>=100){
//     System.out.println("You have a fever");
// }else{
//     System.out.println("You don't have a fever");
// }
//    }
// }


//input week number (1-7) and print day of week name
// System.out.println("Enter week number (1-7):");
// int week = sc.nextInt();
// switch(week){
//     case 1:
//     System.out.println("Monday");
//     break;
//     case 2:
//     System.out.println("Tuesday");
//     break;
//     case 3:
//     System.out.println("Wednesday");
//     break;
//     case 4:
//     System.out.println("Thursday");
//     break;
//     case 5:
//     System.out.println("Friday");
//     break;
//     case 6:
//     System.out.println("Saturday");
//     break;
//     case 7:
//     System.out.println("Sunday");
//     break;
//     default:
//     System.out.println("please enter week no. b/w 1-7");
    
// }
//    }
// }


//4
// int a= 63, b=36;
// boolean x = (a < b)? true : false;
// int y =  (a > b)? a : b;
//    }
// }


// for(int i=0; i<5; i++){
//     System.out.println("Hello");
//     i+=2;
// }
//     }
// }


//WAP THAT READS A SET OF INTEGERS AND THEN PRINTS THE SUM OF THE EVEN AND ODD INTEGERS
// int n;
// int choice;
// int evenSum=0;
// int oddSum=0;
// do{
// System.out.println("enter no. ");
    
//      n= sc.nextInt();
//     if( n % 2 ==0){
//         evenSum += n;
//     }else{
//         oddSum +=n;
//     }
//     System.out.print("Want to continue? press 1 for yes or 0 for no");
//     choice = sc.nextInt();
// }while(choice ==1);
// System.out.println("sum of even no. "+ evenSum);
// System.out.println("sum of odd no. "+ oddSum);
//     }
// }



//Write a program to find the factorial of any number entered by the user.
int num;
int fact =1;//to hold fact
System.out.println("enter no. ");
num = sc.nextInt();
for (int i=1; i<=num; i++){
    fact *=i;
}
 System.out.println("Factorial" + fact);
    }
}