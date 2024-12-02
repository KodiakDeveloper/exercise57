package bookExercises;

import javax.swing.JOptionPane;

public class Ex57 {

	public static void main(String[] args) {

		String[] daysWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

		Double[][] temperatures = new Double[7][2];

		int lines = 7, column = 1, count = 0;

		Double userTemperature, arithmeticMean, sum = 0.0;

		String userAnswer;

		do {

			for (int i = 0; i < lines; i++) {

				for (int j = 0; j < column; j++) {

					userTemperature = Double
							.parseDouble(JOptionPane.showInputDialog(null, "Input temperature of : " + daysWeek[i]));

					temperatures[i][j] = userTemperature;

					JOptionPane.showMessageDialog(null, "Temperature of " + daysWeek[i] + " " + temperatures[i][j]);

					sum += temperatures[i][j];

				}

			}

			arithmeticMean = sum / lines;

			JOptionPane.showMessageDialog(null,
					"The average temperature for this week : " + Math.round(arithmeticMean));

			for (int i = 0; i < lines; i++) {

				for (int j = 0; j < column; j++) {

					if (temperatures[i][j] > arithmeticMean) {

						count++;
					}

				}

			}

			JOptionPane.showMessageDialog(null, count + " values are higher than the average temperature of the week.");

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue? (Yes / No) ");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!!");

	}

}
