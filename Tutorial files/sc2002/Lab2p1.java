package sc2002;
import java.util.Scanner;

public class Lab2p1 {
public static void main(String[] args)
{
int choice;
Scanner sc = new Scanner(System.in);
do {
System.out.println("Perform the following methods:");
System.out.println("1: miltiplication test");
System.out.println("2: quotient using division by subtraction");
System.out.println("3: remainder using division by subtraction");
System.out.println("4: count the number of digits");
System.out.println("5: position of a digit");
System.out.println("6: extract all odd digits");
System.out.println("7: quit");
choice = sc.nextInt();
switch (choice) {
case 1: /* add mulTest() call */
    mulTest();
    break;
case 2: /* add divide() call */
    System.out.println("Enter the quotient followed by the divisor: ");
    int q = sc.nextInt();
    int d = sc.nextInt();
    System.out.println("quotient: "+ divide(q, d));
    break;
case 3: /* add modulus() call */
    System.out.println("Enter the quotient followed by the divisor: ");
    int quo = sc.nextInt();
    int div = sc.nextInt();
    System.out.println("Remainder: " + modulus(quo, div));
    break;
case 4: /* add countDigits() call */
    System.out.println("Enter the number");
    int num = sc.nextInt();
    System.out.println("Number of digits: " + countDigits(num));
    break;
case 5: /* add position() call */
    System.out.println("Enter the number");
    int numb = sc.nextInt();
    int target = sc.nextInt();
    System.out.println("Position of digit: " + position(numb, target)); 
    break;
case 6: /* add extractOddDigits() call */
    System.out.println("Enter the number: ");
    long n = sc.nextLong();
    System.out.println("odd digits: "+ extractOddDigits(n));
    break;
case 7: System.out.println("Program terminating ….");
}
} while (choice < 7);

sc.close();
}

/* add method code here */
public static void mulTest(){
    Scanner sc = new Scanner(System.in);
    int correct = 0;   

    for (int i = 0; i < 5; i++) {
        int a = (int) (Math.random() * 9) + 1;
        int b = (int) (Math.random() * 9) + 1;

        System.out.print("How much is " + a + " times " + b + "? ");
        int answer = sc.nextInt();

        if (answer == a * b) {
            correct++;
        }
    }

    System.out.println(correct + " answers out of 5 are correct.");
    sc.close();
}


public static int divide(int q, int d){
    int count = 0;
    while(q >= d){
        q -=d;
        count++;
    }
    return count;
}

public static int modulus(int q, int d){
    while(q>=d){
        q -=d;
    }
    return q;
}

public static int countDigits(int a){
    int count = 0;
    if(a<0){
        System.out.println("Error! input!!");
        return -1;
    }
    if(a == 0){
        return 1;
    }
    while(a >0){
        a = a/10;
        count++;
    }
    return count;
}

public static int position(int a, int target){
    int pos = 1;
    while(a>0){
        if(a%10 == target){
            return pos;
        }
        else{
            a /= 10;
            pos++;
        }
    }
    return -1;
    
}

public static long extractOddDigits(long a){
    long result = 0;
    int place = 1;
    boolean found = false;
    if(a <= 0){
        System.out.println("Error input!");
        return -1;
    }
    while(a>0){
        if((a%10) % 2 == 1){
            found = true;
            result += place * a%10;
            place *= 10;
        }
        a /= 10;
    }
    return found?result:-1;
}

}