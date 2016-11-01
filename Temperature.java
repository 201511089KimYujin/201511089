
public class Temperature {
	void change(String x, double y) {
		double z;
		
		if(x.equals("F")) {
			z=(y-32f)/1.8f;
			System.out.println("User input "+x+" "+y);
			System.out.println("change"+"C"+z);
		}
		else if(x.equals("C")){
			z=(y*1.8f)+32f;
			System.out.println("User input" +x+ " " +y);
			System.out.println("change"+"F"+z);
		}
		
	}
	
	public static void main(String[] args){
		Temperature t = new Temperature();
		t.change("C", 30.0f);
		Temperature e = new Temperature();
		e.change("F",30.0f);
	}

}
