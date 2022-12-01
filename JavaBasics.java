// public class JavaBasics{
//     public static void main(String args[]){
// System.out.print("Hello World");
//     }
// }
// //boilerplate code


//****************PRINT PATTERN*******************
// public class JavaBasics{
//     public static void main(String args[]){
// System.out.println("* * * *");
// System.out.println("* * * ");
// System.out.println("* *  ");
// System.out.println("*  ");
//     }
// }


//*****************************************VARIABLES*****************************************
// public class JavaBasics{
//     public static void main(String args[]){
//         int a= 10;
//         int b= 5;
// System.out.println(a);
// System.out.println(b);
// String name="Tony Stark";
// System.out.println(name);
// a=b;
// System.out.println(a);


//     }}


//********************************************DATA TYPE******************************************
//Sum Of a&b //int a=10; int b=5; int sum= a+b;
// public class JavaBasics{
//     public static void main(String args[]){
//         int a=10;
//         int b=5;
//         int sum=a+b;
//         System.out.println(sum);
//     }
// }


//*******************************************INPUT***********************************************
// import java.util.*;
// public class JavaBasics{
//    public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     // String input = sc.next();
//     String input = sc.nextLine();
//     System.out.println(input);
//    }}

//******************************PRODUCT of a&b //a*10 b*5 int prod = a*b*************************
// import java.util.*;
// public class JavaBasics{
//    public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int a =sc.nextInt();
//     int b =sc.nextInt();
//     int product =a*b;
//     System.out.println(product);
//    }
// }

//*******************************************sum of a&b******************************************
// import java.util.*;
// public class JavaBasics{
//    public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int a =sc.nextInt();
//     int b =sc.nextInt();
//     int sum = a+b;
//     System.out.println(sum);
//    }
// }

//*****************************************area of circle pie r^2******************************** 
// import java.util.*;
// public class JavaBasics{
//    public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     float rad =sc.nextFloat();
//     float area = 3.14f * rad * rad;
//     System.out.println(area);
//    }
// }
    



//******************************************TYPE CONVERSION**************************************
//possible conversions
/*byte->short->int->float->long->double
"long" data save only->"double"
"float" data save only ->"long" & "double" */
// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//      Scanner sc = new Scanner(System.in);
//     //  int number = sc.nextfloat();
//     float number = sc.nextInt();
//      System.out.println(number);
//     }
// 

