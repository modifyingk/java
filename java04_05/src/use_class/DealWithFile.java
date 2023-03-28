package use_class;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class DealWithFile {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("날짜입력");
		String s2 = JOptionPane.showInputDialog("제목입력");
		String s3 = JOptionPane.showInputDialog("내용입력");
		
		// 외부에 연결할 때 파일 없을 수도 있음 -> 위험!
		// 위험한 상황이면 프로그램이 안 돌아감
		// -> 그런 상황일 때 어떻게 대응할 것인지 적어줘야함
		
		// 자바 프로그램 밖에 있는 자원들(네트워크, db프로그램, 파일 ...)을 연결할 때는
		// 프로그램이 실행되는 못하는 위험한 상황으로 인식해서
		// 반드시 위험한 상황이 발생했을 때 어떻게 처리할 것인지를 명시해줘야함
		// try ~ catch
		try {
			// file.txt와 자바프로그램간 stream(강물, 연결통로) 만들기
			FileWriter file = new FileWriter(s1 + ".txt");
			
			// stream을 통해 데이터 보내기
			file.write(s1 + "\n");
			file.write(s2 + "\n");
			file.write(s3 + "\n");

			// stream이 닫힐 때 데이터를 다 보냈다고 인식
			file.close();
		} catch (IOException e) {
			System.out.println("파일 저장 중 에러 발생!");
		}
	}

}