import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {

	public static void main(String[] args) {
		String word = "hello";
        
	    Pattern firstVowelPattern = Pattern.compile("^([aeiouAEIOU])");
	    Matcher matcher = firstVowelPattern.matcher(word);{
	    if (matcher.find()) {
	    	System.out.println(word + "way");
	    }
	    }
	}
}
