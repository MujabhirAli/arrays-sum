import java.util.Scanner;
public class even_odd{
public static void main(String [] args) {
	int e=0,o=0;
Scanner in = new Scanner(System.in);
System.out.println("enter the limit:");
int n=in.nextInt();
int a[]=new int[n];
for (int i=0;i<n;i++){
	System.out.println("enter a["+i+"]value:");
	a[i]=in.nextInt();	
}
for (int element:a){
	if(element%2==0){
		e++;
	}else{
		o++;
	}
}
	System.out.println("total even number:"+e);
		System.out.println("total odd number:"+o);

}
}