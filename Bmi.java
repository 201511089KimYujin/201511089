
public class Bmi {
	void showBmi() {
		float weight=(float)75.0;
		float height=(float)1.7;
		float bmi=(float)weight / (height*height);
		System.out.println(bmi);
		if(bmi >=18.5 && bmi<=24.99) {
			System.out.println("normal");
		}else if(bmi>=25&& bmi <=29.9) {
			System.out.println("over");
		}
	}
	public static void main(String[] args) {
	Bmi b = new Bmi();
	b.showBmi();
	}
}
