package behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

public class InterpreterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context context = new Context();

		List<AbstractExpression> expressionList = new ArrayList<AbstractExpression>();

		expressionList.add(new TerminalExpression());
		expressionList.add(new NonTerminalExpression());
		expressionList.add(new TerminalExpression());
		expressionList.add(new TerminalExpression());
		
		for (AbstractExpression expression : expressionList) {
			expression.interprete(context);
		}
	}

}
