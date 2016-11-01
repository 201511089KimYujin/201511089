import ch.aplu.turtle.*;
public class makeSwirlSquare {
	Turtle t1= new Turtle();
	void drawSwirlSquare(int size, int bigger, int runs, double degree){ 
	       for(int i=0; i<turns;i++){ 
	             if(i%2 !=0){ 
	                 size+=bigger; 
	             }             
	             t1.forward(size); 
	             t1.right(degree); 
	       } 
	     } 
	 public static void main(String[] args){  
         int turns =10; 
         int size =5; 
         int bigger = 15; 
         double degree =90.0; 
         SwirlSquare s = new SwirlSquare();       
         s.makeSwirlSquare(size,bigger,turns,degree); 
     } 
 } 