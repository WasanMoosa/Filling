import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/**
 * Here we process lines one by one from input.txt and then convert those to
 * uppercase and write them in result.txt
 *
 */
public class FileToFile {

	public static void main(String[] args) {
		File inputFile = new File("input.txt");
		File outputFile = new File("result.txt");
		String lineString;

		// try {
		// FileWriter deleting = new FileWriter(outputFile);
		// deleting.write("");
		// deleting.close();
		// } catch (IOException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }

		try {
			Scanner fScanner = new Scanner(inputFile);

			try (FileWriter writer = new FileWriter(outputFile)) {
				while (fScanner.hasNext()) {
					lineString = fScanner.nextLine().toUpperCase();
					writer.write(lineString + "\n");
					writer.flush();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
