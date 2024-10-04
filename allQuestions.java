 /*
import java.util.Scanner;
class Test
{
public static void main(String[] args)
{
int age;
Scanner input = new Scanner(System.in);
System.out.println("enter your age:");
age = input.nextInt();
if(age>=18)
{
System.out.println("eligible for voting");
}
if(age<18)
{
System.out.println("Not eligible for voting");
}

}}



//WAP find absolute number


//WAP to check greater number between three numbers

import java.util.Scanner;
class Test
{
public static void main(String[] args)
{
int a,b,c;
Scanner input = new Scanner(System.in);
System.out.println("enter first number:");
a = input.nextInt();
System.out.println("enter second number:");
b = input.nextInt();
System.out.println("enter third number:");
c = input.nextInt();

if(a==b)
{
System.out.println("a is equal to b");
}
else if(b==c)
{
System.out.println("c is equal to b");
}

else
{
System.out.println("a is not equal to b");
}
}}

//WAP to check entered charactor is vowel or not

import java.util.Scanner;
class Test
{
public static void main(String[] args)
{
char ch;
Scanner input = new Scanner(System.in);
System.out.println("enter the charecctor:");
ch = input.next().charAt(0);
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
{
System.out.println("vowel");
}
else
{
System.out.println("constant");
}
}}

//WAP to check enterd number is even or odd

import java.util.Scanner;
class Test
{
public static void main(String[] args)
{
int a;
Scanner input = new Scanner(System.in);
System.out.println("enter first number:");
a = input.nextInt();
if(a%2==0)
{
System.out.println("even");
}
else
{
System.out.println("odd");
}
}}

//WAP to sum of two numbers if condition is true

import java.util.Scanner;
class Test
{
public static void main(String[] args)
{
int a,b;
Scanner input = new Scanner(System.in);

System.out.println("enter first number:");
a = input.nextInt();
System.out.println("enter second number:");
b = input.nextInt();

if(a>b)
{
System.out.println("the sum is"+(a+b));
}
else
{
System.out.println("invalid");
}
}}

//WAP to create a simple calculator(+,-,*,/,%)

import java.util.Scanner;
class Test
{
public static void main(String[] args)
{
char op;
double num1,num2,res=0;
Scanner sc = new Scanner(System.in);

System.out.println("choose operator(+,-,*,/,%)");
op = sc.next().charAt(0);
System.out.println("enter first number:");
num1 = sc.nextInt();
System.out.println("enter second number:");
num2 = sc.nextInt();
if(op=='+')
{
res=num1+num2;
}
else if(op=='-')
{
res=num1-num2;
}
else if(op=='*')
{
res=num1*num2;
}
else if(op=='/')
{
res=num1/num2;
}
else if(op=='+')
{
res=num1+num2;
}
else if(op=='%')
{
res=num1%num2;
}
else
{
System.out.println("enter a valid input");
}
System.out.println(num1 +" "+op+" "+num2+"="+res);
}}

//WAP to find grade of students
*/

import java.util.Scanner;
class Test
{
public static void main(String[] args)
{
double marks;
Scanner sc = new Scanner(System.in);
System.out.println("enter your marks:");
marks = sc.nextDouble();
if(marks>=90 && marks<=100)
{
System.out.println("A Grade");
}
else if(marks>=80 && marks<90)
{
System.out.println("B Grade");
}
else if(marks>=70 && marks<80)
{
System.out.println("C Grade");
}
else if(marks>=60 && marks<70)
{
System.out.println("D Grade");
}
else
{
System.out.println("Fail");
}
}}















