package behavioral.interpreter;

public class NonTerminalExpression extends AbstractExpression {

	@Override
	public void interprete(Context context) {
		System.out.println("NonTerminalExpression.interprete()");
	}

}
