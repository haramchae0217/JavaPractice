public class ThrowException3 {
	public static void main(String[] args) {
		// f(); // 이 위치에서 예외발생. f()가 Exception 예외를 던질 수 있다고 선언했는데, 그에 대한 대응을 하지 않았음.
		System.out.println("This is main().");
	}
	static void f() throws Exception{
		Exception ex = new Exception();
		throw ex;
	}
}
