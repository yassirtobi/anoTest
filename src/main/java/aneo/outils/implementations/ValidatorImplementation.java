package aneo.outils.implementations;

import aneo.outils.interfaces.Validator;

public class ValidatorImplementation implements Validator {

	private static final String REGEX_ENTRY = "[\\[\\]\\(\\)]*";
  
	@Override
	public boolean isOpeningChar(char character) {
		if(character=='(' || character == '[' ) return true;
		
		return false;
	}

	@Override
	public boolean isClosingChar(char character) {
		if( character==')' || character == ']' ) return true;
		
		return false;
	}

	@Override
	public boolean areTwin(char character1, char character2) {
        if( ( character1 == '(' &&  character2 ==')' ) ||  (  character1 == '[' &&  character2 ==']'  ) ) return true;
		
        return false;
	}
	
	public boolean isValid(String str)
	{
		return str.matches(REGEX_ENTRY);
		
	}
	


}
