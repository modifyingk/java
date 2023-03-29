package network;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.xml.soap.SOAPException;

public class MessengerB extends JFrame{
	DatagramSocket socket;
	JTextArea list; //채팅 내용 리스트
	JTextField input; //채팅 내용 입력
	
	public MessengerB() throws Exception {
		//받는 소켓
		socket = new DatagramSocket(5555);
		setTitle("MessengerB");
		setSize(400, 500);
		list = new JTextArea();
		input = new JTextField();
		
		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		
		Font font = new Font("나눔고딕", Font.BOLD, 20);
		list.setFont(font);
		input.setFont(font);
		
		list.setBackground(new Color(255, 246, 186));
		input.setBackground(new Color(225, 229, 237));
		
		list.setForeground(new Color(45, 60, 89));
		
		//list은 수정불가
		list.setEditable(false);
		
		                      //new 익명클래스(){}
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//list append
				list.append("나 >> " + input.getText() + "\n");
				
				//socket을 만들어서 packet을 보냄.
				try {
					DatagramSocket socket = new DatagramSocket();
					
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					String str = input.getText();
					byte[] data = str.getBytes();
					
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7777);
					
					socket.send(packet);
					socket.close();
					
					input.setText("");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		setVisible(true);
		
	}
	
	public void process() throws Exception {
		while (true) {
			byte[] data = new byte[256];
			
			DatagramPacket packet = new DatagramPacket(data, data.length);
			socket.receive(packet);
			
			list.append("상대방 >> " + new String(data) + "\n");
			
			//socket.close();
		}
	}
	public static void main(String[] args) throws Exception {
		MessengerB name = new MessengerB();
		name.process();//받는 쪽 먼저 실행!!
	}
}
