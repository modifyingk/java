package interface_abstractclass;

public class MakeIphoneJack {

	public static void main(String[] args) {
		AppleJack apple = new AppleJack();
		BananaJack banana = new BananaJack();
		
		apple.makeFlat();
		apple.make2cm();
		
		banana.makeFlat();
		banana.make2cm();
	}

}
