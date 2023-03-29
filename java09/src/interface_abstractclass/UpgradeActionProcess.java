package interface_abstractclass;

public class UpgradeActionProcess implements MyAction {

	@Override
	public void click() {
		System.out.println("보안강화된 상태로 인터넷으로 연결 처리 구현");
	}

	@Override
	public void dbClick() {
		System.out.println("화면에 경고메시지를 띄운 후 화면을 닫는 처리 구현");
	}

}
