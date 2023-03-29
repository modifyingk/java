package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClients {

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 100; i++) {
			// 클라이언트가 서버에 접속을 승인받으면
			// 양쪽에 소켓이 생성
			Socket socket = new Socket("localhost", 9100);
			System.out.println("클라이언트가 접속함 >> " + i);
			// input 스트림을 통해 가지고 와서 임시 기억장치에 넣어두자
			// stream(1byte) --스트림리더(브릿지 클래스)--> 임시기억장치(2byte)
			BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));	
			/* 위의 코드와 같은 코드. 아래의 코드를 한 번에 쓰면 위의 코드
			InputStream input = socket.getInputStream();
			InputStreamReader reader = new InputStreamReader(input);
			BufferedReader reader2 = new BufferedReader(reader);
			*/
			String data = buffer.readLine(); // 한 줄 씩 가지고 올 수 있음 (2바이트여야함)
			System.out.println("서버에서 받아온 데이터는 " + data);
		}
	}

}
