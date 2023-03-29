package interface_abstractclass;

public interface MyAction {
	public abstract void click();	// 추상메서드 : 처리하는 내용 X
	public abstract void dbClick();
	// 일반변수 사용 불가능, 공유할 목적으로 만든 상수만 가능
}
