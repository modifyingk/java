package interface_abstractclass;

public class BananaJack implements IphoneJack {

	@Override
	public void makeFlat() {
		System.out.println("검정색으로 납작하게 만들다");
	}

	@Override
	public void make2cm() {
		System.out.println("짧은 줄을 사용하여 2cm로 만들다");
	}

}
