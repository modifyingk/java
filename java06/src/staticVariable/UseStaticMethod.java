package staticVariable;

import javax.swing.JOptionPane;

public class UseStaticMethod {

	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog("숫자입력");
		// public static String showInputDialog(String s2) {
		// 		return "~~~";
		// }
		
		int n = Integer.parseInt(s);
		// public static int parseInt(String s3) {
		// 		return ~~;
		// }
		
		System.exit(0);
	}

}
