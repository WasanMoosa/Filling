import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Read from file, then store them in HashMap
 *
 */
public class FileHashMapTask1 {

	public static void main(String[] args) {
		HashMap<String, String[]> hashDetail = new HashMap<>();
		File myFile = new File("Datatext.csv");
		try {
			Scanner fScanner = new Scanner(myFile);

			while (fScanner.hasNextLine()) {
				String[] details = new String[4];
				String[] detailWithoutID = new String[3];

				details = fScanner.nextLine().split(",");

				for (int i = 1; i < details.length; i++) {
					detailWithoutID[i - 1] = details[i];
				}

				hashDetail.put(details[0], detailWithoutID);
			}
			for (String currentKey : hashDetail.keySet()) {
				System.out.println(currentKey + " " + Arrays.toString(hashDetail.get(currentKey)));

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
