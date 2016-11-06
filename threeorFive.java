
public class threeorFive {
	Long max = 1000L;
	int firstNum = 3;
	int secondNum = 5;
	int multiple = firstNum * secondNum;

	Long result = 0L;

	int idx = 1;
	while(idx < max) {
	if(idx % firstNum == 0 || idx % secondNum == 0) {
	result += idx;
	}
	idx++;
	}

	System.out.println("배수들의 합 : "+result);

}
}
