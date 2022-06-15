import java.awt.Color;

public class RecursiveFill {
	public static final int WIDTH = 1000, HEIGHT = 600;
	public static final int MIN_SIZE = 20;
	public static final int MIN_SIZE_BONUS = 10;

	public static void main(String[] args) {
		StdDraw.setCanvasSize(WIDTH, HEIGHT);
		StdDraw.show(0);
		recursiveRectangleFill(0, 1, 0, 1);
		// recursiveBonus(0.5,0,0.1); //comment-out whichever line you're not working on
		StdDraw.show(0);
	}

	public static void recursiveRectangleFill(double minX, double maxX, double minY, double maxY) {
		double w = maxX - minX;
		double h = maxY - minY;

		if (w * WIDTH < MIN_SIZE || h * HEIGHT < MIN_SIZE)
			return;

		StdDraw.setPenColor(randomColor(), randomColor(), randomColor());

		StdDraw.filledRectangle(minX + w / 2, minY + h / 2, w / 8, h / 8);
		double newMinX, newMaxX, newMinY, newMaxY;
		newMinX = minX;
		newMaxX = maxX;
		newMinY = minY;
		newMaxY = maxY;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				newMinX = minX + i * (w / 2);
				newMaxX = newMinX + (w / 2);
				newMinY = minY + j * (h / 2);
				newMaxY = newMinY + (h / 2);
				recursiveRectangleFill(newMinX, newMaxX, newMinY, newMaxY);
			}
		}

	}

	public static int randomColor() {
		return (int) ((Math.random()) * 255);
	}

	public static void recursiveBonus(double centerX, double centerY, double radius) {

		/* YOUR CODE HERE */

	}

}
