package arraybasic;

public class Practice02 {

	public static void main(String[] args) {
		String[] trip = {"제주도", "부산", "강원도", "일본", "괌"};
		char[] color = {'빨', '주', '노', '초', '파'};
		double[] height = {160.2, 161.3, 167.5, 175.1, 180.6};
		
		System.out.println("좋아하는 여행지");
		for (int i = 0; i < trip.length; i++) {
			System.out.println((i + 1) + ". " + trip[i]);
		}
		
		System.out.println("-----------");
		
		System.out.println("좋아하는 색깔");
		for (int i = 0; i < trip.length; i++) {
			System.out.println((i + 1) + ". " + color[i]);
		}
		
		System.out.println("-----------");
		
		System.out.println("좋아하는 키");
		for (int i = 0; i < trip.length; i++) {
			System.out.println((i + 1) + ". " + height[i]);
		}
	}

}
