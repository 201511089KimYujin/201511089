
public class reverseHello {
	static void reverseWord(String word){
		char[] c=word.toCharArray();
		StringBuilder re=new StringBuilder();
		
		for(int i=c.length-1;i>=0;i--){
			re.append(c[i]);
		}
		System.out.println(re);
	}
	public static void main(String[] args){
		Hello h = new Hello;
		String hello = "hello";
	    h.reverseWord(hello);
	}

}
