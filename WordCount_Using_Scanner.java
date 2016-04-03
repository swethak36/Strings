import java.util.*;
import java.io.*;

public class WordCountNew {
	public static void main(String[] args) throws FileNotFoundException {
		// open the file

		String fileName = "C:/Users/cgr4075/Desktop/wordcount.txt";
		File textfile = new File(fileName);
		Scanner input = new Scanner(textfile);

		// count occurrences
		Map<String, Integer> wordCounts = new HashMap<String, Integer>();
		while (input.hasNext()) {
			String next = input.next().toLowerCase();
			if (!wordCounts.containsKey(next)) {
				wordCounts.put(next, 1);
			} else {
				wordCounts.put(next, wordCounts.get(next) + 1);
			}
		}
		
		input.close();

		System.out.println("Total words = " + wordCounts.size());

		for (String word : wordCounts.keySet()) {
			int count = wordCounts.get(word);
			System.out.println(count + "\t" + word);
		}
	}
}
