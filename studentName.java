import java.util.ArrayList;
import java.util.Collection;

public class studentName {
	public String name;
	public int num;
	
	studentName(String name,int num){
		this.name=name;
		this.num=num;
	}
	
	public String getName(){
		return name;
	}
	
	public static void main(String[] args){
		ArrayList<String> studentNameList = new ArrayList<String>();
		studentName s1 = new studentName("yujin 1",1);
		studentName s2 = new studentName("yujin 2",2);
		studentNameList.add(s1.getName());
		studentNameList.add(s2.getName());
		Collection.sort(studentNameList);
		System.out.println(studentNameList);

	}

}
