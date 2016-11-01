
public class Grade {
	String result;
	
	 Char resultGrade(double score) {
		if(90<=score && score<=100){
			result="Grade is A";
			return result;
			}
		
	    else if(80<=score && score<90){
		result="Grade is B";
		return result;
	}

	    else if(70<=score && score<80){
			result="Grade is C";
			return result;
		}
	    else if(60<=score && score<70){
	    	result="Grade is D";
	    	return result;
	    }
	    else{ 
	    	result = "Grade is F";
	        return result;
	    }
}

	void printGrade(char x) {
		System.out.println("You enterd marks grade" +x );
	}
	
	public static void main(String[] args) {
		Grade g = new Grade();
		double[] s = {91.5, 81.5, 71.5, 61.5, 51.5, 41.5};

		for (double i:s) {
			char y=g.resultGrade(i);
			g.printGrade(y);
		}
	}
}