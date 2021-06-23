package 연산;

public class MyInfo {

	public static void main(String[] args) {
		//나의 대한 정보
		//이름, 나이, 키, 성별, 점심먹었나요?
		//string은 무조건 ""
		
		String name = "김민욱";//스트링(문자열)
		int age = 28;
		double weight = 85.5;
		char gender = 'm';
		boolean food = true;//or false
		weight = weight - 10;
		
		System.out.println(name);
		System.out.println(age + 1);
		System.out.println(weight);
		System.out.println(gender);
		System.out.println(food);
		
		
	}

}
