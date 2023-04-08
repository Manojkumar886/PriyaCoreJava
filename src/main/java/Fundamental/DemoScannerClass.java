package Fundamental;

import java.util.Scanner;

public class DemoScannerClass
{
//    Scanner  objname(udn)=new Scanner(System.in) ///Object Creation
    //methods-nextInt ,nextFloat,nextDouble,String-next,nextLine

    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your a value");
        int Avalue=scan.nextInt();
        System.out.println("What is Your b value");
        int Bvalue=scan.nextInt();

        System.out.println("Before swapping a and b value "+"a = "+Avalue+", b = "+Bvalue);

        Avalue=Avalue+Bvalue; //12+24=36
        Bvalue=Avalue-Bvalue; //12-24=-12
        Avalue=Avalue-Bvalue; // 36-12 =24

        System.out.println("After swapping a and b value "+"a = "+Avalue+", b = "+Bvalue);

        System.out.println("What is your name :");
        String Myname=scan.next();
        System.out.println("my name is :"+Myname);
    }
}
