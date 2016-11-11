import java.util.ArrayList;
import java.util.Scanner;
 
public class printList {
	
	Scanner input = new Scanner(System.in);
	int sum=0;
	
	
	for(int i=1; i<=1000; i++) {
		if(i%4==0){
			
			sum+=i;
		}
		else if (i%5!=0){
			
			sum+=i;
		}
	}
	System.out.println(count);
}
