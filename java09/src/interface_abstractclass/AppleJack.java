package interface_abstractclass;

// AppleJack은 IphoneJack 인터페이스의 규칙에 따라 구현(implements)
public class AppleJack implements IphoneJack {
	
	@Override
	public void makeFlat() {
		System.out.println("흰색으로 납작하게 만들다");
	}

	@Override
	public void make2cm() {
		System.out.println("긴 줄을 사용하여 2cm로 만들다");
	}

}
