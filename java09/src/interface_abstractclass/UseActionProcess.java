package interface_abstractclass;

public class UseActionProcess {

	public static void main(String[] args) {
		ActionProcess action1 = new ActionProcess();
		UpgradeActionProcess action2 = new UpgradeActionProcess();
		action1.click();
		action1.dbClick();
		
		action2.click();
		action2.dbClick();
	}

}
