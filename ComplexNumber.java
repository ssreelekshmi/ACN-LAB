public class ComplexNumber
{
//for real and imaginary part of complex number
double real,img;
//constructor to intailize the complex number
ComplexNumber(double r,double i)
{
this.real=r;
this.img=i;
}
public static ComplexNumber sum (ComplexNumber c1,ComplexNumber c2)
{
 //creating a temporary complex to hold the sum
ComplexNumber temp=new ComplexNumber(0,0);
temp.real=c1.real+c2.real;
temp.img=c1.img+c2.img;
return temp;
}
public static void main(String args[])
{
ComplexNumber c1=new ComplexNumber(5.5,4);
ComplexNumber c2=new ComplexNumber(1.2,3.5);
ComplexNumber temp=sum(c1,c2);
System.out.printf("sum is :"+temp.real+"+"+temp.img+"i");
}
}

