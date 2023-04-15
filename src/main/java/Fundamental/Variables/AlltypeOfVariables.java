package Fundamental.Variables;

import java.util.Scanner;

public class AlltypeOfVariables
{
    int a =10;//Global Variable
//    static keyword- static variable,Static block,static method
//    Variable -Stored the data (datatype variablename=data or value)
//    Types- Instance Variable,Local Variable,Static Variable,Global Variable
//    Method- a set of codes which perform a particular task is called method or function.
//    syntex:
//    Accessmodifier ReturnType MethodName-udn()
//      {
//          //set of codes
//      }
//  Objeact Creation Syntex:  Classname objname=new Classname();

    public void LocalPerformance()
    {
        Scanner scans=new Scanner(System.in);
        System.out.println("Swap method using third variable");
        Scanner scan=new Scanner(System.in);//Local Variable
        System.out.println("What is your a value");
        int Avalue=scan.nextInt();//Local Variable
        System.out.println("What is Your b value");
        int Bvalue=scan.nextInt();

        System.out.println("Before swapping a and b value "+"a = "+Avalue+", b = "+Bvalue);
        int Cvalue; //local Variable
//        a=12,b=10
        Cvalue=Avalue; //c=12
        Avalue=Bvalue; //a=10
        Bvalue=Cvalue; //b=12

        System.out.println("After swapping a and b value "+"a = "+Avalue+", b = "+Bvalue);
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is Your Father Name");
        String FatherName=scan.next();//Fathername variable-Instance Variable
        System.out.println("My Father name is :"+FatherName);

        System.out.println("MY static variable value is :"+AadharNumber);

//        Object Creation
        AlltypeOfVariables variables=new AlltypeOfVariables();
        variables.LocalPerformance();
        variables.GlobalAccessed();

        staticMethod();
    }

    public void GlobalAccessed()
    {
        System.out.println("MY static variable value is :"+AadharNumber);
        System.out.println("My global variable is CGPA ,That value :"+CGPA);//
        System.out.println(a);//Global Variable
    }
    double CGPA=6.5;//Global Variable

    static Long AadharNumber=889089765713232323l;//Static Variable

    static //static block
    {
        System.out.println("Welcome to Variable Types ........!");
    }

    public static void staticMethod()// static method
    {
        char myvalue='a';//Local Variable
        int ALetterAsciValue=myvalue;
        System.out.println("My value is :"+myvalue+" my value is  A -ASCI NO "+ALetterAsciValue);
    }

}
