package arrayapply;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TwoDArray {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 200);
		
		String[] header = {"a", "b", "c"};
		String[][] contents = {
				{"1", "2", "3"},
				{"1", "2", "3"},
				{"1", "2", "3"},	
				{"1", "2", "3"},	
				{"1", "2", "3"},	
				{"1", "2", "3"},	
				{"1", "2", "3"},	
				{"1", "2", "3"},	
				{"1", "2", "3"},	
				{"1", "2", "3"},	
				{"1", "2", "3"}
		};
		
		contents[0][0] = "999";
		contents[7][1] = "999";
		
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		
		f.setVisible(true);
		
		// contents.length : 1차원 배열의 개수(11개)
		// 이중 for문
		for (int i = 0; i < contents.length; i++) {	// 행
			for (int j = 0; j < contents[i].length; j++) {	// 열
				System.out.print(contents[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
