package constructor;

public class Computer {
	String company;
	int price;
	int size;
	
	public Computer(String company, int price, int size) {
		this.company = company;
		this.price = price;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Computer [company=" + company + ", price=" + price + ", size=" + size + "]";
	}
	// Source -> Generate toString() 클릭하면 toString() 메서도 자동생성
	
}
