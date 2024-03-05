package numerical;

public class RepitativeCharacterInString {

	public static void main(String[] args) {
		String s="my name is jayesh";
		String s1 = s.replaceAll("y", "");
int OL = s.length();
int WL = s1.length();
int Rc=OL-WL;
System.out.println("repititative character y "+Rc);
	}

}
