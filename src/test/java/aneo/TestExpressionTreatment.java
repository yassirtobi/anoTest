package aneo;



import org.junit.Test;

import aneo.business.ExpressionTreatment;
import aneo.outils.implementations.ValidatorImplementation;
import aneo.outils.interfaces.Validator;

import static org.junit.Assert.*;

public class TestExpressionTreatment {

	 
	
    @Test
    public void TestSequenceOfParenthesesBracketsEmpty()  {
    	
    	Validator	validator = new ValidatorImplementation();
    	
    	ExpressionTreatment expressionValidator= new  ExpressionTreatment(validator);
    	assertEquals(expressionValidator.check("") , true );
    }

    
    @Test
    public void TestSequenceOfParenthesesBracketsNull()  {
    	
    	Validator	validator = new ValidatorImplementation();
    	ExpressionTreatment expressionValidator= new  ExpressionTreatment(validator);
    	assertEquals(expressionValidator.check(null) , true );
    }
    
    @Test
    public void TestSequenceOfParenthesesBrackets()  {
    	
    	Validator	validator = new ValidatorImplementation();
    	ExpressionTreatment expressionValidator= new  ExpressionTreatment(validator);
    	assertEquals(expressionValidator.check("[()]") , true );
    
    }

    @Test
    public void TestSequenceOfParenthesesBrackets1()  {
    	
    	Validator	validator = new ValidatorImplementation();
    	ExpressionTreatment expressionValidator= new  ExpressionTreatment(validator);
    	
    	assertEquals(expressionValidator.check("(()[])") , true );
    
    }
    @Test
    public void TestSequenceOfParenthesesBrackets2()  {
    	
    	Validator	validator = new ValidatorImplementation();
    	ExpressionTreatment expressionValidator= new  ExpressionTreatment(validator);
    	StringBuilder str = new StringBuilder();
    	
    	for(int i=0 ; i<10000 ; i++)
    	str.append("[()]");
    	
    	assertEquals(expressionValidator.check(str.toString()) , true );
    
    }
    
    @Test
    public void TestSequenceOfParenthesesBrackets3()  {
    	
    	Validator	validator = new ValidatorImplementation();
    	ExpressionTreatment expressionValidator= new  ExpressionTreatment(validator);
    	assertEquals(expressionValidator.check("([)]") , false );
    
    }
    
    @Test
    public void TestSequenceOfParenthesesBrackets4()  {
    	
    	Validator	validator = new ValidatorImplementation();
    	ExpressionTreatment expressionValidator= new  ExpressionTreatment(validator);
    	assertEquals(expressionValidator.check("((") , false );
    
    }


    
}
