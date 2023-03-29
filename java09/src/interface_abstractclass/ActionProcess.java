package interface_abstractclass;

// ActionProcess 클래스는 MyAction에 정의된 기능을 구현해서 만든다
public class ActionProcess implements MyAction {

	@Override
	public void click() {
		System.out.println("클릭하면 인터넷으로 연결하는 처리 구현");
	}

	@Override
	public void dbClick() {
		System.out.println("더블클릭하면 화면을 닫는 처리 구현");
	}

}
