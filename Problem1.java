//Problem number 1 : to find odd/even of a number //
//Difficulty: Easy//

import  java.util.*;
public  class problem1{
    public static void main(String [] args){
        System.out.println("Enter A Number:");
        Scanner MySc= new Scanner(System.in);
        int mynum= MySc.nextInt();
        System.out.println(mynum);
        if (mynum%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
    
}
