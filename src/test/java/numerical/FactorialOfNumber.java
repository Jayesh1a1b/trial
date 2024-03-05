package numerical;

public class FactorialOfNumber {

	public static void main(String[] args) {
	int n=5;
int fact=1;//fact of 5=5*4*3*2*1=120
	for(int i=n;i>=1;i--)
	{
		fact=fact*i;
	}
	System.out.println(fact);
	}

}
