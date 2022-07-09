
public class IncrementExample {
	
	public static void main(String args) {
		
		int a =10;
		System.out.println(a);
		++a;
		System.out.println(a);
		//증감 연산자의 전위, 후위 수식
		// 피연산자의 앞에 수식이 붙는 경우
		// 피연산자의 뒤에 수식이 붙는 경우

		a=100;
		System.out.println("a++=" + a++);
		System.out.println("++a=" + ++a);
		
	}

}
