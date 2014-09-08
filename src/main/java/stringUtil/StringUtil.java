package stringUtil;

public class StringUtil {
	StringBuffer sb = new StringBuffer();
	
	public String reverser(String input) {
		sb.insert(0, input);
		String output = sb.reverse().toString();
		return output;
	}

	public String disemvoweler(String input) {
		String output = "";
		for(int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != 'a' && input.charAt(i) != 'e' && input.charAt(i) != 'i' && input.charAt(i) != 'o' && input.charAt(i) != 'u'){
				sb.append(input.charAt(i));
			}
		}
		output = sb.toString();
		System.out.println(output);
		return output;
	}

	public String disemconsonanter(String input) {
		String output = "";
		StringBuffer sb2 = new StringBuffer();
		for(int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u'){
				sb2.append(input.charAt(i));
			}
		}
		output = sb2.toString();
		System.out.println(output);
		return output;
	}

}
