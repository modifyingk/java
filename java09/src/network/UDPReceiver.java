package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		// UDP 받는 부붐부터 먼저 실행시켜야 함
		// UDP용 소켓을 생성
		DatagramSocket socket = new DatagramSocket(7100);
		
		// 받을 때 byte 배열로 받음
		// 미리 받아서 집어넣을 byte 배열을 만들어놓아야 함
		byte[] data = new byte[256];
		
		// 받을 패킷을 만들어둠
		DatagramPacket packet = new DatagramPacket(data, data.length);
		System.out.println("udp 받을 준비중...");
		
		// 패킷을 받음
		socket.receive(packet);
		
		// 받은 데이터를 스트링을 변환해서 프린트
		System.out.println(new String(data));
		
		socket.close();
	}

}
