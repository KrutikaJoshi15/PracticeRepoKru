package basics;
// remove all the vowels from a given String
public class CharacterExample1 {
	public static void main(String[] args) {
		String str= "teoochnoocreediouts";
		str= str.replace("a", "")
				.replace("e", "")
				.replace("i", "")
				.replace("o", "")
				.replace("u", "");
		
		System.out.println(str);
	}
}
