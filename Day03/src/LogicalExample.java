
public class LogicalExample {
 public static void main(String[] args) {
	 int a = 10;
	 int b = 11;
	 int c = 15;
	 int d = 3;
	 
	 boolean result = a>b;
	 
	 result = result && c>d ;
	 System.out.println(result);
	 
	 result = true && true;
	 System.out.println("true && true="+result);
	 
	 result = false || true;
	 System.out.println("false || true="+result);
	 
	 result = true || false;
	 System.out.println("true || false="+result);
	 
	 result = true || true;
	 System.out.println("true || true="+result);
	 
	 
	 // --! 반대
	 
	 result = false;
	 System.out.println("!result="+ !result);
	 System.out.println(!(10>1));
	 
	 
	 // and or 연산
	 
	 int x = 10;
	 int y =20;
	 result = (x*100 > y*100) &(++x>++y);
	 
	 System.out.println("result="+ result);
	 System.out.println("x="+x);
	 System.out.println("y="+y);
	 
	 result = (x<y)&& (x++ < y--);
	 System.out.println("result="+result);
	 System.out.println("x="+x);
	 System.out.println("y="+y);
	 
	 result = (x>y) || (x++ < y--);
	 System.out.println("result="+result);
	 System.out.println("x="+x);
	 System.out.println("y="+y);
	 
	 
	 
	 
	 
	 
 }
}
