package arrayapply;

public class Array3 {

	public static void main(String[] args) {
		String[] name = {"아버지", "어머니", "형", "나", "동생"};
		int[] age = {50, 48, 23, 20, 12};
		double[] height = {178.5, 158.2, 180.5, 160.5, 150.2};
		
		System.out.println(name[3] + " " + age[3] + " " + height[3]);
		System.out.println("======================");
		
		System.out.println("우리집 식구 정리");
		System.out.println("----------------------");
		System.out.println("이름\t나이\t키");
		System.out.println("----------------------");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(name[i] + "\t" + age[i] + "\t" + height[i]);
		}
	}

}