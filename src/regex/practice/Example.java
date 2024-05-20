package regex.practice;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Example {
	
	public Example() {}

	public static void main(String[] args) {

//		Pattern pattern = Pattern.compile("nap time", Pattern.CASE_INSENSITIVE);
//		Matcher matcher = pattern.matcher("Every morning starts with some nap time!");
//		
//		System.out.println(matcher.find());
		
//		Pattern pattern = Pattern.compile("gr[ae]y");
//		Matcher matcher = pattern.matcher("Vibrant light bloomed across the gray sky, illuminating its grey haze in flashes amidst rolling hills of wispy gray clouds. Colors of gold, pink, and purple painted the horizon, the dull grey of the sky overtaken by brief moments of a quiet twilight storm.");
//		
//		int count = 0;
//		while(matcher.find()) count++;
//		System.out.println(count);
		
				
		/* count the number of new lines in the next string */
//		String string = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10";
//		
//		Pattern pattern = Pattern.compile("\n");
//		Matcher matcher = pattern.matcher(string);
//		
//		int count = 0;
//		while (matcher.find()) count++;
//		System.out.println(count);
		
		
		/* QUANTIFIERS */
//		String[] strings = {"CCQQ", "QQCC", "CQQ", "QUACK", "CCQ", "CQC", "CQQQ", "CCCQQ"};
//		
//		Pattern pattern = Pattern.compile("C+Q{2}");
//		
//		for(String s: strings) {
//			Matcher matcher = pattern.matcher(s);
//			System.out.println(matcher.matches());
//		}
		
		
		/* ALTERNATION */
		Pattern pattern = Pattern.compile("gray|grey");
		Matcher matcher = pattern.matcher("Vibrant light bloomed across the gray sky, illuminating its grey haze in flashes amidst rolling hills of wispy gray clouds. Colors of gold, pink, and purple painted the horizon, the dull grey of the sky overtaken by brief moments of a quiet twilight storm.");
		
		int count = 0;
		while(matcher.find()) {
			count++;
		}
		System.out.println(count);
	}

}
