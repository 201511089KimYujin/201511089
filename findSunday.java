import java.util.Calendar;

public class findSunday {
	void sunday() {
		int count = 0;
		Calendar start = Calendar.getInstance();
		for(int i= 1901; i <=2000; i++) {
			for(int j=0; j<12; j++) {
				start.set(i, j,1);
				if(start.get(Calendar.DAY_OF_WEEK)==1){
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args){
		findSunday f = new findSunday();
		f.sunday();
	}
	

}