// *****************************************TYPE PROMOTION***************************************
import java.util.*;
 public class JavaBasics{
//    public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     char a = 'a';
//     char b = 'b';
//     System.out.println((int)a);
//     System.out.println((int)b);
//     System.out.println(b-a); 
//     }}


// ***********************************CONDITIONAL STATEMENTS*************************************

// int age =16;
// // int age =22;
// if(age >=18){
//     System.out.println("Adult");
// }
// if(age >13 && age <18){
//     System.out.println("Teenager");
// }
// else{
//     System.out.println("Not Adult");
// }
//    }
// }




//print the largest of 2
// a=1, b=3
// int A=1, B=5;
// if(A>=B){
//     System.out.println("A is largest of 2");

// }
// else{
//     System.out.println("B is largest of 2");
// }
//    }
// }



//print if a number is odd and even
// int n = sc.nextInt();
// if(n%2==0){
//     System.out.println("even");

// }
// else {
//     System.out.println("odd");

// }
//    }
// }



//elseif
// int age =13;
// if(age >=18){
//     System.out.println("adult");
// }
// else if(age>=13 && age <18){
//     System.out.println("teenager");
// }
// else{
//     System.out.println("child");
// }
//    }
// }


// ************************************************************************************************
//income tax calculator
// income <5L - 0%tax
//income 5-10l - 20%tax
//income >10l - 30% tax
// int income = sc.nextInt();
// int tax;
// if(income <500000){
// tax = 0;
// }
// else if(income >= 500000 && income <1000000){
//     tax = (int) (income * 0.2);
// }
// else{
//     tax = (int) (income * 0.3);
// }
// System.out.println("your tax is :" + tax);
//    }
// }




//print the largest of 3
// int A=1, B=3, C=6;
// if((A>=B) && (A>=C)){
//     System.out.println("Print A");
// }
// else if(B>=C){
//     System.out.println("Print B");
// }
// else{
//    System.out.println("Print C");
// }
//    }
// }



// ***********************************************TERNARY OPERATOR**************************************
// int number = 4;
// String type = {{number % 2 } ==0} ? "even" : "odd";
// System.out.println(type);
//    }

   

//check if students will pass or fail
// int marks = 67;
// String reportCard = marks >=33 ? "Pass" : "Fail";
// System.out.println(reportCard);
//    }
// }



// ****************************************SWITCH STATEMENT***********************************************
// int number = 2;
// switch (number){
//     case 1: System.out.println("samosa");
//             break;
//     case 2: System.out.println("burger");
//             break;
//     case 3: System.out.println("mango shake");
//             break;
//     default: System.out.println("we wwake up");
// }
//    }
// }



//calculator
//+,-,*,/,%
// System.out.println("enter a: ");
// int a= sc.nextInt();
// System.out.println("enter b: ");
// int b= sc.nextInt();
// System.out.println("enter operator: ");
// char operator =  sc.next().charAt(0);//for single char input

// switch (operator){
//     case '+': System.out.println(a+b);
//     break;
//     case '-': System.out.println(a-b);
//     break;
//      case '*': System.out.println(a*b);
//     break;
//      case '/': System.out.println(a/b);
//     break;
//      case '%': System.out.println(a%b);
//     break;
//     default : System.out.println("wrong operator");
// }
//    }
// }



// *************************************************WHILE LOOPS********************************************
// int counter = 0;
// while (counter < 10){
//     System.out.println("Hello World");
//     counter++;
// }

// System.out.println("printed HELLO WORLD 10x");
//    }
// }


//print number 1 to 10
// int counter =1;
// while (counter <= 10){
//     System.out.println(counter);
//     counter++;
// }
// System.out.println("1 to 10");
//    }
// }


//1to n
// int range = sc.nextInt();
// int counter =1;
// while(counter <= range){
//     System.out.println(counter +"");
//     counter++;
// }
// System.out.println();
//    }
// }

//sum of first n no.
// int range = sc.nextInt();
// int sum = 0;
// int counter =1;
// while (counter <= range){
//     sum = sum + counter;
//     counter++;
// }
// System.out.println("sum is :" + sum);
//    }
// }
// int ++a = 100;
// System.out.println(++a);
//    }
// }
// int count =1;
// while (count <=15){
//     System.out.println(count % 2==1 ? "***" :"+++++");
//     ++count;
// }
//    }
// }
// int x=3,y=5,z=10;
// System.out.println(++z+y-y+z+x++);
//    }
// }



// int meal =5;
// int tip =2;
// int total = meal +(meal >6 ? ++tip : --tip);
// System.out.println(total);
//    }
// }



// ***************************************************FOR LOOPS******************************************
// for(int i=1; i<=10; i++)//i= i+1
// {
//     System.out.println("hello world");
// }
//    }
// }

//square pattern
// for (int i=1; i<=4; i++){
//     System.out.println("****");
// }
//    }
// }

// int i =1;
// while (i <=4){
//     System.out.println("****");
//     i++;
// }
//    }
// }


//print REVERSE of a number
//10899
// int n =10899;
// while (n>0){
//     int lastDigit =n%10;
//     System.out.print(lastDigit);
//     n = n/10;
// }
// System.out.println();
//    }
// }


//reverse the given number 
// int rev=0;
// int n= 10899;
// while(n>0){
//     int lastDigit = n%10;
//     rev = (rev *10) + lastDigit;
//     n = n/10;
// }
// System.out.println(rev);
//    }
// }




//*********************************************DO WHILE LOOP*****************************************
// int i =1;
// do{
//     System.out.println("Hello World");//kaam phle or condition baad me check
//     i++;
// }while(i <=10);
//    }
// }




//BREAK STATEMENT
// to exit the loop
// for (int i=1; i<=5; i++){
//     if(i==3){
//         break;
//     }
//     System.out.println(i);
// }
// System.out.println("I am out of the loop");
//    }
// }



//ques- KEPP ENTERING NUMBERS TILL USER ENTERS A MULTIPLE OF 10
// do{
//     System.out.print("enter your no.:");
//     int n = sc.nextInt();
//     if(n % 10 == 0){//agr no. 10 ka multiple hai to break
//         break;
//     }
//     System.out.println(n);
// } while (true);
//    }
// }



//CONTINUE STATEMENT
//to skip an iteration
// for (int i=1; i<=5; i++)
// {
//     if (i==3){
//         continue;
//     }
//     System.out.println(i);
// }
//    }
// }


//DISPLAY ALL NUMBERS ENTERED BY USER EXCEPT MULTIPLES OF 10
//1, 5, 7, 25,35
// do{
//     System.out.print("enter no. -");
//     int n = sc.nextInt();
//     if ( n % 10 ==0){
//         continue;
//     }
//     System.out.println("number was :"+n);
// }while(true);
//    }}




//CHECK IF A NUMBER IS PRIME OR NOT
//prime: 2, 3, 5, 7, 11 input - n 
// int n = sc.nextInt();
// if(n ==2){
//     System.out.println("n is prime");
// }else{
// boolean isPrime =true; //assume my no. is prime
// for (int i=2; i<=Math.sqrt(n); i++){//underroot n
//     if(n% i ==0){//n is a multiple of i (i is not equal to 1 or n)
//         isPrime =  false; //n is a composite no.
//     }
// }
// if(isPrime==true){
//     System.out.println("n is prime");

// }
// else{
//     System.out.println("n is not prime");
// } 
// }
// }
//  }



//******************************************************NESTED LOOP******************************************
//PRINT STAR PATTERN //LINES(4) OUTER LOOP-4 TIMES
//NUMBER OF TIMES(i) INNER LOOP- i TIMES
//WHAT TO PRINT?
// for (int i=1; i<=4; i++){
//     for(int j=1; j<=i; j++){
//         System.out.print("*");
//     }
//     System.out.println();//for next line
// }
//    }
// }



//INVERTED STAR PATTERN
// int n=4;
// for(int i=1; i<=n; i++ ){
//     for(int j=1; j<=n-i+1; j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
//    }
// }




//HALF PYRAMID PATTERN
// int n= 4;
// for (int line =1; line<=n; line++){
//     for(int number =1; number <= line; number++){
//         System.out.print(number);
//     }
//     System.out.println();
// }
//    }
// }



//CHARACTER PATTERN
// int n=4;
// char ch = 'A';
// for(int line =1; line<=n; line++){
//     for(int chars=1; chars<=line; chars++){
//   System.out.print(ch);
//   ch++;
//    }
//     System.out.println();
// }
//    }
//  }



//**************************************************FUNCTIONS AND METHODS************************************
// public class JavaBasics{
//     public static void printHelloWorld(){
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         System.out.println("Hello World");
//         return;
//     }
//     public static void main(String args[]){
//         printHelloWorld();
//     }
// }



// public static void calculateSum(){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int sum = a+b;
//     System.out.println("Sum is :"+sum);
// }
// public static void main(String args[]){
//  calculateSum();
// }
//  }


//2nd Method
//*****************************************************PARAMETERS************************************** */
// public static void calculateSum(int a, int b){
//     int sum = a + b;
//     System.out.println("Sum is :" + sum);
// }
// public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     calculateSum(a, b);
// }
//  }




//*********************************************SWAPPING***********************************
//CALL BY VALUE
//  public static void main(String args[]){
//     int a = 5;
//     int b = 10;
// //swap
//     int temp = a;
//     a=b;
//     b = temp;
//     System.out.println("a is : "+a);
//     System.out.println("b is : "+b);
//  }
// }


//SWAPPING IN FUNCTION
// public static void swap(int a, int b){
//         int temp = a;
//         a=b;
//         b = temp;
//         System.out.println("a is : "+a);
//         System.out.println("b is : "+b);
// }
// public static void main(String args[]){
//        int a = 5;
//        int b = 10;
//        swap(a,b);
// }
//  }


//PRODUCT OF A & B
// public static int multiply(int a, int b){
//     int product = a * b;
//     return product;
// }
// public static void main(String args[]){
//     /*// int a =3;
//     // int b = 5;*/
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int prod = multiply(a,b);
//     System.out.println("a * b =" + prod);
    
// }
//  }


//Factorial

// public static int factorial(int n){
//     int f = 1;
//     for(int i=1; i<=n; i++){
//         f = f * i;
//     }
//     return f;

// }
// public static void main(String args[]){
//    System.out.println(factorial(6));

// }
//  }


//************************************************BINOMIAL COEFFICIENT ************************************
// public static int binCoeff(int n, int r){
//     int fact_n = factorial(n);
//     int fact_r = factorial(r);
//     int fact_nmr = factorial(n-r);
//     int binCoeff = fact_n / (fact_r * fact_nmr);
//     return binCoeff;
// }
// public static void main(String args[]){
//     System.out.println((binCoeff(5,2))); //n=5 r=2
// }
//  }



//*************************************************FUNCTION OVERLOADING ************************************
//func to calc sum of 2 no.
//function perform using no. of parameters
// public static int sum (int a , int b){
//     return a + b;
// }
// //funct to calc sum of 3 nums
// public static int sum (int a, int b, int c){
//     return a + b + c;
// }
// public static void main(String args[]){
//     System.out.println(sum(3,5));
//     System.out.println(sum(5,2,1));
// }
//  }



//fuct to calc int sum 
// public static int sum (int a, int b){
//     return a+b;
// }
// //func to calc float sum
// public static float sum (float a, float b){
//     return a+b;
// }
// public static void main(String args[]){
//     System.out.println(sum(3,5));
//     System.out.println(sum(3.2f,4.8f));
// }
//  }





//CHECK IF A NUMBER IS PRIME OR NOT
// public static boolean isPrime(int n){
//      boolean isPrime = true; 
//     for(int i =2; i<=n-i; i++){
//        if(n % i ==0); //completly divide
//         isPrime = false;
//     }
//     return isPrime;
// }
// public static void main(String args[]){
// System.out.println(isPrime(13));
// }
//  }




//OPTIMISED WAY
// public static boolean isPrime(int n){
//     if (n == 2){
//         return true;
//     }
// for(int i =2; i<=Math.sqrt(n);i++){
//     if(n% i == 0 ){
//     return false;
//     }
// }
// return true;
// }
// public static void primesRange(int n){
//     for(int i=2; i<=n; i++){
//         if(isPrime(i)){//tre
//          System.out.print(i+ " ");
//         }
//     }
//     System.out.println();//print next line
//  }
//  public static void main(String args[]){
//     primesRange(40);
//  }
// }



// public static void main(String args[]){
// System.out.println(isPrime(16));
// }
//  }

 



// public static void binToDec (int binNum){
//     int myNum = binNum;
//     int pow=0;
//     int decNum = 0;
//     while(binNum>0){
//         int lastDigit = binNum % 10;
//         decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
//         pow++;
//         binNum = binNum /10;
//     }
//     System.out.print(" decimal of "  + myNum + " = " + decNum);
// }
// public static void main(String args[]){
//     binToDec(101);
// }
//  }




//dectobin
public static void decToBin(int n){
    int myNum = n;
    int pow = 0;
    int binNum = 0;
    while (n>0){ //given no. > 0
        int rem = n%2; //lastdigit 2 ke sath rem nikal ke
        binNum = binNum + (rem * (int)Math.pow(10,pow)); 
        pow++; 
        n = n/2;
    }
    System.out.println("Binary form of " + myNum + " = " + binNum);
}
public static void main(String args[]){
    decToBin(10);
}
 }