package basics;

public class StringExample11 {
	public static void main(String[] args) {
		String str= "Krutika";
		char ch = 't';
		str=str.replace(String.valueOf(ch), "a");
		System.out.println(str);
	}
}
