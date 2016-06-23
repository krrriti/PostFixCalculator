package com.bitwise.postfixcalculator;

import org.junit.Assert;
import org.junit.Test;

public class PostFixCalculatorTests {


	@Test(expected = InvalidExpressionExcpetion.class)
	public void itShouldNotAcceptNullExpr() throws Exception {
		int result = PostFixCalculatorApplication.eval(null);
	}
	@Test(expected = InvalidExpressionExcpetion.class)
	public void itShouldNotAcceptBlankExpr() throws Exception {
		int result = PostFixCalculatorApplication.eval("");
	}
	@Test(expected = InvalidExpressionExcpetion.class)
	public void itShouldNotAcceptBlankExprWithSpaces() throws InvalidExpressionExcpetion {
		int result = PostFixCalculatorApplication.eval("   ");
	}
	@Test(expected = InvalidExpressionExcpetion.class)
	public void itShouldNotAcceptExprWithoutOperator() throws InvalidExpressionExcpetion {
		int result = PostFixCalculatorApplication.eval("2 5");
	}
	@Test(expected = InvalidExpressionExcpetion.class)
	public void itShouldNotAcceptExprWithOnlyOneOperand() throws InvalidExpressionExcpetion {
		int result = PostFixCalculatorApplication.eval("2 +");
	}
	@Test(expected = InvalidExpressionExcpetion.class)
	public void itShouldNotAcceptExprWithNoSpace() throws InvalidExpressionExcpetion {
		int result = PostFixCalculatorApplication.eval("2124+");
	}
	@Test
	public void itShouldBeAbleToAddTwoOperands() throws InvalidExpressionExcpetion {
		int result = PostFixCalculatorApplication.eval("1 2 +");
		Assert.assertEquals(3, result);
	}@Test
	public void itShouldBeAbleToSubtractOneOperandFromAnother() throws InvalidExpressionExcpetion {
		int result = PostFixCalculatorApplication.eval("3 2 -");
		Assert.assertEquals(1, result);
	}
	@Test
	public void itShouldBeAbleToMultiplyTwoOperands() throws InvalidExpressionExcpetion {
		int result = PostFixCalculatorApplication.eval("2 2 *");
		Assert.assertEquals(4, result);
	}@Test
	public void itShouldBeAbleToDivideOneOperandByAnother() throws InvalidExpressionExcpetion {
		int result = PostFixCalculatorApplication.eval("4 2 /");
		Assert.assertEquals(2, result);
	}
}
