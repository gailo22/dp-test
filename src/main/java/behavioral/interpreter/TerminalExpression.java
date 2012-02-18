package behavioral.interpreter;

public class TerminalExpression extends AbstractExpression {

	@Override
	public void interprete(Context context) {
		System.out.println("TerminalExpression.interprete()");
	}

}
