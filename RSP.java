
public class RSP {
	String r="rock";
	String s="scissors";
	String p="paper";
	
	void printResult(String x, String y) {
		if(x.equals(r)&&y.equals(s)) {
			System.out.println("1이 이겼습니다");
		}
		else if(x.equals(y)){
			System.out.println("비겼습니다");
		}
		else 
			System.out.println("2가 이겼습니다");
	}

	public static void main (String[] args){
		RSP z = new RSP();
		String z1 = "rock";
		String z2 = "scissors";
		z.printResult(z1, z2);
	}
}
