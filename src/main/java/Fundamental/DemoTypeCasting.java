package Fundamental;

public class DemoTypeCasting
{
    public static void main(String[] args)
    {
//        Widening-Smaller to larger performance

        char myvalue='a';
        int ALetterAsciValue=myvalue;
        System.out.println("My value is :"+myvalue+" my value is  A -ASCI NO "+ALetterAsciValue);
//        Narrowing-Larger to smallest

        double myCGPA=8.1;
        short CGPASHORTVALUE=(short) myCGPA;

        System.out.println("my college CGPA is "+CGPASHORTVALUE);

//        int a=10,b=20;
//        float c=8.72f;
//
//        int d=(int)(c+a+b);
//        System.out.println(d);


    }
}
