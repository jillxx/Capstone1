
//Jiao Xu (pair program with John Aoraha)
//translate english to pig latin.
import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		String cont = "y";

		while (cont.equalsIgnoreCase("y")) {

			System.out.println("Welcome to the Pig Latin Translator!");
			Scanner scnr = new Scanner(System.in);

			// prompt user to input a word
			System.out.println("Please enter a line!");
			String input = scnr.nextLine();
			// split the line by whitespace.
			String[] words = input.split("\\s");
			for (String w : words) {
				// convert to lowercase
				// input = input.toLowerCase();

				// translate to pig latin
				String output = "";
				if (isVowel(w) == true) {
					// if word starts with a vowel (a e i o u), add "way"
					output = translateVowel(w);
				} else {
					// if start with a consonant, move consonant before vowel to the end and add"ay"
					output = translateConsonant(w);
				}

				// display it on the console

				System.out.println(output);
			}
			// prompt user for another word
			// ask the user if he wants too continue
			System.out.println("\nContinue?(y/n): ");
			cont = scnr.next();

		}
		System.out.println("Goodbye!");

	}

	public static boolean isVowel(String word) {

		if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o")
				|| word.startsWith("u") || word.startsWith("a") || word.startsWith("e") || word.startsWith("i")
				|| word.startsWith("o") || word.startsWith("u")) {
			return true;
		}
		return false;

	}

	// translate when start with vowel
	public static String translateVowel(String word) {
		String pigword = word.concat("way");
		return pigword;

	}

	// translate when start with consonant
	public static String translateConsonant(String word) {
		String vowel = "aeiouAEIOU";
		String pigword = "";
		String wordAfter = word;// if no vowel, it give original word+ay
		String wordBefore = "";

		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int vowelIndex = vowel.indexOf(c);
			int wordIndex = word.indexOf(c);

			if (vowelIndex == -1) {// if the word does not has a vowel
				continue;
			} else {
				// split the word at the vowel and cast the front part to the end
				wordAfter = word.substring(wordIndex);

				wordBefore = word.substring(0, wordIndex);
				break;// if find a vowel, piglatin it and break the loop
			}
		}
		pigword = wordAfter + wordBefore + "ay";
		return pigword;
	}
}
