import ch.aplu.turtle.*; 
 Turtle t1=new Turtle(); 
 
 
 void drawStar(int size){ 
 t1.right(40); 
 for(int i=0; i<5; i++){ 
 t1.forward(100); 
 t1.right(150); 
 } 
 } 
 drawStar(70); 
