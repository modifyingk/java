package interface_abstractclass;

public class BananaComputer implements Computer {

	@Override
	public void turnOn() {
		System.out.println("컴퓨터를 천천히 켜다");
	}

	@Override
	public void internet() {
		System.out.println("인터넷을 천천히 접속하다");
	}

	@Override
	public void turnOff() {
		System.out.println("컴퓨터를 천천히 끄다");
	}

}
