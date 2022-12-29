import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Take input from user and store it in data.csv file
 *
 */
public class InputToFile {

	public static void main(String[] args) {
		String name;
		String Email;
		Integer ans = 1;
		Scanner str = new Scanner(System.in);

		File myFile = new File("Data.csv");
		try (FileWriter writer = new FileWriter(myFile, true)) {
			while (ans == 1) {

				String[] array = new String[3];
				System.out.print("Enter your name:");
				name = str.nextLine();
				System.out.print("Enter your Email:");
				Email = str.nextLine();

				writer.write(name + "," + Email + "," + "true\n");

				writer.flush();
				System.out.print("Do you want to register another name, if yes press 1?");
				ans = Integer.parseInt(str.nextLine());
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		/////////////////////////////////////////

	}

}
