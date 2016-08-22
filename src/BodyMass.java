import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class BodyMass {

	public static void main(String[] args) {

		String massString = JOptionPane.showInputDialog("Enter Body Mass in pounds");
		double bodyMass = Double.parseDouble(massString);

		double pounds = 2.2;
		double bodyMassKG;
		bodyMassKG = bodyMass / pounds;

		String bodyHeight = JOptionPane.showInputDialog("Enter Body Height in feet");
		double height = Double.parseDouble(bodyHeight);

		String bodyHeight2 = JOptionPane.showInputDialog("Enter Body Height in inches	");
		double height2 = Double.parseDouble(bodyHeight2);

		double heightInMetres;
		heightInMetres = ((height * 12) + height2) * 0.0254;

		double BMI = bodyMassKG / heightInMetres * heightInMetres;

		// import NumberFormat: create new formatter to DecimalFormat(import)
		// ("#0.00:add more 0 for more decimal points")
		NumberFormat formatter = new DecimalFormat("#0.00");
		JOptionPane.showMessageDialog(null, "Your Body Mass Index is: " + formatter.format(BMI));
		if (BMI < 18.5) {
			JOptionPane.showMessageDialog(null, "You are Underweight ");
		} else if ((BMI >= 18.5) && (BMI < 25)) {
			JOptionPane.showMessageDialog(null, " You have Normal Weight ");
		} else if ((BMI >= 25) && (BMI < 30)) {
			JOptionPane.showMessageDialog(null, "You are Overweight");
		} else {
			JOptionPane.showMessageDialog(null, "You are Obese");
		}
		
		System.exit(0);
	}

}
