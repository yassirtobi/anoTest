package aneo.outils.interfaces;

public interface Validator {

	boolean isOpeningChar(char currentChar);

	boolean isClosingChar(char currentChar);

	boolean areTwin(char head, char currentChar);
	
	public boolean isValid(String str);  

}
