
public class Method {


	public static void main(String[] args) {
		TestClass tClass = new TestClass(new A("필드"), new B(1, 2));
	}

}
 
 class TestClass {

	public TestClass(A a, B b) {
	
	}
	
	
}
class A {
		public A(String string) {
			System.out.println(string);
		}


	}
class B {

public B(int i, int j) {
	System.out.println(i);
	System.out.println(j);
	}


}
