public class Magpie2 
{
	public String getGreeting() 
	{
		return "Hello, let's talk.";
	}

	public String getResponse(String statement)
	{
		String response = "";
		if (statement.length() == 0) 
		{
			response = "Say something, please.";
		}

		else if (containsKeyWord(statement, "no")) 
		{
			response = "Why so negative?";
		}

		else if (containsKeyWord(statement, "mother") || containsKeyWord(statement, "father")
				|| containsKeyWord(statement, "brother") || containsKeyWord(statement, "sister"))
			{
			response = "Tell me more about your family.";
			}
		else if (containsKeyWord(statement, "cat") || containsKeyWord(statement, "dog") || containsKeyWord(statement, "fish")
				|| containsKeyWord(statement, "turtle")) 
			{
			response = "Tell me more about your pet.";
			}

		else if (containsKeyWord(statement, "Robinette")) 
			{
			response = "He sounds like a pretty dank teacher.";
			}

		else if (containsSection(statement, "I want to"))
			{
			response = transformIWantToStatement(statement);
			}

		else {
			boolean psn = containsKeyWord(statement, "you");

			if (psn && containsKeyWord(statement, "me", 1)) 
			{
				response = transformYouMeStatement(statement);
			} else if (psn && containsKeyWord(statement, "you", 1)) 
			{
				response = transformIYouStatement(statement);
			} else 
			{
				response = getRandomResponse();
			}
		}
		return response;

	}

	private String transformIWantToStatement(String statement) 
	{
		statement = statement.trim().toLowerCase();
		statement = statement.replaceFirst("I want to ", "What would it mean to ");
		statement += "?";
		return statement;
	}

	private String transformYouMeStatement(String statement) 
	{
		String raw = statement.trim().replaceAll("[^a-zA-Z ]+", "");
		raw = raw.replaceFirst("You","").replaceFirst("you","");
		String output ="What makes you think that I" + replaceLast(raw, "me", "you");
		return output;
	}
	
	private String transformIYouStatement(String statement)
	{
		String raw = statement.trim().replaceAll("[^a-zA-Z ]+", "");
		raw = raw.replaceFirst("You","").replaceFirst("I","").trim();
		String output = "Why do you " + raw.replace("you","me");
		return output;
	}
	
	public static String replaceLast(String msg, String replaceFrom, String replaceTo) 
	{
		String output = "";
		if (!msg.contains(replaceFrom)) 
		{
			return msg;
		}

		int length = replaceFrom.length();
		for (int a = msg.length(); a > 0; a--) 
		{
			String sub;
			if (a + length > msg.length()) 
			{
				sub = msg.substring(a);
			} else 
			{
				sub = msg.substring(a, a + length);
			}

			if (sub.equals(replaceFrom))
			{
				output += msg.substring(0, a);
				output += replaceTo;
				output += msg.substring(a + length);
				break;
			}
		}
		return output;
	}
	
	private boolean containsKeyWord(String statement, String goal, int startPos) 
	{
		String phrase = statement.toLowerCase().trim();
		String[] words = phrase.split(" ");
		for (String word : words) 
		{
			String refined_goal = goal.toLowerCase();
			String replace_all_special_char = word.replaceAll("[^a-zA-Z ]+", "");
			if (replace_all_special_char.contains(refined_goal)
					&& replace_all_special_char.length() == refined_goal.length())
				return true;
		}
		return false;
	}
	
	/** Override - this method is used if there are only 2 parameters... */
	private boolean containsKeyWord(String statement, String goal) 
	{
		return containsKeyWord(statement, goal, 0);
	}
	
	private boolean containsSection(String statement, String section) 
	{
		String phrase = statement.toLowerCase().trim();
		if (phrase.contains(section.toLowerCase().trim()))
			return true;
		return false;
	}

	

	private String getRandomResponse() 
	{
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
}