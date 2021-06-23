package 연산;

public class 논리연산자 {

	public static void main(String[] args) {
		// 논리연산자, 조건이 여러개 있을 때 판단의 기준
		// 조건이 모두 만족(and조건, &&)
		// 조건 중 하나만 만족해도 true(or조건, ||)
		// 조건에 해당되지 않을 때 true(not, !)
		// Java 에서는 비교연산자로 비교가능한 것은 기본데이터만 제공!

		// 입력데이터
		int id = 1111;// 회원가입 id는 1111
		int pw = 2222;// 회원가입pw는 2000

		System.out.println(id == 1111);
		System.out.println(pw == 2000);
		System.out.println(id == 1111 && pw == 2000);

		int manager1 = 5555;
		int manager2 = 4444;

		System.out.println(manager1 == 5555 || manager2 == 4000);

		// ctrl + shift + f: 자동 포맷팅(코드 정리)

	}

}
