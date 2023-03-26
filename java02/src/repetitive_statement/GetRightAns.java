package repetitive_statement;

import java.util.Random;

import javax.swing.JOptionPane;

public class GetRightAns {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(100);	// 0~99까지 숫자
		
		int count = 0;	// 누적시켜주는 변수의 선언은 반복문 안에 넣지않음
		int error = 0;
		
		while (true) {	// while(true) : 무한루프
			String data = JOptionPane.showInputDialog("생각한 숫자 입력");
			count = count + 1;	// count++; (증감연산자, 1씩 증가/감소)
			int data2 = Integer.parseInt(data);
			
			if (data2 == target) {
				System.out.println("정답입니다 !!!");
				//break;	// 무한루프 끝내기 (이 break는 if의 break가 아니라 while의 break!)
				System.out.println("정답은 " + target);
				System.out.println("전체 시도 횟수는 " + count);
				System.out.println("틀린 횟수는 " + error);
				System.exit(0);	// 정답 맞추기 프로그램 종료
			} else {
				System.out.println("땡 ~");
				error++;
				// 입력한 값이 정답보다 큰지 작은지 알려주기
				if (data2 > target) {
					System.out.println("너무 커요!");
				} else {
					System.out.println("너무 작아요!");
				}
			}	
		} // while
		
		//JOptionPane.showMessageDialog(null, "다음에 또 방문해주세요~!");
		
	} // main

} // class
