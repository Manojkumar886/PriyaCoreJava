package Fundamental.OPerator;

import Fundamental.Variables.AlltypeOfVariables;

public class AllTypeOfOperator
{
    static int ba=10;
    int ab=10;
    public static void LogicalOperator()
    {
        System.out.println("Welcome to Logical Operator");

    }
    public  void BitwiseOperator()
    {
        System.out.println(ba);//static variable
        System.out.println(ab+" global variable");//global variable
        int a=10;//Local Variable
        System.out.println("this is local variable a=  "+a);
        System.out.println("In this method is bitwise operator");
    }
    public static void main(String[] args)
    {


        LogicalOperator();

        //classname objname(udn)=new classname();

        AllTypeOfOperator obj=new AllTypeOfOperator();
        obj.BitwiseOperator();
        System.out.println(obj.ab);//global variable
        System.out.println(ba);//static variable
    }
    static
    {
        System.out.println("welcome to opertors");
    }
}
