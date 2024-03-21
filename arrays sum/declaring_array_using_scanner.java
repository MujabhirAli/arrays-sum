import java.util.Scanner;
public class declaring_array_using_scanner{
public static void main(String args[]){
int [] a=new int [10];
Scanner in =new Scanner (System.in);
for (int i=0;i<10;i++){
a[i]=in.nextInt();
System.out.println("enter thr number:");
}
}
}