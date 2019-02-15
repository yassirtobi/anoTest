package aneo;



import org.junit.Test;

import aneo.outils.implementations.ValidatorImplementation;
import aneo.outils.interfaces.Validator;

import static org.junit.Assert.*;

public class TestExpressionValidator {

	 

    @Test
    public void TestSequenceOfParenthesesBracketsRegex()  {
    	
    	Validator	validator = new ValidatorImplementation();
    	
    	assertEquals(validator.isValid("((]]((]][[]]]]]]]))))))((([[[") , true );

    }

    
    @Test
    public void TestSequenceOfParenthesesBracketsRegexWithAlpha()  {
    	
    	Validator	validator = new ValidatorImplementation();
    	
    	assertEquals(validator.isValid("((]]((]][[]]]]a]]]))))))((([[[") , false );

    }
}
