package com.bitwise.postfixcalculator;

import java.util.StringTokenizer;

public class PostFixCalculatorApplication {

	public static int eval(String expr) throws InvalidExpressionExcpetion {

		if (null == expr || "".equals(expr.trim())) {
			System.out.println("Null or Blank");
			throw new InvalidExpressionExcpetion();
		}
		if ((expr.indexOf('+') != -1) && (expr.indexOf('-') != -1) && (expr.indexOf('*') != -1)
				&& (expr.indexOf('/') != -1)) {
			System.out.println("No operator");
			throw new InvalidExpressionExcpetion();
		}
		if ((expr.length() < 5)) {
			System.out.println("less operands");
			throw new InvalidExpressionExcpetion();
		}
		if(expr.indexOf(" ")== -1)
		{
			System.out.println("No Space");
			throw new InvalidExpressionExcpetion();
		}
		if(!(expr.indexOf(" ")!= -1 && expr.substring(expr.indexOf(" ")+1).indexOf(" ")!= -1))
		{
			System.out.println("less operands");
			throw new InvalidExpressionExcpetion();
		}
		
		StringTokenizer tokenizer = new StringTokenizer(expr, " ");
		int operand1=0,operand2=0;
		try
		{
			 operand1 = Integer.parseInt(tokenizer.nextToken());
			 operand2 = Integer.parseInt(tokenizer.nextToken());
		}
		catch(Exception e)
		{
			throw new InvalidExpressionExcpetion();
		}
		String operator = tokenizer.nextToken();
		int result = 0;
		switch (operator) {
		case "+":
			result = operand1 + operand2;
			break;
		case "-":
			result = operand1 - operand2;
			break;
		case "*":
			result = operand1 * operand2;
			break;
		case "/":
			result = operand1 / operand2;
			break;
		}
		return result;
	}

}
