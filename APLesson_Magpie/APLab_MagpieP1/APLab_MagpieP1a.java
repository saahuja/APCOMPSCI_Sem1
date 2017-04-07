public class Magpie2 {
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	public String getResponse(String statement) {
		String response = "";

		if (statement.length() == 0) {
			response = "Say something, please.";
		}

		else if (findKeyword(statement, "no")) {
			response = "Why so negative?";
		}

		else if (findKeyword(statement, "mother") || findKeyword(statement, "father")
				|| findKeyword(statement, "brother") || findKeyword(statement, "sister")) {
			response = "Tell me more about your family.";
		}

		else if (findKeyword(statement, "cat") || findKeyword(statement, "dog") || findKeyword(statement, "fish")
				|| findKeyword(statement, "turtle")) {
			response = "Tell me more about your pet.";
		}

		else if (findKeyword(statement, "Robinette")) {
			response = "He sounds like a pretty dank teacher.";
		}

		else {
			response = getRandomResponse();
		}
		return response;
	}

	private boolean findKeyword(String statement, String goal, int startPos) {
		String phrase = statement.toLowerCase().trim();
		String[] words = phrase.split(" ");
		for (String word : words) {
			String refined_goal = goal.toLowerCase();
			// Special Notes:
			/**
			 * replaceAll() method takes in an expression: For example:
			 * replaceAll("[abc]","1") will replace all a,b,c to 1
			 * 
			 * [abc] a, b, or c (simple class) 
			 * [^abc] Any character except a, b, or c (negation) 
			 * [a-zA-Z] a through z or A through Z, inclusive (range) 
			 * [a-d[m-p]] a through d, or m through p: [a-dm-p] (union)
			 * [a-z&&[def]] d, e, or f (intersection) 
			 * [a-z&&[^bc]] a through z, except for b and c: [ad-z] (subtraction) 
			 * [a-z&&[^m-p]] a through z, and not m through p: [a-lq-z](subtraction)
			 * 
			 * [X+] replace all X's, one or more times 
			 * 
			 */
			String replace_all_special_char = word.replaceAll("[^a-zA-Z]+", "");
			if (replace_all_special_char.contains(refined_goal)
					&& replace_all_special_char.length() == refined_goal.length())
				return true;
		}
		return false;
	}

	/** Override - this method is used if there are only 2 parameters... */
	private boolean findKeyword(String statement, String goal) {
		return findKeyword(statement, goal, 0);
	}

	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}

	public static void debug(String msg) {
		System.out.println(msg);
	}
}