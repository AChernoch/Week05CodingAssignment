package Week05;

public class AsteriskLogger implements Logger{
	
	@Override
	public void log(String word) {
		System.out.println("***" + word + "***\n");
	}

	@Override
	public void error(String word) {
		System.out.println("*************************");
		System.out.println("***ERROR: " + word + "***");
		System.out.println("*************************");
	}

	
}
