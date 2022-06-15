import java.io.*;

public class Bonus {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("Backing up...");
		int numOfPieces = BackupRestore.backup("syllabus.pdf", 0.25);
		System.out.println("Restoring...");
		BackupRestore.restore("syllabus.pdf", numOfPieces);
		long finish = System.currentTimeMillis();
		System.out.println("Done in " + (finish - start) + "ms");
	}

	public static int backup(String filename, double partSize) {
		File f = new File(filename);
		double fileSize = f.length();
		DataOutputStream dos;
		boolean EOF = false;
		int parts = (int) (Math.ceil(fileSize / (partSize * 1000000)));
		try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(filename)))) {
			for (int i = 1; i <= parts; i++) {
				int count = 0;
				dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filename + "." + i + ".pdf")));
				while (!EOF) {
					dos.write(dis.read());
					count++;
				}
				dos.close();
			}

		} catch (EOFException e) {
			EOF = true;
		} catch (IOException e) {
			System.out.println("IOException error.");
			return -1;
		}

		return parts;
	}

	public static int restore(String filename, int numberOfPieces) {
		File f = new File(filename);
		try (DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream(filename + "1.pdf")))) {
			for (int i = 1; i <= numberOfPieces; i++) {
				DataInputStream dis = new DataInputStream(
						new BufferedInputStream(new FileInputStream(filename + "." + i + ".pdf")));
				while (dis.available() > 0) {
					dos.write(dis.readByte());
				}
				dis.close();
			}
		} catch (IOException e) {
			System.out.println("IOException error.");
			return -1;
		}
		return (int) f.length();
	}
}
