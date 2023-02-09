package Test3;

public class MoveSpecialCharacter{
	private String str;

	public MoveSpecialCharacter(String str) {
		this.str = str;
	}

	public String getMoveSpecialCharacter() 
	{
		String sc = str.replaceAll("[A-Za-z0-9]","");
		String a = str.replaceAll("[^A-Za-z0-9]","");
		return a+sc;
	}

	public void setMoveSpecialCharacter(String m) {
		this.str = str;
	}

	
}