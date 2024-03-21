import java.util.Arrays;

public class jagged_array_enchanced_for_loop{
public static void main(String [] args) {
	int a[][]={
		{10,20,30,40},
		{40,50,60},
		{70,80,90,50}
	};
	for(int k[]:a){
		for(int l:k){
			System.out.print(" "+l);
	}
	System.out.println("");
}
}
}