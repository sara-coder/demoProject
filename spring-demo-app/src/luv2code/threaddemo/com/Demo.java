package luv2code.threaddemo.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Demo {
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String [] args){
		
            int a = 5;
            int b = 3;
            int n = 5;
            for(int ol=0;ol<n;ol++){
                int temp =0;
                for(int il=0;il<=ol;il++){
                   int sum = (int)Math.pow(2,ol)*b;
                    temp = temp + sum;
                }
                System.out.println(a+temp+" ");
            }
        }}

 class Test {
public void methodOne(int i)
{
System.out.println("int-arg method");
}
public void methodOne(float f) //overloaded methods
{
System.out.println("float-arg method");
}
public static void main(String[] args)
{
Test t=new Test();
t.methodOne('a');//int-arg method
t.methodOne(10l);//float-arg method
//t.methodOne(10.5);//C.E:cannot find symbol
}
}
 class ListFileDemo{
 public static void main(String[] args) throws IOException
 { PrintWriter pw=new PrintWriter("F:\\JavainterviewPreparation\\file3.txt");
 BufferedReader br=new BufferedReader(new
		 FileReader("F:\\JavainterviewPreparation\\file1.txt"));
		  String line=br.readLine();
		 while(line!=null)
		  {
		 pw.println(line);
		 line=br.readLine();
		  }
		 br=new BufferedReader(new FileReader("F:\\JavainterviewPreparation\\file2.txt")); //reuse
		 line=br.readLine();
		 while(line!=null)
		  { 
		 pw.println(line);
		 line=br.readLine();
		 }
		 pw.flush();
		 br.close();
		 pw.close();}
 }
 
