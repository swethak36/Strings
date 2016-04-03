import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class WordCount {
	public static void main(String[] args) {
		// The name of the file to open.
		String fileName = "C:/Users/cgr4075/Desktop/wordcount.txt";

		// This will reference one line at a time
		String line = null;

		try{
			// FileReader reads text files in the default encoding.
			FileReader file1 = new FileReader(fileName);

			// Always wrap FileReader in BufferedReader.
			BufferedReader br = new BufferedReader(file1);

			HashMap<String , Integer> wordCount= new HashMap<String , Integer>();
			while((line = br.readLine()) != null){
				String[] words = line.split("[ \n\t\r.,;:/!?(){}]");

				for (int i = 0 ; i <words.length ; i ++){
					if(!wordCount.containsKey(words[i])){
						wordCount.put(words[i], 1);
					}
					else {
						wordCount.put(words[i], wordCount.get(words[i])+1) ;
					}
				}
			}

			br.close();

			System.out.println("Total words = " + wordCount.size());
			for (String word : wordCount.keySet()) {
	            int count = wordCount.get(word);
	          
	                System.out.println(word + "\t" + count);
	        }
		}

		catch(FileNotFoundException ex) {
			System.out.println(
					"Unable to open file '" + 
							fileName + "'");                
		}
		catch(IOException ex) {
			System.out.println(
					"Error reading file '" 
							+ fileName + "'");                  
			// Or we could just do this: 
			// ex.printStackTrace();
		}





	}

}
