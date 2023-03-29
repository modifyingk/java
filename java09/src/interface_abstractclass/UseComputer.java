package interface_abstractclass;

public class UseComputer {

	public static void main(String[] args) {
		AppleComputere apple = new AppleComputere();
		BananaComputer banana = new BananaComputer();
		
		System.out.println("Apple Computer");
		apple.turnOn();
		apple.internet();
		apple.turnOff();
		
		System.out.println("-------------------");
		
		System.out.println("Banana Computer");
		banana.turnOn();
		banana.internet();
		banana.turnOff();
	}

}
