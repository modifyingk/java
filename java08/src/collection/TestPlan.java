package collection;

import java.util.LinkedList;

public class TestPlan {

	public static void main(String[] args) {
		LinkedList subject = new LinkedList();

		subject.add("국어");
		subject.add("수학");
		subject.add("영어");
		subject.add("컴퓨터");

		System.out.println("전체 시험 볼 과목 : " + subject);
		subject.remove();
		System.out.println("1일차 시험 후 남은 과목 : " + subject);
		subject.remove();
		System.out.println("2일차 시험 후 남은 과목 : " + subject);
		subject.remove();
		System.out.println("3일차 시험 후 남은 과목 : " + subject);
	}

}
