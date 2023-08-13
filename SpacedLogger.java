package Week05;

public class SpacedLogger implements Logger{

	@Override
	public void log(String word) {
		StringBuilder log = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			log.append(word.charAt(i)).append(" ");
		}
		System.out.println(log);
	}

	@Override
	public void error(String word) {
		StringBuilder error = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			error.append(word.charAt(i)).append(" ");
		}
		System.out.println("ERROR: " + error);
	}
	
	
}
