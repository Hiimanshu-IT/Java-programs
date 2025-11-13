import java.util.*;
public class Javabasic {
   public static void main (String[]args){
    System.out.println("enter your income");
    Scanner sc = new Scanner (System.in);
    int income = sc.nextInt();
    float tax;
    if(income<500000){
        tax = 0;
        System.out.println("there is no tax for you enjoyy");
    }
    else if (income>=500000 && income<100000){
        tax = income*0.2f;
    }
    else{
        tax = income*0.3f;
    }
System.out.println("your tax is " + tax );
   }
 }
