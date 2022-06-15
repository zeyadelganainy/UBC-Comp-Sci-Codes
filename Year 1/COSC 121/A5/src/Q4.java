import java.io.File;

public class Q4 {

	static void listAllFiles(File dir, String spaces) {
		/*
		 * Base case: dir is not a directory 
		 * Recursive call: print the directory name then print the names of all the files inside and then
		 * do the same for every directory in that directory
		 */

		if (dir.isDirectory()) {
			System.out.printf("%s[%s]\n", spaces, dir.getName().toUpperCase());
		}

		File[] filePath = dir.listFiles();
		for (File path : filePath) {
			if (path.isFile())
				System.out.println(" " + spaces + path.getName());
			else
				listAllFiles(path, " " + spaces);
		}

	}

	static void listAllFiles(File dir) {
		listAllFiles(dir, " ");
	}
}
