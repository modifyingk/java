package interface_abstractclass;

public class AppleComputere implements Computer {

	@Override
	public void turnOn() {
		System.out.println("컴퓨터를 빠르게 켜다");
	}

	@Override
	public void internet() {
		System.out.println("인터넷을 빠르게 접속하다");
	}

	@Override
	public void turnOff() {
		System.out.println("컴퓨터를 빠르게 끄다");
	}

}
