package numerical;

public class SwappingOfTwoValueWithoutThirdVariable {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		
		System.out.println("before swapping values "+a+" "+b);
		//BY USING addition and subtraction
		/*a=a+b;//30
		b=a-b;//30-20=10
		a=a-b;//30-10=20*/
		
		//by uSiNg * aND /
		// a and b Is Not zero
		a=a*b;//10*20=200
		b=a/b;//200/20=10
		a=a/b;//200/10=20
		
		System.out.println("after swapping values "+a+" "+ b);

	}

}
