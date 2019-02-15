package aneo.business;

import java.util.Stack;

import aneo.outils.interfaces.Validator;

public class ExpressionTreatment {

	   
	
	private Validator validator ;

	
	public ExpressionTreatment(Validator validator) {
		super();
		this.validator = validator;
	}

	public boolean check(String str) {
		
		if( str == null || str.isEmpty()) return true;
		
		if (!validator.isValid(str)) return false;
		
		Stack<Character> stackOfChar = new Stack<>();
		
		for(int i = 0 ; i<str.length() ; i++)
		{
			char currentChar=str.charAt(i);
			
			if( validator.isOpeningChar(currentChar) ) { stackOfChar.push(currentChar);  continue;}
			
			if( validator.isClosingChar(currentChar) )
			{
				if (stackOfChar.isEmpty()) return false; 
				
				char head = stackOfChar.pop(); 
				
				if(! validator.areTwin(head,currentChar ) ) return false;
			}
			   	
			
		}
	
		return stackOfChar.isEmpty();
	}



}
